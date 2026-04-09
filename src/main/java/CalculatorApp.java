import java.util.*;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();


        System.out.println("Possible calculations:");
        System.out.println("  (A)dd");
        System.out.println("  (S)ubtract");
        System.out.println("  (M)ultiply");
        System.out.println("  (D)ivide");
        System.out.println("Please select and option: ");
        scanner.nextLine();

        String choice = scanner.nextLine();

        System.out.println(x + " * " + y + " = " + (x * y));
    }


}
