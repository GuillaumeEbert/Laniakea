package shindra.laniakea.MovieApi.RawDataBuilder;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import shindra.laniakea.MovieApi.DataRaw.RawCredit;
import shindra.laniakea.MovieApi.IMovieDbRetroFitCall;
import shindra.laniakea.MovieApi.Manager.ApiManager;

/**
 * Created by Guillaume on 01/02/2018.
 */

public class RawCreditBuilder extends Builder {

    private String sFilmId;
    private RawCredit rawCredit;


    public RawCreditBuilder(Handler handler, IMovieDbRetroFitCall retrofit, int filmId) {
        super(handler, ApiManager.RAW_CREDIT_BUILDER_ID, retrofit);
        sFilmId = Integer.toString(filmId);
    }

    @Override
    protected Message buildMessageForHandler(Message handlerMgs) {
        handlerMgs.obj = rawCredit;
        handlerMgs.arg1 = Integer.parseInt(sFilmId);

        return handlerMgs;
    }

    @Override
    public void onBuild(IMovieDbRetroFitCall retrofit) {

        //Log.d("RawCredit","RawCreditBuilder for film id " + sFilmId);

        Call<RawCredit> call = null;
        call = retrofit.getFilmCredit(sFilmId);


        if (null != call) {

            call.enqueue(new Callback<RawCredit>() {
                @Override
                public void onResponse(Call<RawCredit> call, Response<RawCredit> response) {
                    rawCredit = response.body();
                    sendMessage();

                }

                @Override
                public void onFailure(Call<RawCredit> call, Throwable t) {
                    Log.e("RawFilmBuilder", t.toString());
                }
            });
        }
    }


}
