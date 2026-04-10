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

        int solution;


        // Exercise 4 Answer
        // System.out.println(x + " * " + y + " = " + (x * y));

        // Extra work with if statements

        if (choice.equalsIgnoreCase("A")){

            solution = x + y;
            System.out.println(x + " + " + y + " = " + solution);

        } else if (choice.equalsIgnoreCase("S")) {

            solution = x - y;
            System.out.println(x + " - " + y + " = " + solution);

        } else if (choice.equalsIgnoreCase("M")){

            solution = x * y;
            System.out.println(x + " / " + y + " = " + solution);

        } else if (choice.equalsIgnoreCase("D")){

            solution = x / y;
            System.out.println(x + " * " + y + " = " + solution);

        } else {

            System.out.println("Sorry, the program was unable to read your choice, please run the program again and enter either 'A', 'S', 'M', or 'D'");


        }
    }


}
