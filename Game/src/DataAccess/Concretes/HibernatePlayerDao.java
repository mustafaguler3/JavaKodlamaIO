package DataAccess.Concretes;

import DataAccess.Abstracts.PlayerDao;
import Entities.Concretes.Player;

public class HibernatePlayerDao implements PlayerDao{

	@Override
	public void register(Player player) {
		System.out.println("Player was registered into the system : " + player.getPlayerName());
		
		
	}

	@Override
	public void update(Player player) {
		
		System.out.println("Player was updated : " + player.getPlayerName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Player was deleted into the system : " + player.getPlayerName());
	}

}
