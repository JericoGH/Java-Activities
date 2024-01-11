// 10/14/2023
package pack;
import java.util.Scanner;
import java.lang.Math;
public class Pentagon_Area {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input the number of sides: ");
		double side = s.nextInt();
		System.out.print("Input the sides: ");
		double apothem = s.nextInt();

	    double area = (side * apothem * apothem) / (4 * Math.tan(Math.PI / 5));

	    System.out.println("Area of the pentagon: " + area);
	}
}