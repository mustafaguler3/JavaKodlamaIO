
public class Course {
	
	private int courseId;
	private int categoryId;
	private String name;
	private String image;
	private String instructor;
	
	
	public Course(int courseId, int categoryID,String name, String image, String instructor) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.image = image;
		this.instructor = instructor;		
		this.categoryId = categoryID;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getInstructor() {
		return instructor;
	}


	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	
	
	
	

}
