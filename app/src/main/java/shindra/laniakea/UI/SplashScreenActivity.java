package shindra.laniakea.UI;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import shindra.laniakea.MovieApi.Manager.ApiManager;
import shindra.laniakea.R;
import shindra.laniakea.UI.View1.GenreActivity;

public class SplashScreenActivity extends AppCompatActivity implements ApiManager.ApiManagerCallback {

    private ApiManager apiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        /*ActionBar actionBar = getActionBar();
        actionBar.hide();*/



        apiManager = new ApiManager(this);
        apiManager.fetchApiData();

    }

    @Override
    public void allDataAreHere() {
        Log.i("SplashScreen","All data are here init next activity");
        Intent intent = new Intent(this,GenreActivity.class);
        startActivity(intent);
    }
}
