package shindra.laniakea.RoomDb.Db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import shindra.laniakea.MovieApi.DataUsable.Film;
import shindra.laniakea.RoomDb.Dao.FilmDao;

/**
 * Created by Guillaume on 31/01/2018.
 */

@Database(entities = {Film.class}, version = 2,exportSchema = false)

public abstract class FilmDb extends RoomDatabase  {
        public abstract FilmDao filmDao();

}
