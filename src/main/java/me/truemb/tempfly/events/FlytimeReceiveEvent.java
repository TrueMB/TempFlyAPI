package me.truemb.tempfly.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Player is receiving some flytime, but hasn't already.
 */
public class FlytimeReceiveEvent extends Event{

	private static final HandlerList handlers = new HandlerList();

	private String target;
	private Player player;
	
	private long flytimeMillis;

	public FlytimeReceiveEvent(Player player, String target, long flytimeMillis) {
		this.player = player;
		this.target = target;
		this.flytimeMillis = flytimeMillis;
	}
	
	public FlytimeReceiveEvent(boolean async, Player player, String target, long flytimeMillis) {
		super(async);
		
		this.player = player;
		this.target = target;
		this.flytimeMillis = flytimeMillis;
	}
	
	public long getFlytimeMillis() {
		return this.flytimeMillis;
	}

	public Player getPlayer() {
		return this.player;
	}

	public String getTarget() {
		return this.target;
	}
	
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
