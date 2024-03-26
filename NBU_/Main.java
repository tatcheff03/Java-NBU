package NBU_;

public class Main {

    public static void main(String[] args) {
        quadraticEqu(1, -3, 2);
    }

    public static void quadraticEqu(double a, double b, double c) {
        double disk = Math.pow(b, 2) - 4 * a * c;

        if (disk < 0) {
            System.out.println("No real roots!");
        } else if (disk == 0) {
            double root = -b / (2 * a);
            System.out.println("Root 1: " + root);
        } else {
            double root1 = (-b - Math.sqrt(disk)) / (2 * a);
            double root2 = (-b + Math.sqrt(disk)) / (2 * a);

            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
    }
}
