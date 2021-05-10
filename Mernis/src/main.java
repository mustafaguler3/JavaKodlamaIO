import java.util.GregorianCalendar;

import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

public class main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();		
			
		Customer customer = new Customer(1, "mustafa", "güler", new GregorianCalendar(1996,4,3).getTime(), 125468);
		
		
		customerManager.Save(customer);
	


	}
}
