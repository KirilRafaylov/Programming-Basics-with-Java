import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cat = scanner.nextLine();
        char sex = scanner.nextLine().charAt(0);

        double age = 0.0;

        if (sex == 'm') {
            if (cat.equals("British Shorthair")) {
                age = 13 * 2.0;
            } else if (cat.equals("Siamese")) {
                age = 15 * 2.0;
            } else if (cat.equals("Persian")) {
                age = 14 * 2.0;
            } else if (cat.equals("Ragdoll")) {
                age = 16 * 2.0;
            } else if (cat.equals("American Shorthair")) {
                age = 12 * 2.0;
            } else if (cat.equals("Siberian")) {
                age = 11 * 2.0;
            }
        } else if (sex == 'f') {
            if (cat.equals("British Shorthair")) {
                age = 14 * 2.0;
            } else if (cat.equals("Siamese")) {
                age = 16 * 2.0;
            } else if (cat.equals("Persian")) {
                age = 15 * 2.0;
            } else if (cat.equals("Ragdoll")) {
                age = 17 * 2.0;
            } else if (cat.equals("American Shorthair")) {
                age = 13 * 2.0;
            } else if (cat.equals("Siberian")) {
                age = 12 * 2.0;
            }

        }
        if (!cat.equals("British Shorthair") && !cat.equals("Siamese") && !cat.equals("Persian") && !cat.equals("Ragdoll")
                && !cat.equals("American Shorthair") && !cat.equals("Siberian")) {
            System.out.printf("%s is invalid cat!", cat);
        } else {
            System.out.printf("%.0f cat months", age);

        }


        }
    }








