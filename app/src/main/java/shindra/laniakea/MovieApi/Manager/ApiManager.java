package shindra.laniakea.MovieApi.Manager;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.IntDef;
import android.util.Log;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

import shindra.laniakea.Brouillons.FilmSorter;
import shindra.laniakea.Brouillons.GenreSorter;
import shindra.laniakea.MovieApi.DataRaw.RawCredit;
import shindra.laniakea.MovieApi.DataRaw.RawFilm;
import shindra.laniakea.MovieApi.DataRaw.RawGenre;
import shindra.laniakea.MovieApi.DataUsable.Cast;
import shindra.laniakea.MovieApi.DataUsable.Film;
import shindra.laniakea.MovieApi.DataUsable.Genre;
import shindra.laniakea.MovieApi.IMovieDbRetroFitCall;
import shindra.laniakea.MovieApi.RawDataBuilder.RawCreditBuilder;
import shindra.laniakea.MovieApi.RawDataBuilder.RawFilmsBuilder;
import shindra.laniakea.MovieApi.RawDataBuilder.RawGenreBuilder;
import shindra.laniakea.MovieApi.RetrofitBuilder;
import shindra.laniakea.RoomDb.DBHandler.Push.DBFilmPusher;
import shindra.laniakea.RoomDb.DBHandler.Push.DBGenrePusher;
import shindra.laniakea.RoomDb.DBHandler.Retriever.DBFilmRetriever;
import shindra.laniakea.RoomDb.DBHandler.Retriever.DBGenreRetriever;
import shindra.laniakea.Thread.ThreadManager;

/**
 * Created by Guillaume on 30/01/2018.
 */

public class ApiManager implements Handler.Callback {
    private ArrayList<Genre> lGenres;
    private ArrayList<Film> lFilms;
    private ThreadManager threadManager;
    private Handler handler;
    private IMovieDbRetroFitCall retrofit;
    private static int NB_FILM_PACK_TO_FETCH;
    private static int NB_FILM_CREDIT_TO_FETCH;
    private ApiManagerCallback callback;

    private boolean isApiGenresHere = false;
    private boolean isApiFilmsHere = false;
    private boolean isDBGenresHere = false;
    private boolean isDBFilmsHere = false;


    public ApiManager(ApiManagerCallback callback) {
        handler = new Handler(this);
        threadManager = ThreadManager.getInstance();
        retrofit = RetrofitBuilder.getRequestApiInterface();
        lGenres = new ArrayList<>();
        lFilms = new ArrayList<>();
        this.callback = callback;

    }


    public void fetchApiData() {
        threadManager.submitToken(new RawGenreBuilder(handler, retrofit));
    }

    public void fetchDataFromDb() {

        threadManager.submitToken(new DBFilmRetriever(handler));
        threadManager.submitToken(new DBGenreRetriever(handler));
    }


    @Override
    public boolean handleMessage(Message msg) {


        switch (msg.what) {
            case RAW_FILM_BUILDER_ID:
                Log.i("ApiManager", "a set of raw films is here");

                RawFilm rawFilm = (RawFilm) msg.obj;
                lFilms.addAll(rawFilm.getResults());

                if (--NB_FILM_PACK_TO_FETCH == 0) {
                    Log.i("ApiManager", "All raw films are there");

                    // Delete all duplicate film
                    FilmSorter filmSorter = new FilmSorter();
                    lFilms = filmSorter.sortFilmFromApi(lFilms);


                    NB_FILM_CREDIT_TO_FETCH = lFilms.size();
                    //Fetch credit for each film
                    for (Film f : lFilms) {
                        threadManager.submitToken(new RawCreditBuilder(handler, retrofit, f.getId()));
                    }


                    //Get NB film for each genre
                    GenreSorter gS = new GenreSorter();
                    for (Genre g : lGenres) {
                        g.setNbFilms(gS.getNbFilmPerGenre(g.getId(), lFilms));
                    }

                    //save genres in DB
                    threadManager.submitToken(new DBGenrePusher(handler, lGenres));
                }

                break;

            case RAW_GENRE_BUILDER_ID:
                Log.i("ApiManager", "all genre are here");
                RawGenre rawGenre = (RawGenre) msg.obj;
                lGenres.addAll(rawGenre.getGenres());
                fetchFilmPerGenre();
                break;


            case RAW_CREDIT_BUILDER_ID:
                int filmId = msg.arg1;
                RawCredit rawCredit = (RawCredit) msg.obj;

                if(rawCredit != null){

                    //set credit to film
                    for (Film f : lFilms) {
                        if (f.getId() == filmId) {
                            String cast ="";

                            if(rawCredit.getCast() == null) break;

                            for(int i =0 ; i <= 4; i++){
                                cast = cast + rawCredit.getCast().get(i).getName();
                                cast = cast +",";
                            }

                            f.setCast(cast);


                        }
                    }

                }

                //all film?
                if (--NB_FILM_CREDIT_TO_FETCH == 0) {
                    //save films in DB
                    threadManager.submitToken(new DBFilmPusher(handler, lFilms));
                }
                break;


            case FILM_PUSH_HANDLER:
                Log.i("ApiManager", "films are in the DB");
                isApiFilmsHere = true;
                break;


            case GENRE_PUSH_HANDLER:
                Log.i("ApiManager", "genre are in the DB");
                isApiGenresHere = true;
                break;

            case FILM_RETRIEVER_HANDLER:
                lFilms = (ArrayList<Film>) msg.obj;
                Log.i("ApiManager", "films are fetch from DB");
                isDBFilmsHere = true;
                break;

            case GENRE_RETRIEVER_HANDLER:
                lGenres = (ArrayList<Genre>) msg.obj;
                Log.i("ApiManager", "Genre are fetch from DB");
                isDBGenresHere = true;
                break;


        }

        raiseCallBack();

        return false;
    }

    private void fetchFilmPerGenre() {
        for (Genre genre : lGenres) {
            threadManager.submitToken(new RawFilmsBuilder(handler, genre.getId(), retrofit));
            NB_FILM_PACK_TO_FETCH++;
        }

    }


    private void raiseCallBack() {

        if ((isApiFilmsHere && isApiGenresHere) || isDBFilmsHere && isDBGenresHere) {
            callback.allDataAreHere();
        }

    }


    public ArrayList<Film> getAllFilmPerGenre(int genreID) {
        ArrayList<Film> filmInGenre = new ArrayList<>();
        for (Film f : lFilms) {

            for (Integer i : f.getGenreIds()) {
                if (i == genreID) filmInGenre.add(f);
            }


        }

        return filmInGenre;
    }


    public interface ApiManagerCallback {
        void allDataAreHere();
    }


    public ArrayList<Genre> getlGenres() {
        return lGenres;
    }

    public ArrayList<Film> getlFilms() {
        return lFilms;
    }

    public static final int RAW_FILM_BUILDER_ID = 0;
    public static final int RAW_GENRE_BUILDER_ID = 1;
    public static final int FILM_PUSH_HANDLER = 2;
    public static final int FILM_RETRIEVER_HANDLER = 3;
    public static final int GENRE_PUSH_HANDLER = 4;
    public static final int GENRE_RETRIEVER_HANDLER = 5;
    public static final int RAW_CREDIT_BUILDER_ID = 6;


    @IntDef({RAW_FILM_BUILDER_ID, RAW_GENRE_BUILDER_ID, FILM_PUSH_HANDLER, FILM_RETRIEVER_HANDLER, RAW_CREDIT_BUILDER_ID})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ID {

    }


}
