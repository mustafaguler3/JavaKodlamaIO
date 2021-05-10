
public class Instructor extends User {

	
	private String givenCourse;
	
	
	public Instructor(int id, String firstname, String lastname, String email, String password,String givenCourse) {
		super(id, firstname, lastname, email, password);
		this.givenCourse = givenCourse;
	}


	public String getGivenCourse() {
		return givenCourse;
	}


	public void setGivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}


	
	

}
