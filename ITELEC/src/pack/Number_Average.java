// 10/14/2023
package pack;
import java.util.Scanner;
public class Number_Average {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1, num2, num3;
		double ave;
		System.out.print("Input the first number: ");
		num1 = s.nextInt();
		System.out.print("Input the second number: ");
		num2 = s.nextInt();
		System.out.print("Input the third number: ");
		num3 = s.nextInt();
		
		ave = (num1 + num2 + num3) / 3;
		
		System.out.print("The average value is: " + ave);
	}
}