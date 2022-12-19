import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double averageAustrHeight = Double.parseDouble(scanner.nextLine());

        double spaceRacket = width * length * height;
        double spaceRoom = (averageAustrHeight + 0.40) * 2.0 *2.0;
        double availSpace = Math.floor(spaceRacket / spaceRoom);

        if ( availSpace >= 3 & availSpace <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", availSpace);
        } else if (availSpace < 3) {
            System.out.println("The spacecraft is too small.");
        } else {
            System.out.println("The spacecraft is too big.");
        }

    }
}
