package Lab;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n1 = Integer.parseInt (scanner.nextLine ());
        int n2 = Integer.parseInt (scanner.nextLine ());
        if (n1 >= n2) {
            System.out.println (n1);
        } else {
            System.out.println (n2);
        }
    }
}

