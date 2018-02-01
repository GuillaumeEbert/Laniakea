package shindra.laniakea.MovieApi.DataUsable;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.ArrayList;

/**
 * Created by Guillaume on 30/01/2018.
 */
@Entity(tableName = "genre")
public class Genre extends DataUsable {

    @PrimaryKey(autoGenerate = true)
    private int uid;


    private String name;


    private int nbFilms;


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbFilms() {
        return nbFilms;
    }

    public void setNbFilms(int nbFilms) {
        this.nbFilms = nbFilms;
    }
}
