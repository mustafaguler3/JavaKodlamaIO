package Business.Concretes;

import Business.Abstracts.CustomerCheckService;
import Business.Abstracts.CustomerService;
import DataAccess.Abstracts.CustomerDao;
import Entities.Concretes.Customer;

public class CustomerManager implements CustomerService,CustomerCheckService{
	
	private CustomerDao customerDao;
	private CustomerCheckService checkService;
	

	public CustomerManager(CustomerDao customerDao,CustomerCheckService chekService) {
		super();
		this.customerDao = customerDao;
		this.checkService = checkService;
	}



	@Override
	public void Add(Customer customer) {
		customerDao.Add(customer);
		
	}



	@Override
	public boolean checkRealPerson(Customer customer) throws Exception {
		
		if(checkService.checkRealPerson(customer)) {
			customerDao.Add(customer);
		}else {
			throw new Exception("Not a valid customer");
		}
		
		return true;
	}




}
