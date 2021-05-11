package DataAccess.Concretes;

import Business.Abstracts.CustomerCheckService;
import DataAccess.Abstracts.CustomerDao;
import Entities.Concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{

	@Override
	public void Add(Customer customer) {
		System.out.println("Customer was added into the system : "+customer.getFirstname() + " " + customer.getLastname() + " " + customer.getIdentityNumber());
		
	}


	

}
