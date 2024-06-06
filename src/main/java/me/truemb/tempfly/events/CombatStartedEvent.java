package me.truemb.tempfly.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

import me.truemb.tempfly.objects.CombatHandler;

public class CombatStartedEvent extends CombatEvent {

	private static final HandlerList handlers = new HandlerList();

	public CombatStartedEvent(Player player, CombatHandler combatHandler) {
		this(player, combatHandler, false);
	}
	
	public CombatStartedEvent(Player player, CombatHandler combatHandler, boolean async) {
		super(player, combatHandler, async);
	}
	
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
