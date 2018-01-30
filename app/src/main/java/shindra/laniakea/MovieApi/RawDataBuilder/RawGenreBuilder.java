package shindra.laniakea.MovieApi.RawDataBuilder;

import android.os.Handler;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import shindra.laniakea.MovieApi.IMovieDbRetroFitCall;
import shindra.laniakea.MovieApi.RawData.RawGenre;

/**
 * Created by Guillaume on 30/01/2018.
 */

public class RawGenreBuilder extends Builder<RawGenre> {


    public RawGenreBuilder(Handler handler,IMovieDbRetroFitCall retrofit) {
        super(handler, RAW_GENRE,retrofit);
    }



    @Override
    protected void onBuild(IMovieDbRetroFitCall retrofit) {

        Call<RawGenre> call = null;
        call = retrofit.getAllGenre();

        if (null != call) {

            call.enqueue(new Callback<RawGenre>() {

                @Override
                public void onResponse(Call<RawGenre> call, Response<RawGenre> response) {
                    sentToHandler(response.body());

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
}
