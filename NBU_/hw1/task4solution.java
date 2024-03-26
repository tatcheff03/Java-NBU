package NBU_.hw1;
import java.math.BigDecimal;
import java.util.Scanner;

public  class task4solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long id = scanner.nextLong();
        int maxWorkingHours = scanner.nextInt();
        double minPricePerHour = scanner.nextDouble();
        double euro = scanner.nextDouble();
        double pricePerHour = scanner.nextDouble();
        int workedHours = scanner.nextInt();

        Studio studio1 = new Studio(id, maxWorkingHours);
        studio1.setMinPrice(BigDecimal.valueOf(minPricePerHour));
        studio1.setEuro(BigDecimal.valueOf(euro));
        studio1.setPricePerHour(BigDecimal.valueOf(pricePerHour));
        studio1.setWorkedHours(workedHours);




        id = scanner.nextLong();
        maxWorkingHours = scanner.nextInt();
        pricePerHour = scanner.nextDouble();
        workedHours = scanner.nextInt();

        Studio studio2 = new Studio(id, maxWorkingHours);
        studio2.setPricePerHour(BigDecimal.valueOf(pricePerHour));
        studio2.setWorkedHours(workedHours);

        System.out.println(studio1.getValueInLeva());
        System.out.println(studio1.getValueInEuro());
        System.out.println(Studio.compareByPrice(studio1, studio2).getId());
        System.out.println(Studio.compareByRevenue(studio1, studio2));

        scanner.close();
    }
}