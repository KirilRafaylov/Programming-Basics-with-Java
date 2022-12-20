package Lab;

import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String animal = scanner.nextLine ();
        switch (animal) {
            case "dog":
                System.out.println ("mammal");
                break;
            case "crocodile":
            case "reptile":
            case "tortoise":
                System.out.println ("reptile");
                break;
            default:
                System.out.println ("unknown");
                break;
        }

    }
}
