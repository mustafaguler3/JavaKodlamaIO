package DataAccess.Concretes;

import DataAccess.Abstracts.CampaignDao;
import Entities.Concretes.Campaign;

public class HibernateCampaignDao implements CampaignDao{

	
	public void Add(Campaign campaign) {
		System.out.println("Campaign was added into the system : " + campaign.getCampaignName() + " about %" +campaign.getDiscount());
		
	}

	
	public void Delete(Campaign campaign) {
		System.out.println("Campaign was deleted into the system : " + campaign.getCampaignName());
		
	}

	
	public void Update(Campaign campaign) {
		System.out.println("Campaign was updated into the system : " + campaign.getCampaignName());
		
	}

}
