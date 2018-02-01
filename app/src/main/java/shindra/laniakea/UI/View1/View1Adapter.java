package shindra.laniakea.UI.View1;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import shindra.laniakea.MovieApi.DataUsable.Genre;
import shindra.laniakea.R;
import shindra.laniakea.UI.View2.FilmPerGenreActivity;

/**
 * Created by Guillaume on 31/01/2018.
 */

public class View1Adapter extends RecyclerView.Adapter<View1Holder> {

    List<Genre> list;
    public View1Adapter(List<Genre> list) {
        this.list = list;
    }

    //Create viewholder and inflate card_cell_genre view
    @Override
    public View1Holder onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_cell_genre,viewGroup,false);
        return new View1Holder(view);
    }

    //Populate the card view
    @Override
    public void onBindViewHolder(View1Holder myViewHolder, final int position) {
        Genre genre = list.get(position);
        myViewHolder.bind(genre);


        myViewHolder.getView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =  new Intent(v.getContext(), FilmPerGenreActivity.class);
                i.putExtra("genreId", list.get(position).getId());
                v.getContext().startActivity(i);

            }
        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
