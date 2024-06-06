package me.truemb.tempfly.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import me.truemb.tempfly.enums.FlyReason;

public class FlyStartEvent extends FlyEvent implements Cancellable{

	private static final HandlerList handlers = new HandlerList();
	private boolean canceled;
	
	private FlyReason reason;

	public FlyStartEvent(Player player, FlyReason reason) {
		super(player);
		this.reason = reason;
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

	@Override
	public boolean isCancelled() {
		return this.canceled;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.canceled = cancel;		
	}

}
