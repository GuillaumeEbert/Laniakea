package shindra.laniakea.MovieApi.RawData;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import shindra.laniakea.MovieApi.UsableData.Film;

/**
 * Created by Guillaume on 30/01/2018.
 */

public class RawFilm {
   private int id;
    private int page;
    private int total_pages;
    private int total_results;
    @SerializedName("results")
    private List<Film> results;

    public List<Film> getResults() {
        return results;
    }

    public void setResults(List<Film> results) {
        this.results = results;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

}
