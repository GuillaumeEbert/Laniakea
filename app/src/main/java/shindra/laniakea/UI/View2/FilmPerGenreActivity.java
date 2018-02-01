package shindra.laniakea.UI.View2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import shindra.laniakea.MovieApi.DataUsable.Film;
import shindra.laniakea.MovieApi.Manager.ApiManager;
import shindra.laniakea.R;

public class FilmPerGenreActivity extends AppCompatActivity implements ApiManager.ApiManagerCallback{

    private ApiManager apiManager;
    private int genreSelected;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_per_genre);

         genreSelected = getIntent().getIntExtra("genreId",-1);

        apiManager = new ApiManager(this);

        apiManager.fetchDataFromDb();



        recyclerView = (RecyclerView) findViewById(R.id.recyclerView2);

        recyclerView.setLayoutManager(new GridLayoutManager(this,1));


    }



    @Override
    public void allDataAreHere() {

        ArrayList<Film> filmsInThisGenre;

        filmsInThisGenre = apiManager.getAllFilmPerGenre(genreSelected);
        Log.d("Yolo", filmsInThisGenre.toString());
        recyclerView.setAdapter(new View2Adapter(filmsInThisGenre));

    }
}
