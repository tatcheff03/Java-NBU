package NBU_.PracticalClass;

public class PracticalClass extends  Lecture{
    private  String theme;
    private double duration;
    private int tasksCount;


    public PracticalClass(String theme, double duration, int tasksCount) {
        super(theme, duration);
        this.tasksCount = tasksCount;
        System.out.println("Practical Class theme: "+theme+" duration: "+duration+" tasksCount: "+tasksCount);
    }

    public String getTheme() {
        return theme;
    }

    public double getDuration() {
        return duration;
    }

    public int getTasksCount() {
        return tasksCount;
    }

    @Override
    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setTasksCount(int tasksCount) {
        this.tasksCount = tasksCount;
    }
}
