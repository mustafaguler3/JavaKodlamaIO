package Adapters;

import java.rmi.RemoteException;

import Business.Abstracts.CustomerCheckService;
import Entities.Concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkRealPerson(Customer customer) {
		
		
		try {
			
			KPSPublicSoapProxy kps = new KPSPublicSoapProxy();
			
			return kps.TCKimlikNoDogrula(customer.getIdentityNumber(), customer.getFirstname(), customer.getLastname(), (int) customer.getBirthDate().getTime());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
