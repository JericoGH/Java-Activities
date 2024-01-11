package pack;
import java.util.Scanner;
public class Van_arraysize {

	public static void main(String[] args) {
		
		        Scanner input = new Scanner(System.in);
		     
		        char runAgain;

		        do 
		        {
		            int size;
		            int sume = 0, sumo = 0 ;
		        
		            System.out.print("Using Java What is the array size? ");
		            size = input.nextInt();

		            System.out.println("Input the " + size + " array contents:");
		            
		            int[] array = new int[size];
		            for (int i = 0; i < size; i++)
		            {
		                array[i]= input.nextInt();
		            }
		            
		            for (int num : array) 
		            {
		                if (num % 2 == 0) 
		                {
		                    sume += num;
		                } else 
		                {
		                    sumo += num;
		                }
		            }

		            System.out.println("Even numbers are: ");
		            displayarray(array, true);
		            
		            System.out.println("Odd numbers are: ");
		            displayarray(array, false);
		            
		            System.out.println("Sum of even numbers: " + sume);
		            System.out.println("Sum of odd numbers: " + sumo);

		            System.out.print("Press Y to Run Program Again: ");
		            runAgain = input.next().charAt(0);

		        } 
		        while (runAgain == 'Y' || runAgain == 'y');
		    }

		    private static void displayarray(int[] array, boolean isEven) 
		    {
		        for (int num : array)
		        {
		            if ((num % 2 == 0) == isEven)
		            {
		                System.out.print(num + " ");
		            }
		        }
		        System.out.println(" ");
		    }
		}
