package Lab;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double n = Double.parseDouble(scanner.nextLine());
        if (n <= 10) {
            System.out.println ("Slow");
        } else if (n > 10.0 && n <= 50.0 ) {
            System.out.println ("average");
        } else if ( n > 50.0 && n <= 150.0 ) {
            System.out.println ("fast");
        } else if ( n > 150.0 && n <= 1000) {
            System.out.println ("ultra fast");
        } else {
            System.out.println ("extremely fast");
        }
    }
}
