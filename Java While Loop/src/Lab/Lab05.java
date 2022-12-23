package Lab;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double totalSum = 0;
        String input = scanner.nextLine ();
        while (!input.equals ("NoMoreMoney")) {
            double sum = Double.parseDouble(input);

            if (sum < 0) {
                System.out.println ("Invalid operation!");
                break;
            } else {
                System.out.printf ("Increase: %.2f%n", sum);
                totalSum+= sum;
            }
            input = scanner.nextLine ();
        }
        System.out.printf ("Total: %.2f", totalSum);
    }
}
