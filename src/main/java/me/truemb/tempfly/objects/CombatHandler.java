package me.truemb.tempfly.objects;

import java.util.UUID;

public class CombatHandler {

	private UUID uuid;
	
	private UUID lastDamager;
	private long inCombatUntil;
	
	private boolean wasFlyEnabled;
	
	public CombatHandler(UUID uuid) {
		this.uuid = uuid;
	}

	public UUID getUUID() {
		return this.uuid;
	}
	

	public UUID getLastDamager() {
		return this.lastDamager;
	}

	public void setLastDamager(UUID lastDamager) {
		this.lastDamager = lastDamager;
	}

	public boolean isInCombat() {
		return this.getInCombatUntil() > System.currentTimeMillis();
	}
	
	public int getSecondsInCombat() {
		return (int) ((this.getInCombatUntil() - System.currentTimeMillis()) / 1000);
	}
	
	public long getInCombatUntil() {
		return this.inCombatUntil;
	}

	public void setInCombatUntil(long inCombatSince) {
		this.inCombatUntil = inCombatSince;
	}
	
	public void resetCombat() {
		this.setInCombatUntil(0);
		this.setLastDamager(null);
	}

	public boolean wasFlyEnabled() {
		return this.wasFlyEnabled;
	}

	public void setWasFlyEnabled(boolean flyEnabled) {
		this.wasFlyEnabled = flyEnabled;
	}
	
}
