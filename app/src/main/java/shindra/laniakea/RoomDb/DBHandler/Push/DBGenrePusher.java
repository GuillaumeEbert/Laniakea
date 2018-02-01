package shindra.laniakea.RoomDb.DBHandler.Push;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.util.ArrayList;

import shindra.laniakea.App;
import shindra.laniakea.MovieApi.DataUsable.Genre;
import shindra.laniakea.MovieApi.Manager.ApiManager;

/**
 * Created by Guillaume on 31/01/2018.
 */

public class DBGenrePusher extends DBPushHandler<Genre> {


    public DBGenrePusher( Handler handler, ArrayList<Genre> lToPush) {
        super(ApiManager.GENRE_PUSH_HANDLER, handler,lToPush);
    }

    @Override
    protected ArrayList<Genre> getDataFromDb() {
        return (ArrayList<Genre>) App.get().getGenreDb().genreDao().getAll();
    }

    @Override
    protected void dataToInsert(ArrayList<Genre> newDataToInsert) {
        App.get().getGenreDb().genreDao().insertAll(newDataToInsert);


    }

    @Override
    protected void dataToUpdate(ArrayList<Genre> dataToUpdate) {
        for(Genre genre : dataToUpdate){
            App.get().getGenreDb().genreDao().update(genre);
        }

    }

    @Override
    protected Message buildMessageForHandler(Message handlerMgs) {
        return handlerMgs;
    }


}
