package shindra.laniakea.RoomDb.DBHandler;



import android.os.Handler;
import android.os.Message;

import shindra.laniakea.MovieApi.Manager.ApiManager;
import shindra.laniakea.Thread.ThreadToken;

/**
 * Created by Guillaume on 31/01/2018.
 */

public abstract class DBHandler extends ThreadToken {

    protected @ApiManager.ID
    int identifier;


    protected DBHandler(@ApiManager.ID int identifier, Handler handler) {
        super(handler);
        this.identifier = identifier;
    }


    protected abstract Message buildMessageForHandler(Message handlerMgs);

    @Override
    protected Message getHandlerMessage(Message message) {
        message.what = identifier;
        message = buildMessageForHandler(message);
        return message;
    }





}
