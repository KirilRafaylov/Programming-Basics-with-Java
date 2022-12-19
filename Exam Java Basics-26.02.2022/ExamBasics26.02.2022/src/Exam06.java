import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locations =Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locations; i++) {
            double expectedGold = Double.parseDouble(scanner.nextLine());
            int sumOfDays =Integer.parseInt(scanner.nextLine());
            double totalGold = 0.0;
            for (int j = 1; j <= sumOfDays; j++) {
                double receivedGold = Double.parseDouble(scanner.nextLine());
                totalGold += receivedGold;

            }
            double averGold = totalGold / sumOfDays;
            double diff = Math.abs(averGold - expectedGold);
            if (averGold >= expectedGold) {
                System.out.printf("Good job! Average gold per day: %.2f.%n",averGold);
            totalGold = 0.0;

            } else {
                System.out.printf("You need %.2f gold.%n", diff);
            }
        }

    }

}

