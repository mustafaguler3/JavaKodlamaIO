package Entities.Concretes;

import Entities.Abstracts.Entity;

public class Sales implements Entity{
	
	private int saleId;
	private int gameId;
	private int playerId;
	private int customerId;
	private int campaignId;
	
	
	

	public Sales(int saleId, int gameId, int playerId,int customerId,int campaignId) {
		super();
		this.saleId = saleId;
		this.gameId = gameId;
		this.playerId = playerId;
		this.customerId = customerId;
		this.campaignId = campaignId;
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	 
	
	
	
	
	

}
