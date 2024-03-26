package NBU_.hw1;
import  java.util.*;

class Result {

    public static int countNumbers(int bottom, int top, int difference) {

        if (bottom<0||top<0||bottom>top){
            return 0;
        }
        int count = 0;
        for(int i=bottom; i<=top; i++){
            String numStr = String.valueOf(i);


            String firstNumToEnd = numStr.substring(1) + numStr.charAt(0);
            int newNum = Integer.parseInt(firstNumToEnd);
            int diff = newNum - i;
            if (diff > difference) {
                count++;

            }
        }
        return count;
    }
}
 class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottom = scanner.nextInt();
        int top = scanner.nextInt();
        int difference = scanner.nextInt();

        int result = Result.countNumbers(bottom, top, difference);
        System.out.println(result);
        scanner.close();


    }
}












