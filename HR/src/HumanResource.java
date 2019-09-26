import java.util.Scanner;
/**
 * 
 */

/**
 * @author Kesaven
 *
 */
public class HumanResource {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 0;
		
		String nid, name, sid, course, responsibleParty, speciality, academia;
		double height, weight, hoursWorked, rate;
		
		
		
		Scanner mykeyboard = new Scanner(System.in);
		
		System.out.println("Enter NID of student: ");
		nid = mykeyboard.next();
		System.out.println("Enter name of student: ");
		name = mykeyboard.next();
		System.out.println("Enter height  of student:");
		height = mykeyboard.nextDouble();
		System.out.println("Enter weight of student: ");
		weight = mykeyboard.nextDouble();
		System.out.println("Enter Student ID of student: ");
		sid = mykeyboard.next();
		System.out.println("Enter the course of student:");
		course = mykeyboard.next();
		System.out.println("Enter responsible party name of student: ");
		responsibleParty = mykeyboard.next();
		
		Student S1 = new Student(nid, name, height, weight, sid, course, responsibleParty);
		
		/********************************************************************/
		
		System.out.println("Enter NID of lecturer: ");
		nid = mykeyboard.next();
		System.out.println("Enter name of lecturer: ");
		name = mykeyboard.next();
		System.out.println("Enter height  of lecturer:");
		height = mykeyboard.nextDouble();
		System.out.println("Enter weight of lecturer: ");
		weight = mykeyboard.nextDouble();
		System.out.println("Enter speciality of lecturer: ");
		speciality = mykeyboard.next();
		System.out.println("Enter academia of lecturer: ");
		academia = mykeyboard.next();
		System.out.println("Enter hours worked of lecturer: ");
		hoursWorked = mykeyboard.nextDouble();
		System.out.println("Enter rate of lecturer: ");
		rate = mykeyboard.nextDouble();
		
		Lecturer L1 = new Lecturer(nid, name, height, weight, speciality, academia, hoursWorked, rate );
		System.out.println("Salary of MR " + L1.getName() +" is" + L1.calculateSalary(hoursWorked, rate) );
	}

}
