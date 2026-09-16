import java.util.ArrayList;

public class Movie {
    private int year;
    private String title;
    private String genre;
    private String director;
    private ArrayList<Actor> actors;

    //Constructor Methods
    public Movie(int year, String title, String genre, String director, ArrayList<Actor> actors) {
        this.year = year;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
    }

    public Movie(){
        this.setDirector(null);
        this.setActors(null);
        this.setGenre(null);
        this.setTitle(null);
        this.setYear(0);
    }

    public Movie(Movie movie){
        this.setTitle(movie.getTitle());
        this.setGenre(movie.getGenre());
        this.setYear(movie.getYear());
        this.setDirector(movie.getDirector());
        this.setActors(movie.getActors());
    }

    // Getter and Setter methods for Encapsulation
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString(){
        return "Title: " + title + "\n" +
                "Year: " + year + "\n" +
                "Genre: " + genre + "\n" +
                "Director: " + director + "\n" +
                "Actors: " + actors + "\n";
    }
}
