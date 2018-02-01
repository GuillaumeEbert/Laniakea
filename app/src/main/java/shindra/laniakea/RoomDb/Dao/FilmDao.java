package shindra.laniakea.RoomDb.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.ArrayList;
import java.util.List;

import shindra.laniakea.MovieApi.DataUsable.Film;

/**
 * Created by Guillaume on 31/01/2018.
 */

@Dao
public interface FilmDao {
    @Query("SELECT * FROM film")
   List<Film> getAll();

    @Query("SELECT * FROM film WHERE id LIKE :id LIMIT 1")
    Film findByName(int id);

    @Insert
    void insertAll(List<Film> film);

    @Update
    void update(Film film);

    @Delete
    void delete(Film film);


}
