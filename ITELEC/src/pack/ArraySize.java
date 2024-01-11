package pack;
import java.util.Scanner;
public class ArraySize {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean retryVal = true;
		char retry;
		
		while(retryVal) {
			int arrSize, sumOdd = 0, sumEven = 0, ctrOdd = 0, ctrEven = 0;
			
			System.out.println("What is the array size?");
			arrSize = s.nextInt();
			
			int arr[] = new int [arrSize];
			
			System.out.println("Input the " + arrSize + " array contents:");
			for (int i = 0; i < arrSize; i++) {
				arr[i] = s.nextInt();
			}
			
			System.out.print("\nEven Numbers are: ");
			for (int i = 0; i < arrSize; i++) {
				if (arr[i]%2==0) {
					System.out.print(arr[i] + " ");
					ctrEven++;
					sumEven += ctrEven;
					}
				}
			System.out.print("\nOdd Numbers are: ");
			for (int i = 0; i < arrSize; i++) {
				if (arr[i]%2==1) {
					System.out.print(arr[i] + " ");
					ctrOdd++;
					sumOdd += ctrOdd;
					}
				}
			System.out.println("\nSum of even numbers: " + sumEven);
			System.out.println("Sum of odd numbers: " + sumOdd);
			
			System.out.print("\nPress \"Y\" to run again: ");
			retry = s.next().charAt(0);
			if (retry != 'Y') {
				retryVal = false;
			}
		System.out.println("\n\n");
		}
	}
}