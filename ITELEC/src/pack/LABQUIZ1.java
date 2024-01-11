package pack;
import java.util.Scanner;
public class LABQUIZ1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int arrSize, sum = 0, ave = 0;
		double percent = 0.0;
		System.out.print("How many numbers will you enter? ");
		arrSize = s.nextInt();
		
		int arr[] = new int [arrSize];
		
		System.out.println("Enter " + arrSize + " integers one per line:");
		for (int i = 0; i < arrSize; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; i < arrSize; i++) {
			sum += arr[i];
		}
		
		System.out.println("The sum is " + sum + ".");
		
		System.out.println("\nThe numbers are: ");
		
		for (int i = 0; i < arrSize; i++) {
			float perc = ((float) arr[i]/ sum) * 100;
			System.out.println(arr[i] + "\t" + perc +  " % of the sum.");
		}
	}

}
