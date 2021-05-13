package Business.Abstracts;

import Entities.Concretes.User;

public interface EmailService {
	boolean CheckIfTrueMail(User user);
}
