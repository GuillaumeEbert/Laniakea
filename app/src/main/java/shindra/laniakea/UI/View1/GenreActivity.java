package shindra.laniakea.UI.View1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import shindra.laniakea.MovieApi.DataUsable.Genre;
import shindra.laniakea.MovieApi.Manager.ApiManager;
import shindra.laniakea.R;

public class GenreActivity extends AppCompatActivity implements ApiManager.ApiManagerCallback {

    private RecyclerView recyclerView;
    private ApiManager apiManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        apiManager = new ApiManager(this);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        apiManager.fetchDataFromDb();

    }

    @Override
    public void allDataAreHere() {
        Log.d("GenreActivity", "All data from Db are here");

        ArrayList<Genre> lGenre = apiManager.getlGenres();

        recyclerView.setAdapter(new View1Adapter(lGenre));
    }


}
