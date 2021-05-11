package Business.Abstracts;

import Entities.Concretes.Customer;

public interface CustomerCheckService {

	boolean checkRealPerson(Customer customer) throws Exception;
	
}
