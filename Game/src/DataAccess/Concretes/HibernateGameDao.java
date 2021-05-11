package DataAccess.Concretes;

import DataAccess.Abstracts.GameDao;
import Entities.Concretes.Game;

public class HibernateGameDao implements GameDao{

	@Override
	public void Add(Game game) {
		System.out.println("Game was added into the system : " +game.getGameName());
		
	}

}
