package Ex;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int allPeople = 0;
        int musalaPeople = 0;
        int montblancPeople = 0;
        int kilimangaroPeople = 0;
        int k2People = 0;
        int everestPeople = 0;

        for ( int i = 1; i <= groups; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            allPeople = allPeople + peopleInGroup;
            if (peopleInGroup <= 5) {
                musalaPeople = musalaPeople + peopleInGroup;
            } else if (peopleInGroup <= 12) {
                montblancPeople = montblancPeople + peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimangaroPeople = kilimangaroPeople + peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2People = k2People + peopleInGroup;
            } else {
                everestPeople = everestPeople + peopleInGroup;
            }
        }
        System.out.printf("%.2f%%%n", musalaPeople * 1.0 / allPeople * 100 );
        System.out.printf("%.2f%%%n", montblancPeople * 1.0 / allPeople * 100 );
        System.out.printf("%.2f%%%n", kilimangaroPeople * 1.0 / allPeople * 100 );
        System.out.printf("%.2f%%%n", k2People * 1.0 / allPeople * 100 );
        System.out.printf("%.2f%%%n", everestPeople * 1.0 / allPeople * 100 );
    }
}
