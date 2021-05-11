package DataAccess.Concretes;

import DataAccess.Abstracts.SalesDao;
import Entities.Concretes.Game;
import Entities.Concretes.Sales;

public class HibernateSaleDao implements SalesDao{
	
	
	@Override
	public void Add(Sales sale,Game game) {
		
		if(sale.getGameId() == game.getGameid()) {
			System.out.println("The Game was sold " + game.getGameName() + " for $"+ game.getUnitPrice());
		}
		
		
	}

}
