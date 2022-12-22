package Lab;

import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 1; i <= number ; i++) {
            int n1 = Integer.parseInt(scanner.nextLine());
            sumLeft +=n1;
        }
        for (int i = number*2; i <= number*2 +1 ; i++) {
            int n2 = Integer.parseInt(scanner.nextLine());
            sumRight +=n2;
        }
        int diff = Math.abs (sumLeft - sumRight);
         if (sumLeft == sumRight) {
             System.out.printf ("Yes, sum = %d", sumLeft);
         } else {
             System.out.printf ("No, diff = %d", diff);
         }
    }
}
