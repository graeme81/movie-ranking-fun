package example.codeclan.com.movierankings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16/01/2017.
 */
public class MovieTest {
    @Test
    public void canGetTitle(){
        Movie movie = new Movie("BFG", "Horror", 6);
        assertEquals("BFG", movie.getTitle());
    }

    @Test
    public void canGetGenre(){
        Movie movie = new Movie("BFG", "Horror", 6);
        assertEquals("Horror", movie.getGenre());
    }

    @Test
    public void canGetRanking(){
        Movie movie = new Movie("BFG", "Horror", 6);
        assertEquals(6, movie.getRanking());
    }

    @Test
    public void canSetTitle(){
        Movie movie = new Movie("BFG", "Horror", 6);
        movie.setTitle("Joy");
        assertEquals("Joy", movie.getTitle());
    }

    @Test
    public void canSetGenre(){
        Movie movie = new Movie("BFG", "Horror", 6);
        movie.setGenre("Crap");
        assertEquals("Crap", movie.getGenre());
    }

    @Test
    public void canSetRanking(){
        Movie movie = new Movie("BFG", "Horror", 6);
        movie.setRanking(10);
        assertEquals(10, movie.getRanking());
    }

    @Test
    public void toStringOverRide(){
        Movie movie = new Movie("BFG", "Horror", 6);
        String output = movie.toString();
        System.out.println(output);
    }
}