package pack;
import java.util.Scanner;
public class Quiz1_Finals3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int b, l;
		
		System.out.print("Enter length of rectangle: _");
		l = s.nextInt();
		System.out.print("Enter breadth of rectangle: _");
		b = s.nextInt();
		
		if (b == l) {
			System.out.println("\nIt is a square.");
		}
		else {
			System.out.println("\nIt is not a sqaure.");
		}
		
	}

}
