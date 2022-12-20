package Ex;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String typeFlowers = scanner.nextLine ();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;
        switch (typeFlowers) {
            case "Roses":
                totalPrice = countFlowers * 5.0;
                if (countFlowers > 80) {
                    totalPrice = 0.9 * totalPrice;
                }
                break;
            case "Dahlias":
                totalPrice = countFlowers * 3.8;
                if (countFlowers > 90) {
                    totalPrice = 0.85 * totalPrice;
                }
                break;
            case "Tulips":
                totalPrice = countFlowers * 2.8;
                if (countFlowers > 80) {
                    totalPrice = 0.85 * totalPrice;
                }
                break;
            case "Narcissus":
                totalPrice = countFlowers * 3.0;
                if (countFlowers < 120) {
                    totalPrice = 1.15 * totalPrice;
                }
                break;
            case "Gladiolus":
                totalPrice = countFlowers * 2.5;
                if (countFlowers < 80) {
                    totalPrice = 1.15 * totalPrice;
                }
                break;
            default:
                break;

        }
        if (budget >= totalPrice) {
            System.out.printf ("Hey, you have a great garden with %d %s and %.2f leva left.",
                    countFlowers, typeFlowers, (budget - totalPrice));
        } else {
            System.out.printf ("Not enough money, you need %.2f leva more.", (totalPrice - budget));
        }
    }
}
