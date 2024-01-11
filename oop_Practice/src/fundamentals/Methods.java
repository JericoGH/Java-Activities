package fundamentals;
import java.util.Scanner;

public class Methods {
	
	static void summation(int num1, int num2, int num3) {
		int total = 0;
		total = num1 + num2 + num3;
		System.out.println("\nThe total is: " + total);
	}
	
	static void text1() {
		System.out.print("Enter a number: ");
	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i = 0; i <= 2; i++) {
			text1();
			arr[i] = a.nextInt();
		}
		
		summation(arr[0], arr[1], arr[2]);
	}

}
