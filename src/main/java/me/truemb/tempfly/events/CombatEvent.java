package me.truemb.tempfly.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.truemb.tempfly.objects.CombatHandler;

public class CombatEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	
	private Player player;
	private CombatHandler combatHandler;

	public CombatEvent(Player player, CombatHandler combatHandler) {
		this(player, combatHandler, false);
	}
	
	public CombatEvent(Player player, CombatHandler combatHandler, boolean async) {
		super(async);
		this.player = player;
		this.combatHandler = combatHandler;
	}
	
	public Player getPlayer() {
		return this.player;
	}

	public CombatHandler getCombatHandler() {
		return this.combatHandler;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
