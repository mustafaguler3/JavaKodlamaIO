package DataAccess.Abstracts;

import Entities.Concretes.Player;

public interface PlayerDao {

	void register(Player player);
	void update(Player player);
	void delete(Player player);
	
}
