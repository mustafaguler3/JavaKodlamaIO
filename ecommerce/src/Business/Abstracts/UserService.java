package Business.Abstracts;

import java.util.List;

import Entities.Concretes.User;

public interface UserService {
	
	void register(User user);	
	void Login(String email,String password);
	List<User> getAll();
}
