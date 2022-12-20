package Ex;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int initPoints = Integer.parseInt(scanner.nextLine());

        double bonus = 0.0;


        if (initPoints <= 100) {
           bonus = 5;
        } else if (initPoints < 1000) {
              bonus = 0.2 * initPoints;
        } else {
          bonus = 0.1 * initPoints;
        }
        if (initPoints % 2 == 0) {
            bonus +=1;
        }

        if (initPoints % 10 == 5 ) {
            bonus +=2;
        }
        double total = bonus + initPoints;
        System.out.printf ("%.1f%n", bonus);
        System.out.printf ("%.1f", total);
    }
}
