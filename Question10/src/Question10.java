import java.util.Scanner;

/**
 * 
 */

/**
 * @author Kesaven
 *
 */
public class Question10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		//declaring variables
		double num1, num2, num3, num4;
		double sum;
		double average;
		int reply;
		
		//loop for re-entering number
		do {
			
		//allowing user to input 4 numbers
		System.out.println("Enter number 1: ");
		//store numbers
		num1 = keyboard.nextDouble();
		System.out.println("Enter number 2: ");
		num2 = keyboard.nextDouble();
		System.out.println("Enter number 3: ");
		num3 = keyboard.nextDouble();	
		System.out.println("Enter number 4: ");
		num4 = keyboard.nextDouble();
		
		//calculating sum
		sum = num1 + num2 + num3 + num4 ;
		
		//calculating average
		average = sum / 4 ;
		
		//output
		System.out.println("Average =  " + average);
			//loop to continue or exit
			do {
				System.out.println("To continue enter 1 and to exit enter 2:");
				reply = keyboard.nextInt();
				
				//condition to check reply
				if(reply != 1 && reply != 2 ) {
				//output
				System.out.println("Invalid reply please enter angain ");
				}
			
			}while(reply != 1 && reply !=2 );
		//if user enter two exit program
		if (reply == 2) {
			System.out.println("You're exiting the program");
		}
		
		//if enter one restart the loop
		}while(reply == 1);
		
		keyboard.close();
	}
		
}
		
