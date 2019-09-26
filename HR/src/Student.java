/**
 * 
 */

/**
 * @author Kesaven
 *
 */
public class Student extends Person {
	
	//define attributes
	
	private String sid;
	private String course;
	private String responsibleParty;
	

	/**
	 * default constructor
	 */
	public Student() {
		super();//calling the default constructor of the Parent class
		
		// TODO Auto-generated constructor stub
		
		this.sid = null;
		this.course = null;
		this.responsibleParty = null;
	}
	
	/**
	 * overloaded constructors with 7 params
	 * @param nid of student
	 * @param name of student
	 * @param height of student
	 * @param weight of student
	 * @param sid of student
	 * @param course of student
	 * @param responsibleParty of student
	 */
	public Student(String nid, String name, double height, double weight, String sid, String course, String responsibleParty) {
		super(nid, name, height, weight);
		// TODO Auto-generated constructor stub
		
		this.sid = sid;
		this.course = course;
		this.responsibleParty = responsibleParty;
	}

	/**
	 * @return the sid of student
	 */
	public String getSid() {
		return sid;
	}



	/**
	 * @return the course of student
	 */
	public String getCourse() {
		return course;
	}



	/**
	 * @return the responsibleParty of student
	 */
	public String getResponsibleParty() {
		return responsibleParty;
	}



	/**
	 * @param sid the sid to set for student
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}



	/**
	 * @param course the course to set for student
	 */
	public void setCourse(String course) {
		this.course = course;
	}



	/**
	 * @param responsibleParty the responsibleParty to set for student
	 */
	public void setResponsibleParty(String responsibleParty) {
		this.responsibleParty = responsibleParty;
	}



	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a student with Name "+ super.getName() + "nid: "+ super.getNid()+ "student id:" + this.getSid() + "height: " + super.getHeight() + "weight" + super.getWeight()+ "course: " + this.getCourse() + "and responsible party: " + this.getResponsibleParty();
	}

	@Override
	public double calculateSalary(double hoursWorked, double rate) {
		// TODO Auto-generated method stub
		return 0.0;
	}

}
