package Lab;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine ();
        for (int i = 0; i <= text.length () - 1; i++) {
            char currentSymbol = text.charAt (i);
            System.out.println (currentSymbol);
        }
    }
}
