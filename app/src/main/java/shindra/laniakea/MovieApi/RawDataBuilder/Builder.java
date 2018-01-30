package shindra.laniakea.MovieApi.RawDataBuilder;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import shindra.laniakea.MovieApi.IMovieDbRetroFitCall;
import shindra.laniakea.MovieApi.RetrofitBuilder;


/**
 * Created by Guillaume on 30/01/2018.
 */

public abstract class Builder<BuilderResult> implements Runnable {
    private Handler handler;
    private int builderType;
    private IMovieDbRetroFitCall retrofit;
    private Message handlerMessage;


    protected Builder(Handler handler, @BuilderType int builderType,IMovieDbRetroFitCall retrofit) {
        this.handler = handler;
        this.builderType = builderType;
        this.retrofit = retrofit;
        handlerMessage = handler.obtainMessage();


    }




    protected abstract void onBuild(IMovieDbRetroFitCall retrofit);


    @Override
    public void run() {
       onBuild(retrofit);

    }


    protected void sentToHandler(BuilderResult result) {
        Message message = handler.obtainMessage();
        message.what = builderType;
        message.obj = result;

        handler.sendMessage(message);

    }




    public static final int RAW_FILM = 0;
    public static final int RAW_GENRE = 1;


    @IntDef({RAW_FILM, RAW_GENRE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface BuilderType {

    }

}
