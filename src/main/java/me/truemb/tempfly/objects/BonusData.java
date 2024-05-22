package me.truemb.tempfly.objects;

import java.sql.Timestamp;

public class BonusData {

	private Timestamp lastLoginReward;
	private int joinStreak;
	
	public BonusData() {
		
	}

	public Timestamp getLastLoginReward() {
		return this.lastLoginReward;
	}

	public void setLastLoginReward(Timestamp lastLoginReward) {
		this.lastLoginReward = lastLoginReward;
	}

	public int getJoinStreak() {
		return this.joinStreak;
	}

	public void setJoinStreak(int joinStreak) {
		this.joinStreak = joinStreak;
	}
	

}
