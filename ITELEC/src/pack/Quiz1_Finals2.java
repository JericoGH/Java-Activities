package pack;
import java.util.Scanner;
public class Quiz1_Finals2 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int terms, sum = 0, ctr = 0;
		
		System.out.print("Input number of terms: ");
		terms = s.nextInt();
		
		System.out.print("The even numbers are: ");
		for (int i = 0; i < terms; i++) {
			ctr+=2;
			System.out.print(ctr + " ");
			sum += ctr;
		}
		
		System.out.println("\nThe Sum of even Natural Numbers up to " + terms + " terms: " + sum);
	}

}
