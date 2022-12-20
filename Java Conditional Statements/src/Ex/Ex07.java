package Ex;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String type = scanner.nextLine ();
        int rows = Integer.parseInt (scanner.nextLine ());
        int columns = Integer.parseInt (scanner.nextLine ());

        double total = rows * columns;

        switch (type) {
            case "Premiere":
                total = 12.0 * total;
                System.out.printf ("%.2f leva", total);
                break;
            case "Normal":
                total = 7.5 * total;
                System.out.printf ("%.2f leva", total);
                break;
            case " Discount":
                total = 5.0 * total;
                System.out.printf ("%.2f leva", total);
                break;

        }
    }
}
