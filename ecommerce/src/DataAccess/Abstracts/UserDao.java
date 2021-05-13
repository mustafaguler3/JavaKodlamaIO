package DataAccess.Abstracts;

import java.util.List;

import Entities.Concretes.User;

public interface UserDao{
	
	void register(User user);	
	List<User> getAll();
	User listEmail(String email);
	User checkMailPassword(String email,String password);
	
	

}
