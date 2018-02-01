package shindra.laniakea.RoomDb.DBHandler.Retriever;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import shindra.laniakea.App;
import shindra.laniakea.MovieApi.DataUsable.Genre;
import shindra.laniakea.MovieApi.Manager.ApiManager;
import shindra.laniakea.RoomDb.DBHandler.Push.DBPushHandler;

/**
 * Created by Guillaume on 31/01/2018.
 */

public class DBGenreRetriever extends DBRetrieverHandler<Genre> {

    public DBGenreRetriever(Handler handler) {
        super(ApiManager.GENRE_RETRIEVER_HANDLER, handler);
    }



    @Override
    protected ArrayList<Genre> retrievedAllData() {

        ArrayList<Genre> t = new ArrayList<>();
        t.addAll(App.get().getGenreDb().genreDao().getAll());

        Log.d("Genre retrive size", Integer.toString(t.size()));
        return t;
    }

    @Override
    protected Message getMessage(Message message, ArrayList<Genre> dataRetrieved) {
        message.obj = dataRetrieved;
        return message;
    }


}
