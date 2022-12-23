package Lab;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());

      //  for (int i = 1; i <= n ; i=i*2 + 1) {
        //    System.out.println (i);
        //}
        int number = 1;
        while (number < n) {
            System.out.println (number);
            number = number * 2 + 1;
        }
    }
}
