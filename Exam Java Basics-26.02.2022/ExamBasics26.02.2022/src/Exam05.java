import java.util.Scanner;

public class Exam05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boughtFood =Integer.parseInt(scanner.nextLine());

        int totalFood = 0;
        String command = scanner.nextLine();
        while (!command.equals("Adopted")) {

            int food = Integer.parseInt(command);
            totalFood +=food;

            command = scanner.nextLine();

        }
        int diff = Math.abs( totalFood - (boughtFood)*1000);
        if (totalFood <= (boughtFood * 1000)) {

            System.out.printf("Food is enough! Leftovers: %s grams.", diff);
        } else {
            System.out.printf("Food is not enough. You need %s grams more.", diff);
        }
    }
}
