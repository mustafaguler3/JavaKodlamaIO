
public class UserManager {

	
	public void Add(User user) {
		System.out.println("added user named" + user.getFirstname());
	}
	
	public void Delete(User user) {
		System.out.println("deleted user named" + user.getFirstname());
	}
	
	public void Update(User user) {
		System.out.println("updated user named" + user.getFirstname());
	}
	
	
	public void login(User user) {
		System.out.println("logged into the system" + user.getFirstname());
	}
	
	public void logout(User user) {
		System.out.println("logout to system" + user.getFirstname());
	}

	
	
}
