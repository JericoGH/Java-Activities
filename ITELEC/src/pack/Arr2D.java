package pack;
import java.util.Scanner;
class Arr2D {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r, c, highest = 0, lowest = 0;
		
		
		System.out.print("Input the array row: ");
		r = s.nextInt();
		System.out.print("Input the array column: ");
		c = s.nextInt();
		int arr[][] = new int [r][c];
		System.out.println("Input " + (r * c) + " array content: ");
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		highest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > highest){
					highest = arr[i][j];
				}
			}
		}
		System.out.println("Highest number: " + highest);
		
		lowest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < lowest){
					lowest = arr[i][j];
				}
			}
		}
		System.out.println("Lowest number: " + lowest);
		int highestocc = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (highest == arr[i][j]){
					highestocc++;
				}
			}
		}
		System.out.println("Highest Number occurence: " + highestocc);
		
		int lowestocc = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (lowest == arr[i][j]){
					lowestocc++;
				}
			}
		}
		System.out.println("Lowest Number occurence: " + lowestocc);
	}

}
