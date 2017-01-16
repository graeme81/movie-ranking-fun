package example.codeclan.com.movierankings;

/**
 * Created by user on 16/01/2017.
 */

public class Rankings {

    private Movie[] top10;

    public Rankings(){
        top10 = new Movie[10];
    }

    public void populate(){
        addMovie(new Movie("The Godfather","Thriller",1));
        addMovie(new Movie("Forrest Gump","Comedy",2));
        addMovie(new Movie("The Dark Knight","Action",3));
        addMovie(new Movie("The Shawshank Redemption","Drama",4));
        addMovie(new Movie("The Lord Of The Rings","Fantasy",5));
        addMovie(new Movie("Pulp Fiction","Thriller",6));
        addMovie(new Movie("Star Wars","SCI FI",7));
        addMovie(new Movie("Titanic","Drama",8));
        addMovie(new Movie("Saving Private Ryan","Drama",9));
        addMovie(new Movie("Inception","Thriller",10));
    }

    public void addMovie(Movie movie){
        top10[movie.getRanking()-1] = movie;
    }

    public Movie getMovie(int rank){
        return top10[rank-1];
    }

    public void addNewMovie(String title, String genre) {
        top10[9].setTitle(title);
        top10[9].setGenre(genre);

    }
}
