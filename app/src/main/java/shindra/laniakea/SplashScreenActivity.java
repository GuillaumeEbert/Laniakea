package shindra.laniakea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import shindra.laniakea.MovieApi.Manager.ApiManager;

public class SplashScreenActivity extends AppCompatActivity {

    private ApiManager apiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        apiManager = new ApiManager();

        apiManager.fetchApiData();

    }
}
