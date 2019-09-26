import java.util.Scanner;
/**
 * 
 */

/**
 * @author Kesaven
 *
 */
public class Question2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in) ;
		
		double time;
		double seconds;
		int input;
		
		do {
			System.out.println("Time In Seconds: ");
			seconds = keyboard.nextDouble();
			
			time = (seconds / 60 );
			System.out.println("Minutes=" + time + "min");
		
			
			do {
				System.out.println("To continue press 1 or to exit press 2.");
				input = keyboard.nextInt();
				
				if (input!= 1 && input != 2) {
					System.out.println("invalid input, please enter again.");
				}
			
			}while(input != 1 && input !=2 );
			
			if (input == 2) {
				System.out.println("Youre exiting the program.");
				
			}
		
		}while( input == 1);

		
		
		keyboard.close();

	}

}
