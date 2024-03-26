package NBU_.PracticalClass;

public class Movie extends ObjectWithDuration {
    private String title;
    private int duration;

   private String genre;

    public Movie(String title, int duration, String genre) {
        super(duration);
        this.title = title;
         this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }


}
