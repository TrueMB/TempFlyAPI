package me.truemb.tempfly.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.Particle;

import com.google.gson.JsonObject;

public class PlayerData {
	
	private UUID uuid;
	private String username;
	
	private long flyTime;
	private boolean flyMode;
	private boolean flying;
	private long since;
	
	private boolean disableNextFallDamage;
	private boolean skipToggleFlyEvent;
	private boolean temporallyDeactivated;
	
	private BonusData bonusData = new BonusData();
	
	private List<Particle> owning_particles = new ArrayList<>();
	private Particle activeParticle;
	
	public PlayerData(UUID uuid, String username) {
		this.uuid = uuid;
		this.username = username;
	}
	
	public void loadUserData(JsonObject json) {}
	
	public JsonObject getDataAsJson() {
		return null;
	}

	public String getUsername() {
		return this.username;
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public boolean isFlyMode() {
		return this.flyMode;
	}

	public void setFlyMode(boolean flyMode) {
		this.flyMode = flyMode;
	}

	public long getFlyTime() {
		return this.flyTime;
	}

	public void setFlyTime(long flyTime) {
		this.flyTime = flyTime;
	}

	public long getSince() {
		return since;
	}

	/**
	 * 
	 * @param since sets the currentMillis depending on the mode, since the player flies or activates the flymode
	 */
	public void setSince(long since) {
		this.since = since;
	}

	public List<Particle> getOwningParticles() {
		return this.owning_particles;
	}
	
	public boolean isOwningParticle(Particle particle) {
		for(Particle all : this.getOwningParticles())
			if(all.equals(particle))
				return true;
		return false;
	}

	public void addOwningParticles(Particle particle) {
		this.owning_particles.add(particle);
	}

	public void removeOwningParticles(Particle particle) {
		this.owning_particles.remove(particle);
	}

	public Particle getActiveParticle() {
		return this.activeParticle;
	}
	
	public void setActiveParticle(Particle particle) {
		this.activeParticle = particle;
	}

	public BonusData getBonusData() {
		return this.bonusData;
	}

	public boolean isDisableNextFallDamage() {
		return this.disableNextFallDamage;
	}

	public void setDisableNextFallDamage(boolean disableNextFallDamage) {
		this.disableNextFallDamage = disableNextFallDamage;
	}

	public boolean isFlying() {
		return this.flying;
	}

	public void setFlying(boolean flying) {
		this.flying = flying;
	}

	public boolean isTemporallyDeactivated() {
		return this.temporallyDeactivated;
	}

	public void setTemporallyDeactivated(boolean temporallyDeactivated) {
		this.temporallyDeactivated = temporallyDeactivated;
	}

	public boolean isSkipToggleFlyEvent() {
		return this.skipToggleFlyEvent;
	}

	public void setSkipToggleFlyEvent(boolean skipToggleFlyEvent) {
		this.skipToggleFlyEvent = skipToggleFlyEvent;
	}

}
