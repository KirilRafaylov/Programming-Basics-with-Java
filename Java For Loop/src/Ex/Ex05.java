package Ex;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int countOpenedTabs = Integer.parseInt(scanner.nextLine());
        double salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countOpenedTabs ; i++) {
            if (salary > 0 ) {
                 String webPage = scanner.nextLine ();
                 switch (webPage) {
                     case ("Facebook"):
                         salary -= 150;
                         break;
                     case ("Instagram"):
                         salary -= 100;
                         break;
                     case ("Reddit"):
                         salary -= 50;
                         break;
                 }
             }
        }
        if (salary <= 0) {
            System.out.println ("You have lost your salary.");
        } else {
            System.out.printf ("%.0f", salary);
        }
    }
}
