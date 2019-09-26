import java.util.Scanner;
/**
 * 
 */

/**
 * @author Kesaven
 *
 */
public class Average {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring variable
		Scanner keyboard = new Scanner(System.in);
		double total = 0;
		double mark = 0;
		int count = 0;
		
		double maximum = 1 ;
		double minimum = 100 ;
		//Output
		System.out.print("Enter the marks: ");
		mark = keyboard.nextDouble();
		//check until mark is not equal to -1
		while (mark != -1) {
	
			//calculate total
			total = (total + mark);
			//increment count
			count++ ;
			//Output
			System.out.print("Enter the marks: ");
			//store mark
			mark = keyboard.nextDouble();
			//calculating minimum and maximum mark
			//using AND Gates
			if (mark < minimum && mark > 0 ) {
				minimum = mark;
			}
				
				if (mark > maximum && mark > 0 ) {
					maximum = mark;
				}
		}
		//declaring variable
		double avg = 0.0;
		//calculate average
		avg = total/count;
		//output
		System.out.println("Average marks= " + avg);
		System.out.println(minimum + "is  minimum");
		System.out.println(maximum + "is maximum");
		
		
		
		
			//end
			keyboard.close();
			
	 }
		
		
		
}

 	


	
	
