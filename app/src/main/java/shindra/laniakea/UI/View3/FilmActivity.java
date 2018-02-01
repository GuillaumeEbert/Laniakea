package shindra.laniakea.UI.View3;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import shindra.laniakea.MovieApi.DataUsable.Film;
import shindra.laniakea.MovieApi.Manager.ApiManager;
import shindra.laniakea.R;

public class FilmActivity extends AppCompatActivity implements ApiManager.ApiManagerCallback{


    private Film selectFilm;

    private ApiManager apiManager;
    private View3Model view3Model;
    private TextView castString;

    private int filmId;
    private String cast;
    private String description;
    private String filmTitle;
    private String filmBackdrop;



    private TextView tvCast;
    private TextView tvDescription;
    private TextView tvTitle;
    private ImageView afficheFilm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);

        filmId = getIntent().getIntExtra("filmId",0);

        apiManager = new ApiManager(this);


        tvCast = (TextView) findViewById(R.id.tv_cast);
        tvDescription = (TextView) findViewById(R.id.tv_description);
        tvTitle = (TextView) findViewById(R.id.tv_film_titre);
        afficheFilm = (ImageView) findViewById(R.id.iv_film_affiche);


        apiManager.fetchDataFromDb();


        // Get the ViewModel.
        view3Model = ViewModelProviders.of(this).get(View3Model.class);

        // Create the observer which updates the UI.
        final Observer<String> castObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String newName) {
                // Update the UI, in this case, a TextView.
                if(newName !=null)
                tvCast.setText(newName);
            }
        };


        // Create the observer which updates the UI.
        final Observer<String> titleObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String newName) {
                // Update the UI, in this case, a TextView.
                if(newName !=null)
                tvTitle.setText(newName);
            }
        };

        // Create the observer which updates the UI.
        final Observer<String> descriptionObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String newName) {
                // Update the UI, in this case, a TextView.
                if(newName !=null)
                tvDescription.setText(newName);
            }
        };


        // Create the observer which updates the UI.
        final Observer<String> imgObserver = new Observer<String>() {
            String url;
            @Override
            public void onChanged(@Nullable final String newName) {
                // Update the UI, in this case, a TextView.
                if(newName !=null)
                    url  = "http://image.tmdb.org/t/p/w780/" +  newName;
                Glide.with(getApplicationContext()).load(url).into(afficheFilm);
            }
        };

        view3Model.getCast().observe(this,castObserver);
        view3Model.getDescription().observe(this,descriptionObserver);
        view3Model.getFilmTitle().observe(this,titleObserver);
        view3Model.getFilmBackdrop().observe(this,imgObserver);



    }

    @Override
    public void allDataAreHere() {

        ArrayList<Film> lFilm = apiManager.getlFilms();


        for(Film f : lFilm){
            if(f.getId() == filmId) selectFilm = f;
        }

        view3Model = ViewModelProviders.of(this).get(View3Model.class);


        view3Model.getFilmTitle().setValue(selectFilm.getTitle());
        view3Model.getDescription().setValue(selectFilm.getOverview());
        view3Model.getCast().setValue(selectFilm.getCast());
        view3Model.getFilmBackdrop().setValue(selectFilm.getBackdrop_path());


        Log.d("Stop","Stop");

    }
}
