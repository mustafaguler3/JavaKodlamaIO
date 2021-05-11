package Business.Abstracts;

import Entities.Concretes.Player;

public interface PlayerService {

	void register(Player player);
	void update(Player player);
	void delete(Player player);
}
