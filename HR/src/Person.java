/**
 * 
 */

/**
 * @author Kesaven
 *
 */
public abstract class Person {
	//attributes
	private String nid;
	private String name;
	private double height;
	private double weight;
	

	/**
	 * 
	 */
	public Person() {
		// TODO Auto-generated constructor stub
		
		//constructors
		
		
		/**
		 * Default constructor
		 */
		this.nid = null;
		this.name = null;
		this.height = 0.0;
		this.weight = 0.0;
		
	}
	
	
	/**
	 * overloaded constructor with 4 parameters
	 ** @param nid
	 * @param name
	 * @param height
	 * @param weight
	 */
	public Person(String nid, String name, double height, double weight) {
		this.nid = nid;
		this.name = name;
		this.height = height;
		this.weight = weight;
			
	}


	/**
	 * @return the nid
	 */
	public String getNid() {
		return this.nid;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}


	/**
	 * @return the height
	 */
	public double getHeight() {
		return this.height;
	}


	/**
	 * @return the weight
	 */
	public double getWeight() {
		return this.weight;
	}


	/**
	 * @param nid the nid to set
	 */
	public void setNid(String nid) {
		this.nid = nid;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}


	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	public double calculateBmi(double height, double weight) {
		return (weight / Math.pow((height/100), 2));
	}
	
	/**
	 * compare if two person are the same
	 * @param p is the Person with whom we are comparing
	 * @return true if both Persons are the same
	 */
	public boolean equals(Person p) {
		if(this.nid.equalsIgnoreCase(p.nid)) {
			return true;
		}
		else {
			return false;
		}
			
		
	}
	
	@Override
	public abstract String toString();
	
	/**
	 * 
	 * @param hoursWorked
	 * @param rate
	 * @return
	 */
	public abstract double calculateSalary(double hoursWorked, double rate);
	
	
	

}
