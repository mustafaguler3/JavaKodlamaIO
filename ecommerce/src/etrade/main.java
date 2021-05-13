package etrade;

import java.util.ArrayList;
import java.util.List;

import Business.Abstracts.EmailService;
import Business.Abstracts.UserActivationService;
import Business.Abstracts.UserService;
import Business.Concretes.UserActivationManager;
import Business.Concretes.UserManager;
import Core.GoogleMailApiAdapter;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concretes.User;
import googleMailApi.GoogleMailManager;

public class main {

	public static void main(String[] args) {
		
		
		UserManager userManager = new UserManager(new HibernateUserDao(),new UserActivationManager(),new GoogleMailApiAdapter());
		UserActivationService userVerificationService = new UserActivationManager();
		User u = new User(1,"mustafa","güler","mustafaguler@gmail.com","123456");
		User u2 = new User(2,"yunus","güler","hasan@gmail.com","123456");
		User u3 = new User(3,"mehmet","güler","mehmet@gmail.com","123456");
		
		
		                                    
		userManager.register(u);
		userManager.register(u2);
		userManager.register(u3);
		
		
		System.out.println("*********************************************");
		                                     
		userVerificationService.verification(u);
		userVerificationService.verification(u2);
		userVerificationService.verification(u3);
		
		
		System.out.println("*********************************************");
		                                    
		userManager.Login("mustafaguler@gmail.com","123456");
		userManager.Login("mehmet@gmail.com","123456");
		userManager.Login("afdafa","fefgrhgf");
		
		
		

	}

}
