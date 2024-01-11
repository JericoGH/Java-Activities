package pack;
import java.util.*;
public class Vino2darr {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int lowOccur=0,highOccur=0;
		System.out.print("Iput array row : ");
		int row = input.nextInt();
		System.out.print("Iput array col : ");
		int col = input.nextInt();
		int[][] num = new int[row][col+1];
		System.out.println("Input Array content");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				num[i][j]=input.nextInt();
			}
		}
		int lowest = 0;
		int highest= 0;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if (num[i][j]>num[i][j+1]) {
					highest = num[i][j];
				}
		
			
				
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if (num[i][j]<num[i][j+1]) {
					lowest = num[i][j];
				}

			
				
			}
		}
		

		
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if (highest == num[i][j]) {
					highOccur++;
				}
				if(lowest == num[i][j]) {
					lowOccur++;
				}
			}
		}
		
		
		System.out.println("Highest Number : "+ highest);
		System.out.println("Lowest Number : "+ lowest);
		System.out.println("Higest Number occurence : "+ highOccur);
		System.out.println("Lowest Number occurence : "+ lowOccur);
		
	}

}
