package Ex;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForSwimmingPerMeter = Double.parseDouble(scanner.nextLine());

        double result = distance * timeForSwimmingPerMeter;
        double additionalSeconds = Math.floor (distance / 15 * 12.5);
        double totalTime = result + additionalSeconds;

        if (record > totalTime) {
            System.out.printf ("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf ("No, he failed! He was %.2f seconds slower.", totalTime - record);
        }
    }
}
