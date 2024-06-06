package me.truemb.tempfly.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

import me.truemb.tempfly.enums.FlyReason;

public class FlyStopEvent extends FlyEvent {

	private static final HandlerList handlers = new HandlerList();
	
	private FlyReason reason;

	public FlyStopEvent(Player player) {
		super(player);
	}
	
	public FlyReason getFlyReason() {
		return this.reason;
	}
	

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

}
