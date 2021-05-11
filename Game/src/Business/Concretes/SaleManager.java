package Business.Concretes;

import Business.Abstracts.SaleService;
import DataAccess.Abstracts.SalesDao;
import Entities.Concretes.Game;
import Entities.Concretes.Sales;

public class SaleManager implements SaleService{
	
	private SalesDao saleDao;
	
	public SaleManager(SalesDao saleDao) {
		this.saleDao = saleDao;
	}
	

	@Override
	public void Add(Sales sale,Game game) {

		saleDao.Add(sale,game);
		
	}



}
