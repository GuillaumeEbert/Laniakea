package shindra.laniakea;

import android.app.Application;
import android.arch.persistence.room.Room;

import shindra.laniakea.MovieApi.DataUsable.Genre;
import shindra.laniakea.RoomDb.Db.FilmDb;
import shindra.laniakea.RoomDb.Db.GenreDb;

/**
 * Created by Guillaume on 31/01/2018.
 */

public class App extends Application {

    public static App INSTANCE;
    private static final String FILM_DB_NAME = "FilmDb";
    private static final String GENRE_DB_NAME = "GenreDb";



    private FilmDb filmDb;
    private GenreDb genreDb;

    public static App get() {
        return INSTANCE;
    }



    @Override
    public void onCreate() {
        super.onCreate();

        // create filmDb
        filmDb = Room.databaseBuilder(getApplicationContext(), FilmDb.class, FILM_DB_NAME)
                .build();

        //create genre db
        genreDb = Room.databaseBuilder(getApplicationContext(), GenreDb.class,GENRE_DB_NAME)
                .build();

        INSTANCE = this;

    }

    public FilmDb getFilmDb() {
        return filmDb;
    }
    public GenreDb getGenreDb() {
        return genreDb;
    }

}
