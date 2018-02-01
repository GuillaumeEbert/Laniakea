package shindra.laniakea.Thread;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/**
 * Created by Guillaume on 31/01/2018.
 */

public abstract class ThreadToken implements Runnable {
    private Handler handler;



    public ThreadToken(Handler handler) {
        this.handler = handler;

    }



    protected abstract Message getHandlerMessage(Message message);

    protected void sendMessage(){

        Message message = handler.obtainMessage();

        message = getHandlerMessage(message);

        handler.sendMessage(message);
    }
}
