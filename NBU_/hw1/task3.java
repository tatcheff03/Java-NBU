package NBU_.hw1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int hiringYear = scanner.nextInt();
        int hiringMonth = scanner.nextInt();
        int hiringDay = scanner.nextInt();
        int currentYear = scanner.nextInt();
        int currentMonth = scanner.nextInt();
        int currentDay = scanner.nextInt();

        Manager manager= new Manager(name);

        manager.setDateHired(LocalDate.of(hiringYear,hiringMonth,hiringDay));
        System.out.println(manager.getDateHired().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        LocalDate currentDate = LocalDate.of(currentYear,currentMonth,currentDay);
        System.out.println(manager.numberOfYearsInCompanyTill(currentDate));

        scanner.close();
    }
}
