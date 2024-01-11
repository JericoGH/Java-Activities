//ITELEC Lab Activity 12/06/2023
package pack;

public class ArrayProgram {

	public static void main(String[] args) {
		double ave = 0.0, total = 0.0;
		int newNumbers [] = {10, 6, 88, 91, 25, 77, 14, 23, 4, 23, 66, 81};
		
		System.out.println("Contents of newNumbers Array:");
		for (int i = 0; i < 12; i++) {
			System.out.print(newNumbers[i] + ", ");
		}
		
		System.out.println("\n5th element is: " + newNumbers[4]);
		newNumbers[4] = 35;
		System.out.println("New 5th element value: " + newNumbers[4]);
		System.out.println("Contents of newNumbers Array in reverse order:");
		for (int j = 11; j >= 0; j--) {
			System.out.print(newNumbers[j] + ", ");
		}
		
		for (int a = 0; a < 12; a++) {
			total += newNumbers[a];
		}
		ave = total / 12.0;
		System.out.println("\nAverage of newNumbers Array: " + ave);
	}
}