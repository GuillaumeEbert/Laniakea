package shindra.laniakea.MovieApi.DataUsable;

import android.arch.persistence.room.ColumnInfo;

/**
 * Created by Guillaume on 31/01/2018.
 */

public abstract class DataUsable {

    @ColumnInfo(name = "id")
    protected int id;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}
