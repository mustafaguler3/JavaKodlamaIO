package Core;

import Business.Abstracts.EmailService;
import Entities.Concretes.User;
import googleMailApi.GoogleMailManager;

public class GoogleMailApiAdapter implements EmailService{	

	@Override
	public boolean CheckIfTrueMail(User user) {
		GoogleMailManager googleMailManager = new GoogleMailManager();
	    return googleMailManager.CheckIfTrueMail(user);
		
	}
}
