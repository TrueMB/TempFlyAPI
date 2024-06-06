package me.truemb.tempfly.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class FlyEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	
	private Player player;

	public FlyEvent(Player player) {
		this.player = player;
	}
	
	public Player getPlayer() {
		return this.player;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

}
