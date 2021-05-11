package Business.Concretes;

import Business.Abstracts.CustomerCheckService;
import Business.Abstracts.PlayerService;
import DataAccess.Abstracts.PlayerDao;
import Entities.Concretes.Customer;
import Entities.Concretes.Player;

public class PlayerManager implements PlayerService{
	
	private PlayerDao playerDao;
	
	public PlayerManager(PlayerDao playerDao) {		
		
		this.playerDao = playerDao;
	}

	@Override
	public void register(Player player) {		
		playerDao.register(player);
	}

	@Override
	public void update(Player player) {
		playerDao.update(player);		
	}

	@Override
	public void delete(Player player) {		
		playerDao.delete(player);
	}

	

}
