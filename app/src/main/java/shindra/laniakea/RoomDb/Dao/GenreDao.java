package shindra.laniakea.RoomDb.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.ArrayList;
import java.util.List;

import shindra.laniakea.MovieApi.DataUsable.Film;
import shindra.laniakea.MovieApi.DataUsable.Genre;

/**
 * Created by Guillaume on 31/01/2018.
 */

@Dao
public interface GenreDao {


    @Query("SELECT * FROM genre")
    List<Genre> getAll();

    @Query("SELECT * FROM genre WHERE id LIKE :id LIMIT 1")
    Genre findByName(int id);

    @Insert
    void insertAll(List<Genre> film);

    @Update
    void update(Genre film);

    @Delete
    void delete(Genre film);


}


