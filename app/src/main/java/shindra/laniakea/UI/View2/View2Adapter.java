package shindra.laniakea.UI.View2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import shindra.laniakea.MovieApi.DataUsable.Film;
import shindra.laniakea.R;
import shindra.laniakea.UI.View3.FilmActivity;

/**
 * Created by Guillaume on 31/01/2018.
 */

public class View2Adapter extends RecyclerView.Adapter<View2Holder> {

    private List<Film> list;

    public View2Adapter(List<Film> list) {
        this.list = list;
    }

    //Create viewholder and inflate card_cell_genre view
    @Override
    public View2Holder onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_cell_film, viewGroup, false);
        return new View2Holder(view);
    }

    //Populate the card view
    @Override
    public void onBindViewHolder(View2Holder myViewHolder, final int position) {
        final Film film = list.get(position);
        myViewHolder.bind(film);

        myViewHolder.getView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), FilmActivity.class);
                intent.putExtra("filmId",film.getId());
                v.getContext().startActivity(intent);


            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
