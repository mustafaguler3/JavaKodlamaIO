package Business.Abstracts;

import Entities.Concretes.Campaign;

public interface CampaignService {

	void Add(Campaign campaign);
	void Delete(Campaign campaign);
	void Update(Campaign campaign);
}
