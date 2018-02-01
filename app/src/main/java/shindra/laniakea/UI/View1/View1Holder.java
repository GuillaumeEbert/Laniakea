package shindra.laniakea.UI.View1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import shindra.laniakea.MovieApi.DataUsable.Genre;
import shindra.laniakea.R;

/**
 * Created by Guillaume on 31/01/2018.
 */

public class View1Holder extends RecyclerView.ViewHolder {

    private TextView tv_genreName;
    private TextView tv_nbFilmsPerGenre;
    private View view;


    //itemView = 1 cell
    public View1Holder(View itemView) {
        super(itemView);
        view= itemView;

        tv_genreName = (TextView) itemView.findViewById(R.id.tv_genre_name);
        tv_nbFilmsPerGenre = itemView.findViewById(R.id.tv_genre_nb_film);
    }

    //set the texte
    public void bind(Genre genre){
        tv_genreName.setText(genre.getName());
        String nbFilm =  Integer.toString(genre.getNbFilms());
        tv_nbFilmsPerGenre.setText(nbFilm);
        //Picasso.with(imageView.getContext()).load(myObject.getImageUrl()).centerCrop().fit().into(imageView);
    }

    public View getView() {
        return view;
    }
}
