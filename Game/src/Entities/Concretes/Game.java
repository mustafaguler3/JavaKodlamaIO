package Entities.Concretes;

import Entities.Abstracts.Entity;

public class Game implements Entity{
	
	private int gameid;
	private String gameName;
	private double unitPrice;
	
	public Game(int gameid, String gameName, double unitPrice) {
		super();
		this.gameid = gameid;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
	}

	public int getGameid() {
		return gameid;
	}

	public void setGameid(int gameid) {
		this.gameid = gameid;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	

}
