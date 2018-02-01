package shindra.laniakea.MovieApi.RawDataBuilder;

import android.os.Handler;
import android.os.Message;

import shindra.laniakea.MovieApi.IMovieDbRetroFitCall;
import shindra.laniakea.MovieApi.Manager.ApiManager;
import shindra.laniakea.Thread.ThreadToken;


/**
 * Created by Guillaume on 30/01/2018.
 */

public abstract class Builder extends ThreadToken {

    private IMovieDbRetroFitCall retrofit;
    private  @ApiManager.ID
    int identifier;



    protected Builder(Handler handler, @ApiManager.ID int identifier, IMovieDbRetroFitCall retrofit) {
        super(handler);
        this.retrofit = retrofit;
        this.identifier = identifier;

    }

    protected   abstract Message buildMessageForHandler(Message handlerMgs);
    public abstract void onBuild(IMovieDbRetroFitCall retrofit );


    @Override
    public void run() {
        onBuild(retrofit);
    }

    @Override
    protected Message getHandlerMessage(Message message) {
        message.what = identifier;
        message = buildMessageForHandler(message);
        return message;

    }









}
