package game;

import java.util.ArrayList;

public class Team {   
	private ArrayList<String> player;

	public Team(ArrayList<String> player) {
		this.player = player;
	}

	public ArrayList<String> getPlayer() {
		return player;
	}

	public void setPlayer(ArrayList<String> player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Player : " +player ;
	}

} //class Team
