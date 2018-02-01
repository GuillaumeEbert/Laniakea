package shindra.laniakea.Brouillons;

import java.util.ArrayList;

import shindra.laniakea.MovieApi.DataUsable.Film;

/**
 * Created by Guillaume on 31/01/2018.
 */

public class GenreSorter {



    public int getNbFilmPerGenre(int genreId, ArrayList<Film> lFilm){
        int i = 0;

        for(Film f :lFilm){

            for (Integer genre : f.getGenreIds()){

                if(genre == genreId) i++;

            }

        }

        return i;

    }

}
