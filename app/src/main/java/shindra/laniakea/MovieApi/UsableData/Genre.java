package shindra.laniakea.MovieApi.UsableData;

import java.util.ArrayList;

/**
 * Created by Guillaume on 30/01/2018.
 */

public class Genre {
     /* id : 28
            * name : Action
         */

    private int id;
    private String name;
    private ArrayList<Film> lFilms;

    public ArrayList<Film> getlFilms() {
        return lFilms;
    }

    public void setlFilms(ArrayList<Film> lFilms) {
        this.lFilms = lFilms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
