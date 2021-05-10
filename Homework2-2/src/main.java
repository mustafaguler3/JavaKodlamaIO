
public class main {

	public static void main(String[] args) {
		
		
		//USER
				User user = new User(1,"mustafa","güler","mustafa.glr@hotmail.com","12345");
				
				//INSTRUCTOR
				Instructor instructor = new Instructor(1,"Engin","Demirog","engin@..","123","Java&React");
				
				//STUDENT
				Student student = new Student(1,"Mustafa","güler","mustafa@hotmail.com","123456","Istanbul Uni");
						
				//USER MANAGER
				UserManager userManager = new UserManager();
				
				userManager.Add(user);
				userManager.login(user);
				userManager.Update(user);
				
				//INSTRUCTOR MANAGER
				InstructorManager instructorManager = new InstructorManager();
				
				instructorManager.Add(instructor);
				
				//STUDENT MANAGER
				StudentManager studentManager = new StudentManager();
				
				instructorManager.Add(student);
				
		
		

	}

}
