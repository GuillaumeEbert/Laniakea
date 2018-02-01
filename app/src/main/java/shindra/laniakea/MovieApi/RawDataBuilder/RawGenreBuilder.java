package shindra.laniakea.MovieApi.RawDataBuilder;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import shindra.laniakea.MovieApi.IMovieDbRetroFitCall;
import shindra.laniakea.MovieApi.DataRaw.RawGenre;
import shindra.laniakea.MovieApi.Manager.ApiManager;

/**
 * Created by Guillaume on 30/01/2018.
 */

public class RawGenreBuilder extends Builder {

    private RawGenre rawGenre;


    public RawGenreBuilder(Handler handler,IMovieDbRetroFitCall retrofit) {
        super(handler, ApiManager.RAW_GENRE_BUILDER_ID,retrofit);
    }


    @Override
    public void onBuild(IMovieDbRetroFitCall retrofit) {

        Call<RawGenre> call = null;
        call = retrofit.getAllGenre();

        if (null != call) {

            call.enqueue(new Callback<RawGenre>() {

                @Override
                public void onResponse(Call<RawGenre> call, Response<RawGenre> response) {
                    rawGenre = response.body();
                    sendMessage();

                }

                @Override
                public void onFailure(Call<RawGenre> call, Throwable t) {
                    Log.e("RawGenreBuilder", t.toString());
                }


            });
        }else {
            Log.d("YOLO", "YOLO");
        }


    }



    @Override
    protected Message buildMessageForHandler(Message handlerMgs) {
        handlerMgs.obj = rawGenre;
        return handlerMgs;
    }
}
