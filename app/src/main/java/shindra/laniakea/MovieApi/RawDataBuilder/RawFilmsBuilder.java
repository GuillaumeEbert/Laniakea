package shindra.laniakea.MovieApi.RawDataBuilder;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import shindra.laniakea.MovieApi.DataRaw.RawCredit;
import shindra.laniakea.MovieApi.DataRaw.RawFilm;
import shindra.laniakea.MovieApi.IMovieDbRetroFitCall;
import shindra.laniakea.MovieApi.Manager.ApiManager;

/**
 * Created by Guillaume on 30/01/2018.
 */

public class RawFilmsBuilder extends Builder {

    private String sGenreId;
    private RawFilm rawFilm;

    public RawFilmsBuilder(Handler handler, Integer genreId, IMovieDbRetroFitCall retrofit) {
        super(handler, ApiManager.RAW_FILM_BUILDER_ID, retrofit);
        this.sGenreId = Integer.toString(genreId);

    }

    @Override
    public void onBuild( IMovieDbRetroFitCall retrofit) {

        Call<RawFilm> call = null;

        call = retrofit.getAllFilmPerRange(sGenreId);


        if (null != call) {

            call.enqueue(new Callback<RawFilm>() {
                @Override
                public void onResponse(Call<RawFilm> call, Response<RawFilm> response) {
                    rawFilm = response.body();
                     sendMessage();

                }

                @Override
                public void onFailure(Call<RawFilm> call, Throwable t) {
                    Log.e("RawFilmBuilder", t.toString());
                }
            });
        }
    }


    @Override
    protected Message buildMessageForHandler(Message handlerMgs) {
        handlerMgs.obj = rawFilm;

        return handlerMgs;

    }

   /* private void getCredit(IMovieDbRetroFitCall retrofit, int filmId) {
        Call<RawCredit> callCredit = null;

        callCredit = retrofit.getFilmCredit(Integer.toString(filmId));

        if (null != callCredit) {
            callCredit.enqueue(new Callback<RawCredit>() {
                @Override
                public void onResponse(Call<RawCredit> call, Response<RawCredit> response) {

                    RawCredit credit = response.body();
                    rawFilm
                    sendMessage();

                }

                @Override
                public void onFailure(Call<RawCredit> call, Throwable t) {
                    Log.e("RawFilmBuilder", t.toString());
                }
            });
        }

    }*/


}


