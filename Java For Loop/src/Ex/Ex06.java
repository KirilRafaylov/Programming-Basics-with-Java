package Ex;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine ();
        double initialPoints = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());

        double sumPoints = initialPoints;
        for (int i = 1; i <= judges ; i++) {
            String nameActor = scanner.nextLine ();
            double pointsAwarded = Double.parseDouble(scanner.nextLine());
            double currentPointsSum = nameActor.length () *pointsAwarded/2.0;
            if (sumPoints < 1250.5) {
                sumPoints += currentPointsSum;
            }
        }
        if (sumPoints < 1250.5) {
            System.out.printf ("Sorry, %s you need %.1f more!", name, (1250.5 - sumPoints) );
        } else {
            System.out.printf ("Congratulations, %s got a nominee for leading role with %.1f!", name, sumPoints );
        }

    }
}
