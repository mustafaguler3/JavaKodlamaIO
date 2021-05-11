package Entities.Concretes;

import Entities.Abstracts.Entity;

public class Player implements Entity{

	private int id;
	private String playerName;
	
	
	
	
	public Player(int id, String playerName) {
		super();
		this.id = id;
		this.playerName = playerName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	
}
