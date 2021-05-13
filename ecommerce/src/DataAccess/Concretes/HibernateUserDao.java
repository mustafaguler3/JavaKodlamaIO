package DataAccess.Concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class HibernateUserDao implements UserDao{
	
	private ArrayList<User> users;
	

	public HibernateUserDao() {
		
		this.users = new ArrayList<User>();
	}

	@Override
	public void register(User user) {		
		users.add(user);	
	}


	@Override
	public List<User> getAll() {
		
		for(User u : users) {
			System.out.println(u.getEmail() + " " +u.getPassword());
		}
		
		
		return users;
	}

	@Override
	public User listEmail(String email) {
		
		for(User u : users) {
			if(u.getEmail()==email) {
				return u;
			}
		}
		
		return null;
	}

	@Override
	public User checkMailPassword(String email, String password) {
		for(User user : users) {
			if(user.getEmail() == email && user.getPassword() == password)
				return user;
		}
		return null;
	}


}
