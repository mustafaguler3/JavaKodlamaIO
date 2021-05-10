
public class CategoryManager {
	
	
	
	public void add(Category category) {
		System.out.println("category added " + category.getCategoryName());
	}
	
	public void delete(Category category,int id) {
		
		if(category.getCategoryId() == id) {
			System.out.println("category deleted");
		}
		
		
	}
	

}
