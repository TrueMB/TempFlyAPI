package me.truemb.tempfly.events;

import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ParticleBuyEvent extends Event implements Cancellable{

	private static final HandlerList handlers = new HandlerList();
	private boolean cancel = false;

	private Player player;
	
	private Particle particle;
	private double price;

	public ParticleBuyEvent(Player player, Particle particle, double price) {
		this.player = player;
		this.particle = particle;
		this.price = price;
	}

	public Particle getParticle() {
		return this.particle;
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
