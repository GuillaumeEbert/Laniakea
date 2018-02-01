package shindra.laniakea.Thread;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import shindra.laniakea.MovieApi.RawDataBuilder.Builder;

/**
 * Created by Guillaume on 30/01/2018.
 */

public class ThreadManager {
    private ThreadPoolExecutor apiThreadPoolExecutor;
    private static ThreadManager INSTANCE;

    public static ThreadManager getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new ThreadManager();
        }

        return INSTANCE;
    }

    private ThreadManager(){
        apiThreadPoolExecutor = new ThreadPoolExecutor(5,5,1, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());

    }


    public void submitToken(ThreadToken aBuilder){

        apiThreadPoolExecutor.submit(aBuilder);
    }












}
