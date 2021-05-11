package Business.Abstracts;

import Entities.Concretes.Game;
import Entities.Concretes.Sales;

public interface SaleService {

	void Add(Sales sale,Game game);
	
}
