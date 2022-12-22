package Lab;

import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= number ; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            if ( n > max) {
              max = n;
            } else if ( n < min) {
                min = n;
            }
        }
        System.out.printf ("Max number: %d%n", max);
        System.out.printf ("Min number: %d", min);

    }
}
