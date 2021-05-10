package Adapters;

import java.rmi.RemoteException;

import Abstracts.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService{

	
	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {
		
		
			KPSPublicSoapProxy p = new KPSPublicSoapProxy();
			
		
		return p.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName(), customer.getLastname(), customer.getBirthDate());
	}
	
	

}
