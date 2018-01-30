package shindra.laniakea.MovieApi.UsableData;

import java.util.List;

/**
 * Created by Guillaume on 30/01/2018.
 */


public class Film {


    /**
     * adult : false
     * backdrop_path : /lkOZcsXcOLZYeJ2YxJd3vSldvU4.jpg
     * genre_ids : [28,9648,878,53]
     * id : 198663
     * original_language : en
     * original_title : The Maze Runner
     * overview : Set in a post-apocalyptic world, young Thomas is deposited in a community of boys after his memory is erased, soon learning they're all trapped in a maze that will require him to join forces with fellow “runners” for a shot at escape.
     * release_date : 2014-09-10
     * poster_path : /coss7RgL0NH6g4fC2s5atvf3dFO.jpg
     * popularity : 732.263205
     * title : The Maze Runner
     * video : false
     * *
     */

    private boolean adult;
    private String backdrop_path;
    private int id;
    private String original_language;
    private String original_title;
    private String overview;
    private String release_date;
    private String poster_path;
    private double popularity;
    private String title;
    private boolean video;
    private List<Integer> genre_ids;


    public int getId() {
        return id;
    }

    public List<Integer> getGenre_ids() {
        return genre_ids;
    }
}
