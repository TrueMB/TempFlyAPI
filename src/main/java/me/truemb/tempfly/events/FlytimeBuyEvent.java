package me.truemb.tempfly.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class FlytimeBuyEvent extends Event implements Cancellable{

	private static final HandlerList handlers = new HandlerList();
	private boolean cancel = false;

	private Player player;

	private String flytimeS;
	private long flytimeMillis;
	private double price;

	public FlytimeBuyEvent(Player player, String flytimeS, double price) {
		this.player = player;
		this.flytimeS = flytimeS;
		this.price = price;
	}

	public String getFlytimeAsString() {
		return this.flytimeS;
	}
	
	public long getFlytimeMillis() {
		return this.flytimeMillis;
	}

	public Player getPlayer() {
		return this.player;
	}

	public double getPrice() {
		return this.price;
	}
	
	
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public boolean isCancelled() {
		return this.cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}

}
