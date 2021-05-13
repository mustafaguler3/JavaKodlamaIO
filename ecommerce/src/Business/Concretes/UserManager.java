package Business.Concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Business.Abstracts.EmailService;
import Business.Abstracts.UserActivationService;
import Business.Abstracts.UserService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private UserActivationService activationService;
	private EmailService emailService;
	
	

	public UserManager(UserDao userDao, UserActivationService activationService, EmailService emailService
	) {
		
		this.userDao = userDao;
		this.activationService = activationService;
		this.emailService = emailService;
		
	}

	@Override
	public void register(User user) {		
		
		if(!checkIfUserExists(user.getEmail())){
			System.out.println("The email is already taken");
			return;
		}
		
		if(!emailService.CheckIfTrueMail(user)) {
			System.out.println("your mail could not varifed by google");
			return;
		}
		
		if(!activationService.checkUser(user)) {
			System.out.println("your name and surname 2 , your password must be 6 char");
			return;
		}
		
		
		
		
		userDao.register(user);
		activationService.sendMail(user.getEmail());
		
	}

	@Override
	public void Login(String email, String password) {

		if(!activationService.checkEmailPassword(email, password)) {
			System.out.println("unsuccessfully sing in");
			return;
		}
		
		User loginUser= userDao.checkMailPassword(email, password);
		if(loginUser != null && loginUser.isVerification()) {
			System.out.println(loginUser.getName() + " " + loginUser.getSurname() + " successfully sing in." );
		}else {
			System.out.println("not valid login. try again");
		}
		
	}

	private boolean checkIfUserExists(String email) {
		return userDao.listEmail(email) == null;
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}
	

}
