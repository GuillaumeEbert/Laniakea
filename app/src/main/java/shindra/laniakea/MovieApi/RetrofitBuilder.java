package shindra.laniakea.MovieApi;

import android.content.Intent;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Guillaume on 30/01/2018.
 */

public class RetrofitBuilder {


    private static IMovieDbRetroFitCall requestApiInterface;


    public static IMovieDbRetroFitCall getRequestApiInterface() {
        if (null == requestApiInterface){

            OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Response response = chain.proceed(chain.request());
                    return response;
                }
            }).build();

            Retrofit client = new Retrofit.Builder()
                    .baseUrl(IMovieDbRetroFitCall.BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            requestApiInterface = client.create(IMovieDbRetroFitCall.class);

            return requestApiInterface;
        }


        return null;

    }
}
