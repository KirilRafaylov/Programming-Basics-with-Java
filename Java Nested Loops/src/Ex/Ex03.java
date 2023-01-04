package Ex;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        int primeSum = 0;
        int nonprimeSum = 0;

        while (!input.equals("stop")) {
            int currentNumber = Integer.parseInt(input);
            if (currentNumber < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            int count = 0;
            for (int i = 1; i <= currentNumber ; i++) {
                if (currentNumber % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeSum = primeSum + currentNumber;
            } else {
                nonprimeSum = nonprimeSum + currentNumber;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %s%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %s", nonprimeSum);
    }
}

