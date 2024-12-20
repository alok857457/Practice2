import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept three numbers
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Calculate the largest number
        int largest = Math.max(num1, Math.max(num2, num3));
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
