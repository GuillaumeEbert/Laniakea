package shindra.laniakea.MovieApi.RawDataBuilder;

import android.os.Handler;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import shindra.laniakea.MovieApi.IMovieDbRetroFitCall;
import shindra.laniakea.MovieApi.RawData.RawFilm;

/**
 * Created by Guillaume on 30/01/2018.
 */

public class RawFilmsBuilder extends Builder<RawFilm> {

    private String sGenreId;
    private int genreId;

    public RawFilmsBuilder(Handler handler, Integer genreId,IMovieDbRetroFitCall retrofit) {
        super(handler, RAW_FILM,retrofit);
        this.sGenreId = Integer.toString(genreId);
        this.genreId = genreId;
    }

    @Override
    protected void onBuild(IMovieDbRetroFitCall retrofit) {

        Call<RawFilm> call = null;
        call = retrofit.getAllFilmPerRange(sGenreId);


        if (null != call) {

            call.enqueue(new Callback<RawFilm>() {
                @Override
                public void onResponse(Call<RawFilm> call, Response<RawFilm> response) {
                    sentToHandler(response.body());

                }

                @Override
                public void onFailure(Call<RawFilm> call, Throwable t) {
                    Log.e("RawFilmBuilder", t.toString());
                }
            });



        }

    }
}
