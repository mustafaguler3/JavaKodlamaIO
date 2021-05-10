package Abstracts;
import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService,CustomerCheckService{

	@Override
	public void Save(Customer customer) throws Exception{
		System.out.println(customer.getFirstName() + " successfully added to db");
		
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws Exception {
				
		
		return true;
	}
	
	
	

	

}
