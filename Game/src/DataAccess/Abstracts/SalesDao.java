package DataAccess.Abstracts;

import Entities.Concretes.Game;
import Entities.Concretes.Sales;

public interface SalesDao {

	void Add(Sales sale,Game game);
	
}
