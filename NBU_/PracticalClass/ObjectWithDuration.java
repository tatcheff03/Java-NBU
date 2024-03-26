package NBU_.PracticalClass;

public abstract class ObjectWithDuration implements Recordable{
    private double duration;

    public ObjectWithDuration(double duration) {
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void record(){
        System.out.println("Recording"+duration);
    }


}
