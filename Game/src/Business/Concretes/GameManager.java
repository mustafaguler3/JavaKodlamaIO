package Business.Concretes;

import Business.Abstracts.GameService;
import DataAccess.Abstracts.GameDao;
import Entities.Concretes.Game;

public class GameManager implements GameService{
	
	private GameDao gameDao;
	

	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}



	@Override
	public void Add(Game game) {
		gameDao.Add(game);
		
	}
	
}
