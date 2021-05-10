
public class CourseManager {
	
	
	
	public void addCourse(Course course) {
		System.out.println("course added " + course.getName());
	}
	
	
public void delete(Course course,int id) {
		
		if(course.getCourseId() == id) {
			System.out.println("course deleted");
		}
		
		
	}

}
