package shindra.laniakea.MovieApi.Manager;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import shindra.laniakea.MovieApi.IMovieDbRetroFitCall;
import shindra.laniakea.MovieApi.RawData.RawFilm;
import shindra.laniakea.MovieApi.RawData.RawGenre;
import shindra.laniakea.MovieApi.RawDataBuilder.Builder;
import shindra.laniakea.MovieApi.RawDataBuilder.BuilderManager;
import shindra.laniakea.MovieApi.RawDataBuilder.RawFilmsBuilder;
import shindra.laniakea.MovieApi.RawDataBuilder.RawGenreBuilder;
import shindra.laniakea.MovieApi.RetrofitBuilder;
import shindra.laniakea.MovieApi.UsableData.Film;
import shindra.laniakea.MovieApi.UsableData.Genre;

/**
 * Created by Guillaume on 30/01/2018.
 */

public class ApiManager implements Handler.Callback  {
    private ArrayList<Genre> lGenres;
    private ArrayList<Film> lFilms;
    private BuilderManager rawDataBuilder;
    private Handler handler;
    private IMovieDbRetroFitCall retrofit;
    private static int NB_GENRE;
    private static int NB_GENRE_REMAINING_To_FETCH;


    public ApiManager(){
        lGenres = new ArrayList<>();
        rawDataBuilder = BuilderManager.getInstance();
        handler = new Handler(this);
        retrofit = RetrofitBuilder.getRequestApiInterface();
        lFilms = new ArrayList<>();

    }


    public void fetchApiData(){
        rawDataBuilder.submitBuilder(new RawGenreBuilder(handler,retrofit));
    }


    @Override
    public boolean handleMessage(Message msg) {


        switch(msg.what){
            case Builder.RAW_FILM:
                Log.i("ApiManager" ,"a set of raw films is here");

                RawFilm rawFilm = (RawFilm) msg.obj;
                lFilms.addAll(rawFilm.getResults());

               if(--NB_GENRE_REMAINING_To_FETCH ==0){
                   Log.i("ApiManager" ,"All raw films are there");
                   sortFilm();

               }

                break;

            case Builder.RAW_GENRE:
                Log.i("ApiManager" ,"all genre are here");
                RawGenre rawGenre = (RawGenre) msg.obj;
                lGenres.addAll(rawGenre.getGenres());
                fetchFilmPerGenre();
                break;
        }

        return false;
    }

    private void fetchFilmPerGenre(){
        //Genre genre = lGenres.get(0);

        //rawDataBuilder.submitBuilder(new RawFilmsBuilder(handler,genre.getId()));
        for(Genre genre : lGenres){
            rawDataBuilder.submitBuilder(new RawFilmsBuilder(handler,genre.getId(),retrofit));
            NB_GENRE ++;
        }

        NB_GENRE_REMAINING_To_FETCH = NB_GENRE;

    }

    //Each film can be in multiple genre. We have to sort to avoid multiple instance of the same object.
    private void sortFilm(){

        Film aFilmToCheck;
        int filmIdToCheck;

        Film currentFilm;
        int currentFilmId;

        Log.i("ApiManager" ,"sorting started");

        for(int i = 0; i <= lFilms.size() -1; i++){

            aFilmToCheck = lFilms.get(i);
            filmIdToCheck = aFilmToCheck.getId();

            //Start at i+1 to avoid deleting the current film
            for(int y = i+1;y <= lFilms.size() -1 ; y++){

                currentFilm = lFilms.get(y);
                currentFilmId = currentFilm.getId();

                if(currentFilmId == filmIdToCheck){
                    Log.i("ApiManager" ,"Duplicates found for film id : "+ Integer.toString(filmIdToCheck));
                    lFilms.remove(currentFilm);
                }


            }
        }

    }



}
