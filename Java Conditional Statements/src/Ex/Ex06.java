package Ex;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int countPuzzles = Integer.parseInt(scanner.nextLine());
        int countDolls = Integer.parseInt(scanner.nextLine());
        int countTeddies = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTrucks = Integer.parseInt(scanner.nextLine());

        int totalNumberToys = countPuzzles + countDolls + countTeddies + countMinions + countTrucks;

        double puzzles = 2.60 * countPuzzles;
        double dolls = 3.0 * countDolls;
        double teddies = 4.10 * countTeddies;
        double minions = 8.20 * countMinions;
        double trucks = 2.0 * countTrucks;

        double totalPrice = puzzles + dolls + teddies + minions + trucks;

        if (totalNumberToys > 50) {
            totalPrice = 0.75 * totalPrice;
        }
        totalPrice = 0.9 * totalPrice;
        double diff = Math.abs (priceExcursion - totalPrice);
        if (priceExcursion > totalPrice) {
            System.out.printf ("Not enough money! %.2f lv needed.", diff);
        } else {
            System.out.printf ("Yes! %.2f lv left.", diff);
        }

    }
}
