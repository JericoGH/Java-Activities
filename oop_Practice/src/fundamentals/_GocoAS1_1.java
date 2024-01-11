package fundamentals;
import java.util.Scanner;
public class _GocoAS1_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int birthYear, curYear, age;
		
		System.out.println("Input birth year: ");
		birthYear = s.nextInt();
		
		System.out.println("Current Year: ");
		curYear = s.nextInt();
		
		age = curYear - birthYear;
		
		System.out.println("Age: " + age);

	}
}
