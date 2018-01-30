package shindra.laniakea.MovieApi.RawDataBuilder;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Guillaume on 30/01/2018.
 */

public class BuilderManager {
    private ThreadPoolExecutor apiThreadPoolExecutor;
    private static BuilderManager INSTANCE;

    public static BuilderManager getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new BuilderManager();
        }

        return INSTANCE;
    }

    private BuilderManager(){
        apiThreadPoolExecutor = new ThreadPoolExecutor(5,5,1, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());

    }


    public void submitBuilder(Builder aBuilder){

        apiThreadPoolExecutor.submit(aBuilder);
    }












}
