package NBU_.Traffic;

public class TrafficLightMain {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("red", 10);

        System.out.println("The light is red: " + light.isRed());
        System.out.println("The light is green: " + light.isGreen());

        light.changeColor("green");

        System.out.println("The light is now green: " + light.isGreen());
        System.out.println("The light duration is: " + light.getDuration());
        light.setDuration(20);
        System.out.println("The light duration is now: " + light.getDuration());
    }
}
