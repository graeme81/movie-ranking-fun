package example.codeclan.com.movierankings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16/01/2017.
 */
public class RankingsTest {

    Rankings rankings;
    Movie movie;

    @Test
    public void canGetMovieFromRankings(){
        rankings = new Rankings();
        rankings.populate();
        movie = rankings.getMovie(7);
        assertEquals("Star Wars",movie.getTitle());

    }

    @Test
    public void canReplaceMovieAtEndWithANewOne(){
        rankings = new Rankings();
        rankings.populate();
        rankings.addNewMovie("Uncle Buck","Comedy");
        movie = rankings.getMovie(10);
        assertEquals("Uncle Buck",movie.getTitle());
    }

}