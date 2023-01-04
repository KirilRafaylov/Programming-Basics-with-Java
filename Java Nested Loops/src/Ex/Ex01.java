package Ex;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int currentNum = 0;
        for (int r = 1; r <= n ; r++) {
            for (int c = 1; c <= r ; c++) {
                currentNum++;

                if (currentNum > n) {
                    flag = true;
                    break;
                }
                System.out.print(currentNum + " ");
            }
            if (flag) {
                break;
            }
            System.out.println();
        }
    }
}
