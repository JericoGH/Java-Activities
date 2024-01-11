// 10/04/2023
package pack;
import java.util.Scanner;
import java.text.*;
class GoodItem {
	String productName;
	int quantity;
	double price, total, vat, totalAmount;
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter product name: ");
		productName = s.nextLine();
		System.out.print("Quantity: ");
		quantity = s.nextInt();
		System.out.print("Price: ");
		price = s.nextFloat();
	}
	
	void compute() {
		total = price * quantity;
		vat = total * 0.12;
		totalAmount = total + vat;
	}
}
public class Methods {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat ("###.##");
		GoodItem asin = new GoodItem();
		asin.input();
		asin.compute();
		System.out.println("You purchased " + asin.quantity + " pcs. of " + 
							asin.productName + " with the amount of " + df.format(asin.totalAmount));
	}
}
