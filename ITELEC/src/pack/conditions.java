package pack;
import java.util.Scanner;

public class conditions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int odd = 0, even = 0, pos = 0, neg = 0;
		System.out.println("How many numbers to input?");
		int numInput;
		numInput = s.nextInt();
		System.out.println("Input them now.");
		for (int i = 0; i < numInput; i++) {
			int num = s.nextInt();
			if (num %2==1 && num > 0) {
				odd++;
				pos++;
			}
			else if (num %2!=0 && num < 0) {
				odd++;
				neg++;
			}
			else if (num %2==0 && num > 0) {
				even++;
				pos++;
			}
			else if (num %2==0 && num < 0) {
				even++;
				neg++;
			}
		}
		System.out.println("Number of odd numbers: " + odd);
		System.out.println("Number of even numbers: " + even);
		System.out.println("Number of positive numbers: " + pos);
		System.out.println("Number of negative numbers: " + neg);
		
	}

}
