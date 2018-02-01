package shindra.laniakea.RoomDb.DBHandler.Push;


import android.os.Handler;
import android.util.Log;

import java.util.ArrayList;

import shindra.laniakea.MovieApi.DataUsable.DataUsable;
import shindra.laniakea.RoomDb.DBHandler.DBHandler;

/**
 * Created by Guillaume on 31/01/2018.
 */

public abstract class DBPushHandler<DataType extends DataUsable> extends DBHandler {


    private ArrayList<DataType> lDataInDb;
    private ArrayList<DataType> lDataToPush;


    public DBPushHandler(int identifier, Handler handler ,ArrayList<DataType> lNewDataToPush) {
        super(identifier, handler);
        lDataInDb = new ArrayList<>();
        this.lDataToPush = lNewDataToPush;

    }


    @Override
    public void run() {

        ArrayList<DataType> lNewDataToPush;


        //get data from dataBase
        lDataInDb = getDataFromDb();

        if (lDataInDb.isEmpty()) dataToInsert(lDataToPush);
        else {

            //Find new data
            lNewDataToPush = getNewDataToInject();
            dataToInsert(lNewDataToPush);

            //Data to update

             Log.d("Yolo","Yolo");
          dataToUpdate(lDataToPush);


        }

        //job done send message to  UI
        sendMessage();


    }

    protected abstract ArrayList<DataType> getDataFromDb();

    protected abstract void dataToInsert(ArrayList<DataType> newDataToInsert);

    protected abstract void dataToUpdate(ArrayList<DataType> dataToUpdate);



    /**
     * To avoid having the same data all over the DB. This method only return data that are not in the DB
     *
     * @return A list of the new data to add at the DB
     */
    public ArrayList<DataType> getNewDataToInject() {

        ArrayList<DataType> lNewDataToAdd = new ArrayList<>();
        Boolean exist = false;

        DataType dataFromDb;
        DataType newDataToPush;

        for (int i = 0; i <= lDataToPush.size() - 1; i++) {
            newDataToPush = lDataInDb.get(i);


            for (int y = 0; y <= lDataInDb.size() - 1; y++) {
                dataFromDb = lDataToPush.get(y);
                if (dataFromDb.getId() == newDataToPush.getId()) {
                    exist = true;
                    break;
                }
            }

            if (!exist) {
                lNewDataToAdd.add(newDataToPush);
                lDataToPush.remove(newDataToPush);
                exist = false;
            }


        }

        return lNewDataToAdd;

    }

}



