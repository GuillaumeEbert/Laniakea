package shindra.laniakea.RoomDb.DBHandler.Push;

import android.os.Handler;
import android.os.Message;

import java.util.ArrayList;

import shindra.laniakea.App;
import shindra.laniakea.MovieApi.DataUsable.Film;
import shindra.laniakea.MovieApi.Manager.ApiManager;
import shindra.laniakea.RoomDb.Db.RoomConverter;

/**
 * Created by Guillaume on 31/01/2018.
 */

public class DBFilmPusher extends DBPushHandler<Film> {



    public DBFilmPusher(Handler handler, ArrayList<Film> lToPush) {
        super(ApiManager.FILM_PUSH_HANDLER,handler,lToPush);

    }



    @Override
    protected ArrayList<Film> getDataFromDb() {
        return (ArrayList<Film>) App.get().getFilmDb().filmDao().getAll();
    }

    @Override
    protected void dataToInsert(ArrayList<Film> newDataToInsert) {
        newDataToInsert = convertToString(newDataToInsert);

        App.get().getFilmDb().filmDao().insertAll(newDataToInsert);

    }

    @Override
    protected void dataToUpdate(ArrayList<Film> dataToUpdate) {
        for(Film film : dataToUpdate){
            dataToUpdate = convertToString(dataToUpdate);
            App.get().getFilmDb().filmDao().update(film);
        }
    }



    private ArrayList<Film> convertToString(ArrayList<Film> lConvert){

        RoomConverter roomConverter = new RoomConverter();
        for (Film f : lConvert){
            f.setGenresIdInString(RoomConverter.fromIntegerArrayList(f.getGenreIds()));
           // f.setCastInString(RoomConverter.fromCastArrayList(f.getlCast()));


        }

        return lConvert;
    }



    @Override
    protected Message buildMessageForHandler(Message handlerMgs) {
        return handlerMgs;
    }



}
