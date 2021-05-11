package DataAccess.Abstracts;

import Entities.Concretes.Campaign;

public interface CampaignDao {
	
	void Add(Campaign campaign);
	void Delete(Campaign campaign);
	void Update(Campaign campaign);
	

}
