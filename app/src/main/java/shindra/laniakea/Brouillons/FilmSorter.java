package shindra.laniakea.Brouillons;

import android.util.Log;

import java.util.ArrayList;

import shindra.laniakea.MovieApi.DataUsable.Film;

/**
 * Created by Guillaume on 31/01/2018.
 */

public class FilmSorter {



    //Each film can be in multiple genre. We have to sort to avoid multiple instance of the same object.
    public ArrayList<Film> sortFilmFromApi(ArrayList<Film> listToSort){

        Film aFilmToCheck;
        int filmIdToCheck;

        Film currentFilm;
        int currentFilmId;

        Log.i("ApiManager" ,"sorting started");

        for(int i = 0; i <= listToSort.size() -1; i++){

            aFilmToCheck = listToSort.get(i);
            filmIdToCheck = aFilmToCheck.getId();

            //Start at i+1 to avoid deleting the current film
            for(int y = i+1;y <= listToSort.size() -1 ; y++){

                currentFilm = listToSort.get(y);
                currentFilmId = currentFilm.getId();

                if(currentFilmId == filmIdToCheck){
                    Log.i("ApiManager" ,"Duplicates found for film id : "+ Integer.toString(filmIdToCheck));
                    listToSort.remove(currentFilm);
                }

            }
        }

        return listToSort;
    }









}
