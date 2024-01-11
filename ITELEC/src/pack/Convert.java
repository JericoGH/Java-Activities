package pack;
import java.util.Scanner;
public class Convert {

	public static void main(String[] args) {
		Scanner myin = new Scanner(System.in);
		
		int num1, num2, sum;
		
		System.out.print("Enter your first Number: ");
		num1 = myin.nextInt();
		
		System.out.print("Enter your Second Number: ");
		num2 = myin.nextInt();
		
		sum = num1 + num2;
		
		System.out.println("Sum = " + sum);

	}

}
