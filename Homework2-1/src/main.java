
public class main {

	public static void main(String[] args) {
		
		CourseManager courseManager = new CourseManager();
		CategoryManager categoryManager = new CategoryManager();
		
		
		
		Course course = new Course(1,1,"Java - React", "1.png", "Engin Demirog");
		Course course2 = new Course(2,1,"C# - Angular", "2.png", "Engin Demirog");		
		Category category = new Category(1, "Programming");		
		
		
		Course[] courses = {course,course2};
		Category[] categories = {category};
		
		
		courseManager.addCourse(new Course(3, 1, "Python", "3.png", "Engin Demirog"));
		categoryManager.add(new Category(1, "Programming"));
		
		
		for(Course c : courses) {
						
			System.out.println(c.getName() + "" +c.getInstructor()+" "+c.getCourseId());
		}
		
		
		for(Category c : categories) {
			
			System.out.println(c.getCategoryName() + "" +c.getCategoryId());
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
