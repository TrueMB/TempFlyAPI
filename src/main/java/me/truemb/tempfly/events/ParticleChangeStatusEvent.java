package me.truemb.tempfly.events;

import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ParticleChangeStatusEvent extends Event {

	private static final HandlerList handlers = new HandlerList();

	private Player player;
	private Player target;
	
	private Particle particle;
	private boolean status;

	public ParticleChangeStatusEvent(Player player, Player target,Particle particle, boolean status) {
		this.player = player;
		this.target = target;
		this.particle = particle;
		this.status = status;
	}

	public Particle getParticle() {
		return this.particle;
	}

	public Player getPlayer() {
		return this.player;
	}

	public boolean getStatus() {
		return this.status;
	}

	public Player getTarget() {
		return this.target;
	}

	
	
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
