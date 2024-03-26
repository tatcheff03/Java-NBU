package NBU_;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    private static double hugeNumber = 100;

    // Constructors

    public Triangle() {

    }

    public Triangle(double number) {
        // Constructor with one parameter (creates an equilateral triangle)
        this.side1 = number;
        this.side2 = number;
        this.side3 = number;
    }

    public Triangle(double side1, double side2, double side3) {
        // Constructor with three parameters
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getters and Setters (Unused getters and setters removed)

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public boolean isExistingTriangle() {
        // Method to check if a triangle is valid
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    public void increaseSideLength(double number) {
        // Method to increase the length of all sides by a given number
        if (number < 0) {
            System.out.println("Invalid increase. The number must be non-negative.");
        } else {
            this.side1 += number;
            this.side2 += number;
            this.side3 += number;
            System.out.println("Side lengths increased by " + number);
        }
    }

    public double perimeter() {
        // Method to calculate the perimeter of the triangle
        return side1 + side2 + side3;
    }

    public double area() {
        // Method to calculate the area of the triangle using Heron's formula
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public boolean isEquilateral() {
        // Method to check if the triangle is equilateral
        return side1 == side2 && side1 == side3;
    }

    public boolean isRightAngled() {
        boolean isRightAngled = (Math.pow(side1, 2) == Math.pow(side2, 2) + Math.pow(side3, 2))
                || (Math.pow(side2, 2) == Math.pow(side1, 2) + Math.pow(side3, 2))
                || (Math.pow(side3, 2) == Math.pow(side1, 2) + Math.pow(side2, 2));
        return isRightAngled;
    }

    public boolean isHuge() {
        // Method to check if the triangle is huge
        return perimeter() > hugeNumber;
    }

    public static double getHugeNumber() {
        return hugeNumber;
    }

    public static void setHugeNumber(double hugeNumber) {
        Triangle.hugeNumber = hugeNumber;
        System.out.println("Huge number set to: " + hugeNumber);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public static void main(String[] args) {
        // Example usage
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle: " + triangle);
        System.out.println("Is it a valid triangle?\n " + triangle.isExistingTriangle());
        System.out.println("Perimeter: " + triangle.perimeter());
        System.out.println("Area: " + triangle.area());
        System.out.println("Is it equilateral? " + triangle.isEquilateral());
        System.out.println("Is it rectangular? " + triangle.isRightAngled());
        System.out.println("Is it huge? " + triangle.isHuge());

        // triangle.increaseSideLength(2);
        // System.out.println("After increasing side lengths: " + triangle);
        // Triangle.setHugeNumber(150);
        // System.out.println("Is it still huge? " + triangle.isHuge());
    }
}
