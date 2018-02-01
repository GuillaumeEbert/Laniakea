package shindra.laniakea.RoomDb.DBHandler.Retriever;

import android.os.Handler;
import android.os.Message;

import java.util.ArrayList;

import shindra.laniakea.MovieApi.DataUsable.DataUsable;
import shindra.laniakea.MovieApi.DataUsable.Film;
import shindra.laniakea.RoomDb.DBHandler.DBHandler;

/**
 * Created by Guillaume on 31/01/2018.
 */

public abstract class DBRetrieverHandler<DataType extends DataUsable> extends DBHandler {

    private ArrayList<DataType> dataRetrieved;

    protected DBRetrieverHandler(int identifier, Handler handler) {
        super(identifier, handler);
    }

    @Override
    public void run() {

        dataRetrieved = retrievedAllData();
        sendMessage();
    }

    protected abstract ArrayList<DataType> retrievedAllData();
    protected abstract Message getMessage(Message message, ArrayList<DataType> dataRetrieved );


    @Override
    protected Message buildMessageForHandler(Message handlerMgs) {
        return getMessage(handlerMgs,dataRetrieved);
    }


}
