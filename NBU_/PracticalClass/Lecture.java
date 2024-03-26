package NBU_.PracticalClass;

public class Lecture extends ObjectWithDuration{
    private String theme;
    private double duration;

    public Lecture(String theme, double duration) {
        super(duration);
        this.theme = theme;
        System.out.println("Lecture theme: "+theme+" duration: "+duration);

    }

    public String getTheme() {
        return theme;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void record(){
        System.out.println("Recording"+duration);
    }




}
