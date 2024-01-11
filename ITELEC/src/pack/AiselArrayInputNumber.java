package pack;
import java.util.Scanner;
public class AiselArrayInputNumber {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("Input 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("\nInput a number to search: ");
        int searchNumber = scanner.nextInt();

        boolean isNumberPresent = false;
        for (int number : numbers) {
            if (number == searchNumber) {
                isNumberPresent = true;
                break;
            }
        }

        if (isNumberPresent) {
            System.out.println("The number is present in the array.");
        } else {
            System.out.println("The number is not present in the array.");
        }
        
        scanner.close();
    }
}