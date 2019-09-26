/**
 * 
 */

/**
 * @author Kesaven
 *
 */
public class Lecturer extends Person {
	 
	private String speciality;
	private String academia;
	private double hoursWorked;
	private double rate;
	
	

	/**
	 *Default constructors 
	 */
	public Lecturer() {
		super();// calling the default constructors from Person
		
		// TODO Auto-generated constructor stub
		
		this.speciality = null;
		this.academia = null;
		this.hoursWorked = 0.0;
		this.rate = 0.0;
	}

	/**
	 * @param nid
	 * @param name
	 * @param height
	 * @param weight
	 */
	public Lecturer(String nid, String name, double height, double weight, String speciality, String academia, double hoursWorked, double rate) {
		super(nid, name, height, weight);
		// TODO Auto-generated constructor stub
		
		this.speciality = speciality;
		this.academia = academia;
		this.hoursWorked = hoursWorked;
		this.rate = rate;
		
	}
	
	

	/**
	 * @return the speciality of lecturer
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @return the academia of lecturer
	 */
	public String getAcademia() {
		return academia;
	}

	/**
	 * @return the hoursWorked of lecturer
	 */
	public double getHoursWorked() {
		return hoursWorked;
	}

	/**
	 * @return the rate of lecturer
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param speciality the speciality to set 
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	/**
	 * @param academia the academia to set
	 */
	public void setAcademia(String academia) {
		this.academia = academia;
	}

	/**
	 * @param hoursWorked the hoursWorked to set
	 */
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a lecturer with name: " + super.getName() + "NID:" + super.getNid() + "weight: " + super.getWeight() + "height: " + super.getHeight() +"with sepciality:" + this.getSpeciality() + "academia:" + this.getAcademia() + "hours worked:" + this.getHoursWorked()+ "rate:" + this.getRate(); 
	}

	@Override
	public double calculateSalary(double hoursWorked, double rate) {
		// TODO Auto-generated method stub
		return (hoursWorked * rate);
	}

}
