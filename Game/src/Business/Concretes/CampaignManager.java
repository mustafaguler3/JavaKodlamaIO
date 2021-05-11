package Business.Concretes;

import Business.Abstracts.CampaignService;
import DataAccess.Abstracts.CampaignDao;
import Entities.Concretes.Campaign;

public class CampaignManager implements CampaignService{
	
	private CampaignDao campaignDao;	
	

	public CampaignManager(CampaignDao campaignDao) {		
		this.campaignDao = campaignDao;
	}

	@Override
	public void Add(Campaign campaign) {
		campaignDao.Add(campaign);
		
	}

	@Override
	public void Delete(Campaign campaign) {
		campaignDao.Delete(campaign);
		
	}

	@Override
	public void Update(Campaign campaign) {
		campaignDao.Update(campaign);
		
	}

}
