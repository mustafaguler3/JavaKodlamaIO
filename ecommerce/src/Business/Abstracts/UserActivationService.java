package Business.Abstracts;

import Entities.Concretes.User;

public interface UserActivationService {

	boolean checkIfEmailExist(String email);
	
	boolean checkFirstName(String firstName);
		
	boolean checkLastName(String lastName);
		
	boolean checkPassword(String password);
	
	boolean checkUser(User user);
	
	void sendMail(String email);
	
	void verification(User user);
	
	boolean checkEmailPassword(String email,String password);
}
