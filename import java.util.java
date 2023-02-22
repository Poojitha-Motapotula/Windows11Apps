import java.util.Scanner;

public class PositiveNegativeNumber {

    public static void main(String[] args) {

        // create scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // get input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // check if number is positive or negative and print the result
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        // close scanner object
        scanner.close();
    }
}
