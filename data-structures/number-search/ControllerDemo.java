import java.util.Scanner;

public class ControllerDemo {
    public static void main(String[] args) {

        NumberController controller = new NumberController("Numbers.txt");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to search with Binary Search algorithm: ");
        int number1 = scanner.nextInt();
        System.out.printf("Number %d is searching with Binary Search algorithm...\n", number1);
        boolean found1 = controller.searchBinary(number1);

        if (found1) {
            System.out.println("Binary Search result: Found");
        } else {
            System.out.println("Binary Search result: Not Found");
        }

        System.out.print("Enter another number to search with Sequential Search algorithm: ");
        int number2 = scanner.nextInt();
        System.out.printf("Number %d is searching with Sequential Search algorithm...\n", number2);
        boolean found2 = controller.searchSequential(number2);

        if (found2) {
            System.out.println("Binary Search result: Found");
        } else {
            System.out.println("Binary Search result: Not Found");

        }
    }
}