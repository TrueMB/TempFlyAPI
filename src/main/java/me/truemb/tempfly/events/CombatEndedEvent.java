package me.truemb.tempfly.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

import me.truemb.tempfly.objects.CombatHandler;

public class CombatEndedEvent extends CombatEvent {

	private static final HandlerList handlers = new HandlerList();

	public CombatEndedEvent(Player player, CombatHandler combatHandler) {
		this(player, combatHandler, false);
	}
	
	public CombatEndedEvent(Player player, CombatHandler combatHandler, boolean async) {
		super(player, combatHandler, async);
	}
	
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
