package Ex;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
            int sumWithoutMax = sum - max;
        if (max == sumWithoutMax) {
            System.out.println ("Yes");
            System.out.printf ("Sum = %d", sumWithoutMax);
        } else {
            System.out.println ("No");
            System.out.printf ("Diff = %d", Math.abs (max - sumWithoutMax));
        }
    }
}

