package NBU_.hw1;
import  java.util.Scanner;

public class task2 {



    public static int sumOfNumbers(int size) {



        if (size < 0 && size > 9) {

            throw new IllegalArgumentException("0");

        }



        if (size <= 0) {

            return 0;

        }

        if (size == 10) {

            return 0;

        }

        int sum = 0;

        int totalSum = size;

        int number = 1;

        while (size != 1) {

            for (int i = number; i <= totalSum; i++) {

                sum += 4 * i;

            }

            number++;

            size--;

        }

        sum += 2 * totalSum;

        return sum;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int result = sumOfNumbers(size);

        System.out.println(result);

        scanner.close();

    }

}

