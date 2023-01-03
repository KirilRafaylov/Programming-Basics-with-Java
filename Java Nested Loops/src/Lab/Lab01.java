package Lab;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        for (int hour = 0; hour <= 23 ; hour++) {
            for (int min = 0; min <= 59; min++) {
                System.out.println (hour + ":" + min);
            }
        }
    }
}
