package Ex;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine ();
        for (int i = 0; i < text.length () ; i++) {
            char symbol = text.charAt (i);
            System.out.println (symbol);

        }
        int a1 = 'K';
        int a2 = 'i';
        System.out.println (a1);
        System.out.println (a2);
    }
}
