package Movie;

public class Movie {
    private String title;
    private String genre;
    private int rating;

    public Movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }


    void playIt(){
        System.out.println("Playing the movie");
    }


    public String getTitle() {
        return title;
    }


    public String getGenre() {
        return genre;
    }


    public int getRating() {
        return rating;
    }
    
}
