package NBU_.hw2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String manufacturerName = scanner.nextLine();
        boolean extendedWarranty = scanner.nextInt() == 1;
        int minimalMonthsOfWarranty = scanner.nextInt();
        ElectricDevice electricDevice = new ElectricDevice(new Manufacturer(manufacturerName, extendedWarranty), minimalMonthsOfWarranty);
        ElectricDevice cooker= new Cooker(new Manufacturer(manufacturerName, extendedWarranty), minimalMonthsOfWarranty, scanner.nextInt() == 1);
        ElectricDevice washingMachine = new WashingMachine(new Manufacturer(manufacturerName, extendedWarranty), minimalMonthsOfWarranty, scanner.nextInt() == 1);

        System.out.println(electricDevice.warranty());
        System.out.println(cooker.warranty());
        System.out.println(washingMachine.warranty());



    }
}


