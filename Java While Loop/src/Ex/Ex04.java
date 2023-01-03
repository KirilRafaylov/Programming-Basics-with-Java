package Ex;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String command = scanner.nextLine ();
        int targetSteps = 10000;
        int reachedSteps = 0;

        while (!command.equals ("Going home")) {
            int currentSteps = Integer.parseInt (command);
            reachedSteps += currentSteps;
            if (reachedSteps >= targetSteps) {
                break;
            }
            command = scanner.nextLine ();
        }
        if (command.equals ("Going home")) {
          int homeSteps = Integer.parseInt(command);
          reachedSteps += homeSteps;
        }
        int diff = Math.abs (reachedSteps - targetSteps);
        if (reachedSteps >= targetSteps) {
            System.out.println ("Goal reached! Good job!");
            System.out.printf ("%d steps over the goal!",diff);
        } else {
            System.out.printf ("%d2500 more steps to reach goal.", diff);
        }
    }
}
