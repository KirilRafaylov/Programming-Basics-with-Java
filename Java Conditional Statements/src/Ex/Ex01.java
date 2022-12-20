package Ex;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int time1 = Integer.parseInt(scanner.nextLine());
        int time2 = Integer.parseInt(scanner.nextLine());
        int time3 = Integer.parseInt(scanner.nextLine());

        int totalTime = time1 + time2 + time3;
        int min = totalTime / 60;
        int sec = totalTime % 60;
        if (sec < 10) {
               System.out.printf ("%d:0%d", min, sec);
        } else {
            System.out.printf ("%d:%d", min, sec);
        }
    }
}
