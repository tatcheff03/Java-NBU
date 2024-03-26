package NBU_.task2_;

public class Main {
    public static void main(String[] args) {
        TaxiDriver taxiDriver = new TaxiDriver("CA2609CB", 100, 2);
        Vehicle vehicle = new Vehicle(100, 1000, 1500);
        System.out.println(taxiDriver.income());
        System.out.println(taxiDriver.regNum);
        System.out.println(vehicle.sellingPrice());




    }
}
