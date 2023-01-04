package Ex;

import java.util.Scanner;

public class Ex02Volume2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
            String currentNum = "" + i;

            int evenSum = 0;
            int oddSum = 0;
            for (int j = 0; j < 6; j++) {
                int digit = Integer.parseInt("" + currentNum.charAt(j));

                if (j % 2 == 0) {
                    evenSum = evenSum + digit;
                } else {
                    oddSum = oddSum + digit;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
