import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerPage = Double.parseDouble(scanner.nextLine());
        double pricePerCover = Double.parseDouble(scanner.nextLine());
        int percentDiscount =Integer.parseInt(scanner.nextLine());
        double priceForDesigner = Double.parseDouble(scanner.nextLine());
        int percentAlreadypaid =Integer.parseInt(scanner.nextLine());

        double sumPrint = 899 * pricePerPage + 2 * pricePerCover;
        double discountPrint = sumPrint * (1- (percentDiscount/100.0));
        double sumPlusDesigner = discountPrint + priceForDesigner;
        double totalSum = (1.0 - percentAlreadypaid/100.0) * sumPlusDesigner;

        System.out.printf("Avtonom should pay %.2f BGN.", totalSum);

    }
}
