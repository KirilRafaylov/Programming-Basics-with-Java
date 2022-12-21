package Ex;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMin;
        int arrivalTime = arrivalHour * 60 + arrivalMin;

        int diff = Math.abs (examTime - arrivalTime);

        if (examTime < arrivalTime) {
            System.out.println ("Late");
            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf ("%d:%d hours after the start", hour, min);
            } else {
                System.out.printf ("%02d minutes after the start", diff);
            }

        } else if (examTime == arrivalTime || (diff <= 30)) {
            System.out.println ("On time");
            if (diff > 1 && diff <= 30) {
                System.out.printf ("%d minutes before the start", diff);
            }
        } else {
            System.out.println ("Early");
            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf ("%d:%d hours before the start", hour, min);
            } else {
                System.out.printf ("%02d minutes before the start", diff);
            }
        }
    }
}
