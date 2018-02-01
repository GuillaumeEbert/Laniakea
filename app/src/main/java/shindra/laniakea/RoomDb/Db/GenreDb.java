package shindra.laniakea.RoomDb.Db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import shindra.laniakea.RoomDb.Dao.FilmDao;
import shindra.laniakea.MovieApi.DataUsable.Genre;
import shindra.laniakea.RoomDb.Dao.GenreDao;

/**
 * Created by Guillaume on 31/01/2018.
 */
@Database(entities = {Genre.class}, version = 2)
public abstract class GenreDb extends RoomDatabase {
    public abstract GenreDao genreDao();

}