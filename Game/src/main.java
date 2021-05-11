import java.util.Date;
import java.util.GregorianCalendar;

import Adapters.MernisServiceAdapter;
import Business.Concretes.CampaignManager;
import Business.Concretes.CustomerManager;
import Business.Concretes.GameManager;
import Business.Concretes.PlayerManager;
import Business.Concretes.SaleManager;
import DataAccess.Abstracts.CampaignDao;
import DataAccess.Concretes.HibernateCampaignDao;
import DataAccess.Concretes.HibernateCustomerDao;
import DataAccess.Concretes.HibernateGameDao;
import DataAccess.Concretes.HibernatePlayerDao;
import DataAccess.Concretes.HibernateSaleDao;
import Entities.Concretes.Campaign;
import Entities.Concretes.Customer;
import Entities.Concretes.Game;
import Entities.Concretes.Player;
import Entities.Concretes.Sales;

public class main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new HibernateCustomerDao(), new MernisServiceAdapter());		
		CampaignManager campaignManager = new CampaignManager(new HibernateCampaignDao());		
		GameManager gameManager = new GameManager(new HibernateGameDao());
		PlayerManager playerManager = new PlayerManager(new HibernatePlayerDao());
		SaleManager saleManager = new SaleManager(new HibernateSaleDao());
		
		Customer customer = new Customer(1, "mustafa", "güler", 123456, new Date(1996, 5, 2));
		Campaign campaign = new Campaign(1, "Black Friday", 70);
		Game game = new Game(1, "Pes 2021", 250);
		Player player = new Player(1, "mustafa11");
		Sales sale = new Sales(1, 1, 1, 1, 1);
		
		customerManager.Add(customer);		
		campaignManager.Add(campaign);		
		gameManager.Add(game);		
		playerManager.register(player);
		saleManager.Add(sale,game);
	}

}
