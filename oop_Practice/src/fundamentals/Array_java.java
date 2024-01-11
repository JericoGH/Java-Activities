package fundamentals;
import java.util.Scanner;
public class Array_java {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String email[] = new String[4];
		String username[] = new String[4];
		String password[] = new String[4];
		
		int p;
		for (int i = 0; i < 2; i++) {
			p = i + 1;
			System.out.print("\nUser " + p + " Credentials:\n");
			System.out.print("Email: ");
			email[i] = input.nextLine();
			System.out.print("Username: ");
			username[i] = input.nextLine();
			System.out.print("Password: ");
			password[i] = input.nextLine();
		}
		
		for (int j = 0; j < 3; j++) {
			p = j + 1;
			System.out.println ("User " + p + " Credentials\nEmail: " + email[j]+ "\nUsername: " + username[j] + "\nPassword: " + password[j]);
		}
		
	}

}
