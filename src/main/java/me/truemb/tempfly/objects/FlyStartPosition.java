package me.truemb.tempfly.objects;

import org.bukkit.Location;

public class FlyStartPosition {
	
	private Location startLocation;
	private long startTime;
	
	public FlyStartPosition(Location loc) {
		this.startLocation = loc;
		this.startTime = System.currentTimeMillis();
	}

	public Location getStartLocation() {
		return this.startLocation;
	}

	public long getStartTime() {
		return this.startTime;
	}

}
