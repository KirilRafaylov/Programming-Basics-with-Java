package Lab;

import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine ();

        if (text.equals ("square")) {
            double n = Double.parseDouble(scanner.nextLine());
            double area = n*n;
            System.out.printf ("%.3f", area);
        } else if (text.equals ("rectangle")) {
            double n1 = Double.parseDouble(scanner.nextLine());
            double n2 = Double.parseDouble(scanner.nextLine());
            double area = n1 * n2;
            System.out.printf ("%.3f", area);
        } else if (text.equals ("circle")) {
            double n = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * n*n;
            System.out.printf ("%.3f", area);
        } else if (text.equals ("triangle")) {
            double n1 = Double.parseDouble(scanner.nextLine());
            double n2 = Double.parseDouble(scanner.nextLine());
            double area = (n1 * n2) / 2.0;
            System.out.printf ("%.3f", area);
        }
    }
}
