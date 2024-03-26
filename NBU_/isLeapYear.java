package NBU_;

public class isLeapYear {
    public  static  boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        int year=1603;
        System.out.println("Is "+ year +" leap? "+isLeapYear(year));
        int leapYear= isLeapYear(year)?year:-1;
        System.out.println("leapYear "+ leapYear);
    }

    }
