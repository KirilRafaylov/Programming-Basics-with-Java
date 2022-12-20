package Ex;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String nameMovie = scanner.nextLine ();
        int durationMovie = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());

        double lunchTime = durationBreak / 8.0;
        double relaxTime = durationBreak / 4.0;

        if (durationMovie >= (durationBreak - lunchTime - relaxTime)) {
            System.out.printf ("You have enough time to watch Game of Thrones and left with %.0f minutes free time.",
                    durationMovie - (durationBreak -lunchTime - relaxTime ));
        } else {
            System.out.printf ("You don't have enough time to watch Teen Wolf, you need %.0f more minutes.",
                    (durationBreak - lunchTime - relaxTime) - durationMovie );
        }
    }
}
