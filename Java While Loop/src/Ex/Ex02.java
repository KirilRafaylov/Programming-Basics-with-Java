package Ex;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int countUnsufficientGrades = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine ();

        while (!command.equals ("Enough")) {
            String problemName =command;
            double grade = Double.parseDouble(scanner.nextLine());
            
            command = scanner.nextLine ();
        }
    }
}
