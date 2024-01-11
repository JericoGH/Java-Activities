// ITEELEC1 Asynchronous activity 11/23/2023
package pack;
import java.util.Scanner;
public class ArrayInputNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int arr[] = new int [10];
		int numSearch, ctr = 0;
		boolean numMatch = false;
		
		System.out.println("Input 10 numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.print("\nInput a number to search: ");
		numSearch = s.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == numSearch) {
				numMatch = true;
			}
		}
		if (numMatch == false) {
			System.out.println("\nThe number is not present in the array.");
		}
		else {
			System.out.println("\nThe number is present in the array.");
		}
	}
}