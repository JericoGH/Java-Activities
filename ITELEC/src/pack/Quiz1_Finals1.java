package pack;
import java.util.Scanner;
public class Quiz1_Finals1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int enterNum, sumOdd = 0, sumEven = 0;
		char ans = 'n';
		
		do {
		System.out.print("Enter the number ");
		enterNum = s.nextInt();
		if (enterNum %2 == 0) {
			sumEven++;
		}
		if (enterNum %2 == 1) {
			sumOdd++;
		}
		System.out.print("Do you want to continue y/n? ");
		ans = s.next().charAt(0);
		} while(ans == 'y');
		
		System.out.println("\nSum of even numbers: " + sumEven);
		System.out.println("Sum of odd numbers: " + sumOdd);
	}
}