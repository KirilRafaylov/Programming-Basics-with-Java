package Ex;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int initHours = Integer.parseInt(scanner.nextLine());
        int initMin = Integer.parseInt(scanner.nextLine());

        int allMin = (initHours * 60) + initMin + 15;
        int hour = allMin / 60;
        int min = allMin % 60;

        if (hour > 23) {
            hour = 0;
        }

            System.out.printf ("%d:%02d", hour, min);
        }

    }

