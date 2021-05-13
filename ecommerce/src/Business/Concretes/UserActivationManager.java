package Business.Concretes;

import java.util.regex.Pattern;

import Business.Abstracts.UserActivationService;
import Core.Rules;
import Entities.Concretes.User;


public class UserActivationManager implements UserActivationService{

	public static final Pattern mailRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean checkIfEmailExist(String email) {
		
		return mailRegex.matcher(email).find();
	}

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length()>=2) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length()>=2) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkPassword(String password) {
		if(password.length()>=6) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkUser(User user) {
		boolean result = Rules.run(
				 checkFirstName(user.getName()),
				 checkLastName(user.getSurname()),
				 checkPassword(user.getPassword()),
				 checkIfEmailExist(user.getEmail())
				 );
		 return result;
	}

	@Override
	public void sendMail(String email) {
		System.out.println("Please " + email +" click activation code sent to your email");
		
	}

	@Override
	public void verification(User user) {
		user.setVerification(true);
		System.out.println(user.getEmail() + " your mail successfully was verified , you can sign in");
	}

	@Override
	public boolean checkEmailPassword(String email, String password) {
		if(email !="" && password!="") {
			return true;
		}else {
			return false;
		}
	}

}
