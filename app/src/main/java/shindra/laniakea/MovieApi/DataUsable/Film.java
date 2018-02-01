package shindra.laniakea.MovieApi.DataUsable;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import java.util.ArrayList;
import java.util.List;

import shindra.laniakea.RoomDb.Db.RoomConverter;

/**
 * Created by Guillaume on 30/01/2018.
 */

@Entity(tableName = "film")
public class Film extends DataUsable {

    @PrimaryKey(autoGenerate = true)
    private int uid;





    @ColumnInfo(name = "backdrop_path")
    private String backdrop_path;
    /*@Ignore
    private String original_language;*/
    @ColumnInfo(name = "originalTitle")
    private String original_title;
    @ColumnInfo(name = "overview")
    private String overview;
    /*@Ignore
    private String release_date;
    @Ignore
    private String poster_path;
    @Ignore
    private double popularity;*/
    @ColumnInfo(name = "Title")
    private String title;
    /*@Ignore
    private boolean video;*/
    @Ignore
    private List<Integer> genre_ids;

    @ColumnInfo(name = "cast")
    private String cast;

    @ColumnInfo(name = "genresIdInString")
    private String genresIdInString;


   public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getGenresIdInString() {
        return genresIdInString;
    }

    public void setGenresIdInString(String genresIdInString) {
        this.genresIdInString = genresIdInString;
    }





    public List<Integer> getGenreIds() {
        return genre_ids;
    }

    public void setGenreIds(List<Integer> id) {
        this.genre_ids = id;
    }




    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }


    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getOverview() {
        return overview;
    }

    public String getTitle() {
        return title;
    }

  /*  public boolean isAdult() {
        return adult;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public double getPopularity() {
        return popularity;
    }


    public boolean isVideo() {
        return video;
    }


    public void setAdult(boolean adult) {
        this.adult = adult;
    }


    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }
    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }*/
}
