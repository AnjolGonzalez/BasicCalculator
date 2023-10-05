package BasicCalculator;
import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number 1: ");
            int num1 = scanner.nextInt();

    System.out.print("Enter number 2: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();

    System.out.println("Possible Calculations:");
            System.out.println("(A)dd");
            System.out.println("(S)ubtract");
            System.out.println("(M)ultiply");
            System.out.println("(D)ivide");
            System.out.println("Please select an option: ");
            String action = scanner.nextLine();

            System.out.print("5 * 12 = 60");
    }
}
