package shindra.laniakea.MovieApi;

import okhttp3.Callback;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import shindra.laniakea.MovieApi.RawData.RawFilm;
import shindra.laniakea.MovieApi.RawData.RawGenre;

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

    /*// USER PROFILE DATA
    @GET("/sc2/profile/user")
    Call<ResponseBody> getSC2Profile(@Query("access_token") String token);

    // BATTLENET PROFILE
    @GET("/account/user")
    Call<ResponseBody> getBattlenetProfile(@Query("access_token") String token);*/
}


//https://api.themoviedb.org/3/discover/movie?api_key=f25d7a31152cab1f253e59fabc56849d&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=1&with_genres=28