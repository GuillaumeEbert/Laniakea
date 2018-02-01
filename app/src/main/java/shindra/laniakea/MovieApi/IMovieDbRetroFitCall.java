package shindra.laniakea.MovieApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import shindra.laniakea.MovieApi.DataRaw.RawCredit;
import shindra.laniakea.MovieApi.DataRaw.RawFilm;
import shindra.laniakea.MovieApi.DataRaw.RawGenre;

/**
 * Created by Guillaume on 30/01/2018.
 */

public interface IMovieDbRetroFitCall {

    String BASE_URL = "https://api.themoviedb.org";
    String API_KEY = "api_key=f25d7a31152cab1f253e59fabc56849d";
    String LANGUAGE = "&language=en-US";

    // GENRE DATA
    @GET("/3/genre/movie/list?" + API_KEY+LANGUAGE)
    Call<RawGenre> getAllGenre();

    // FILMS PER GENRE
    @GET("/3/genre/{genre_id}/movies?" + API_KEY + LANGUAGE + "&include_adult=false&sort_by=created_at.asc")
    Call<RawFilm> getAllFilmPerRange(@Path("genre_id") String genreId);

    @GET("/3/movie/{movie_id}/credits?" + API_KEY + LANGUAGE )
    Call<RawCredit> getFilmCredit(@Path("movie_id") String movieId);


}


//https://api.themoviedb.org/3/discover/movie?api_key=f25d7a31152cab1f253e59fabc56849d&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=1&with_genres=28