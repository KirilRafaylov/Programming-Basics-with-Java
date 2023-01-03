package Ex;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int volume = width * length * height;

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int currentNumber = Integer.parseInt(command);
            volume = volume - currentNumber;

            if (volume < 0) {
                break;
            }
            command = scanner.nextLine();
        }
        if (volume < 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        } else {
            System.out.printf("%d Cubic meters left.", volume);
        }
    }
}
