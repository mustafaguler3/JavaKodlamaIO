
public class StudentManager extends UserManager{
		

	public void Add(Student student) {
		System.out.println("Student Added ");
		super.Add(student);
	}
	
	
	
	public void login(Student student) {
		System.out.println("logged to system");
		super.login(student);
	}
	
	
	public void logout(Student student) {
		System.out.println("logout from system");
		super.logout(student);
		
	}
	

}
