package shindra.laniakea.RoomDb.DBHandler.Retriever;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.util.ArrayList;

import shindra.laniakea.App;
import shindra.laniakea.MovieApi.DataUsable.Film;
import shindra.laniakea.MovieApi.Manager.ApiManager;
import shindra.laniakea.RoomDb.Db.RoomConverter;

/**
 * Created by Guillaume on 31/01/2018.
 */

public class DBFilmRetriever extends DBRetrieverHandler<Film> {



    public DBFilmRetriever(Handler handler) {
        super(ApiManager.FILM_RETRIEVER_HANDLER,handler);
    }

    private  ArrayList<Film> convertToObject(ArrayList<Film> lFilm){
        for (Film f : lFilm){
            f.setGenreIds(RoomConverter.fromStringToInteger(f.getGenresIdInString()));
            //f.setlCast(RoomConverter.fromStringToCast(f.getCastInString()));
        }

        return  lFilm;
    }

    @Override
    protected ArrayList<Film> retrievedAllData() {

        ArrayList<Film> films = (ArrayList<Film>) App.get().getFilmDb().filmDao().getAll();

        //reverse genreids
        films = convertToObject(films);

        Log.d("Film retrive size", Integer.toString(films.size()));

        return films;
    }

    @Override
    protected Message getMessage(Message message, ArrayList<Film> dataRetrieved) {
        message.obj = dataRetrieved;
        return message;
    }


}
