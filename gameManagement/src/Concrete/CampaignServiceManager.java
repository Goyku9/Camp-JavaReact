package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignServiceManager implements CampaignService {

	@Override
	public void cAdd(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " sisteme eklendi");
		
	}

	@Override
	public void cUpdate(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " gŁncellendi");
		
	}

	@Override
	public void cDelete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " sistemden silindi");
		
	}
	

}
