package fundamentals;
import java.util.Scanner;
public class GOCOAS3_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float bmi, w, h;
		System.out.println("Input weight in pounds: ");
		w = s.nextInt();
		System.out.println("Input height in inches: ");
		h = s.nextInt();
		
		bmi = (703 * w) / (h * h);
		
		System.out.println("Body Mass Index is : " + bmi);
	}

}