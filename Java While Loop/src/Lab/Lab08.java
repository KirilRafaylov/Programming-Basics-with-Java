package Lab;

import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine ();
        double sumAllGrades = 0;
        int countClasses = 0;
        int countLowClasses = 0;

        while (countClasses !=12) {
        double currentGrade = Double.parseDouble(scanner.nextLine());
        if (currentGrade < 4) {
         countLowClasses++;
         if (countLowClasses > 1) {
             break;
         }
        }
        sumAllGrades +=currentGrade;
        countClasses++;
        }
        if (countClasses ==12) {
            System.out.printf(
                    "%s graduated. Average grade: %.2f", name ,sumAllGrades / 12 );
        } else {
            System.out.printf("%s has been excluded at %d grade", name , countClasses);
        }

    }
}
