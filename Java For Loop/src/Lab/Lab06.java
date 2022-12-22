package Lab;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String text = scanner.nextLine ();
        int sum = 0;
        for (int i = 0; i <= text.length () -1 ; i++) {
            char currentSymbol = text.charAt (i);
            switch (currentSymbol) {
                case 'a':
                    sum = sum + 1;
                    break;
                case 'e':
                    sum = sum + 2;
                    break;
                case 'i':
                    sum = sum + 3;
                    break;
                case 'o':
                    sum = sum + 4;
                    break;
                case 'u':
                    sum +=5;
                    break;
            }

        }
       System.out.println (sum);
    }
}
