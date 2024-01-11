// ITELEC1 Asynchronous Activity 11/23/2023
package pack;
import java.util.Scanner;
public class ArraySumProduct {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int arrSize, sum = 0, ave = 0;
		System.out.print("Input the array size: ");
		arrSize = s.nextInt();
		
		int arr[] = new int [arrSize];
		
		System.out.println("\nInput the numbers: ");
		for (int i = 0; i < arrSize; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; i < arrSize; i++) {
			sum += arr[i];
		}
		ave = sum / arrSize;
		
		System.out.println("\nSum: " + sum);
		System.out.println("Average: " + ave);
	}
}
