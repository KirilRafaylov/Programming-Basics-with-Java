package Lab;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int x1 = startInterval; x1 <= endInterval ; x1++) {
            for (int x2 = startInterval; x2 <= endInterval ; x2++) {
                count++;
                int sum = x1 + x2;
                if (sum == magicNumber) {
                    System.out.printf ("Combination N:%d (%d + %d = %d)", count,x1,x2,sum);
                    return;
                }
            }
        }
        System.out.printf ("%d combinations - neither equals %d", count, magicNumber);
    }
}
