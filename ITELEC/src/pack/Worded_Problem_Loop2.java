// 11/17/2023
package pack;
import java.util.Scanner;
public class Worded_Problem_Loop2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int startNum, endNum, sum = 0;
		
		System.out.println("Enter Start: ");
		startNum = s.nextInt();
		System.out.println("Enter End: ");
		endNum = s.nextInt();
		System.out.println();
		
		while (startNum <= endNum) {
			sum += startNum;
			System.out.println(startNum + " ");
			startNum++;
		}
		
		System.out.println("Sum of in range values: " + sum);
		
	}
}
