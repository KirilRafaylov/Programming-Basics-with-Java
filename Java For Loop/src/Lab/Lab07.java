package Lab;

import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= number ; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            sum +=n;
        }
        System.out.println (sum);
    }
}
