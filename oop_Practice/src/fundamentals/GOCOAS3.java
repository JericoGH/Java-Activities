package fundamentals;
import java.util.Scanner;
public class GOCOAS3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int min, day, year, min2day, min2year;
		
		System.out.println("Input the number of minutes: ");
		min = s.nextInt();
		
		day = 60 * 24;
		year = 60 * 24 * 365;
		min2day = min / day;
		min2year = min / year;
		
		System.out.println(min + " minutes is approximately " +
						   min2year + " years and " + min2day + " days");
	}
}