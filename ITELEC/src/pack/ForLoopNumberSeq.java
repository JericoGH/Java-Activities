// 11/17/2023
package pack;
public class ForLoopNumberSeq {

	public static void main(String[] args) {
		
		System.out.print("a. ");
		for (int i = 2; i <= 20; i+=2) {
			System.out.print(i + " ");	
		}
		System.out.println();
		
		System.out.print("b. ");
		for (int i = 19; i > 0; i-=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("c. ");
		for (int i = 1; i <= 5; i++) {
				System.out.print(i + " ");
				System.out.print((i * 5) + " ");
		}
		System.out.println();
	}
}