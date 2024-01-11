package fundamentals;
import java.util.Scanner;
public class GOCOAS1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int num1, num2, sum, dif, product, quotient, mod;
		
		System.out.print("Input first number: ");
		num1 = s.nextInt();
		System.out.print("Input second number: ");
		num2 = s.nextInt();
		
		sum = num1 + num2;
		dif = num1 - num2;
		product = num1 * num2;
		quotient = num1 / num2;
		mod = num1 % num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " - " + num2 + " = " + dif);
		System.out.println(num1 + " * " + num2 + " = " + product);
		System.out.println(num1 + " / " + num2 + " = " + quotient);
		System.out.println(num1 + " mod " + num2 + " = " + mod);
	}
}