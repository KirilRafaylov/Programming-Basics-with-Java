import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCats = Integer.parseInt(scanner.nextLine());

        int countGroup1 = 0;
        int countGroup2 = 0;
        int countGroup3 = 0;
        double totalGramFood = 0.00;

        for (int i = 1; i <= countCats; i++) {
            double gramCatFood = Double.parseDouble(scanner.nextLine());


            if (gramCatFood >= 100 && gramCatFood < 200) {
                countGroup1++;
                totalGramFood = totalGramFood + gramCatFood;
            } else if (gramCatFood < 300) {
                countGroup2++;
                totalGramFood = totalGramFood + gramCatFood;
            } else {
                countGroup3++;
                totalGramFood = totalGramFood + gramCatFood;
            }

        }
        double priceFood = (totalGramFood / 1000.0) * 12.45;
        System.out.printf("Group 1: %d cats.%n", countGroup1);
        System.out.printf("Group 2: %d cats.%n", countGroup2);
        System.out.printf("Group 3: %d cats.%n", countGroup3);
        System.out.printf("Price for food per day: %.2f lv.", priceFood);
    }
}