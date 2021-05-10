package Concretes;

import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
		
	}
	
	@Override
	public void Save(Customer customer) throws Exception{
		
			if(customerCheckService.CheckIfRealPerson(customer)) {
				
				super.Save(customer);
				
			}else {
				throw new Exception("Not valid a person");
			}
		} 
		
	}

	
