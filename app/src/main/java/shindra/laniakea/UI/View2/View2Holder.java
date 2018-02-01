package shindra.laniakea.UI.View2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import shindra.laniakea.MovieApi.DataUsable.Film;
import shindra.laniakea.R;

/**
 * Created by Guillaume on 31/01/2018.
 */

public class View2Holder  extends RecyclerView.ViewHolder {

    private View view;
    private ImageView thumbnail;
    private TextView tv_filmTitre;
    private TextView tv_filmDescription;


    //itemView = 1 cell
    public View2Holder(View itemView) {
        super(itemView);
        view= itemView;


        thumbnail = itemView.findViewById(R.id.iv_thumbnail);
        tv_filmTitre = itemView.findViewById(R.id.tv_titre_film);
        tv_filmDescription = itemView.findViewById(R.id.tv_description_film);

    }

    //set the texte
    public void bind(Film film){

        tv_filmTitre.setText(film.getTitle());
        tv_filmDescription.setText(film.getOverview());

        String url = "http://image.tmdb.org/t/p/w780/" + film.getBackdrop_path();
        Glide.with(view.getContext()).load(url).into(thumbnail);

    }

    public View getView() {
        return view;
    }

}
