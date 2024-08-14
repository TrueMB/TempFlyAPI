package me.truemb.tempfly.api;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import me.truemb.tempfly.enums.CancelReason;
import me.truemb.tempfly.enums.FlyReason;
import me.truemb.tempfly.enums.Time;
import me.truemb.tempfly.objects.PlayerData;

public class FlyManager {
	
	/**
	 * 
	 * @param uuid - Player UUID
	 * @return PlayerData of the Player, contains the Caching Options
	 */
	public PlayerData getPlayerData(UUID uuid) {
		return null;
	}
	
	/**
	 * 
	 * @param uuid - Player UUID
	 * @return true if PlayerData for the uuid exists (loaded on Join and unloaded on Quit)
	 */
	public boolean hasPlayerData(UUID uuid) {
		return false;
	}
	
	/**
	 * Removes the Player Data
	 * 
	 * @param uuid - Player UUID
	 */
	public void removePlayerData(UUID uuid) {}
	
	
	/**
	 * 
	 * @param uuid - Player UUID
	 * @param username - Player Name
	 * @return The created Player Data.
	 */
	public PlayerData createPlayerData(UUID uuid, String username) {
		return null;
	}
	
	/**
	 * If true, then the players Flytime gets removed, as long he is in the Flymode Mode.
	 * He needs to disable the Flymode with /tf to stop the removal.
	 * 
	 * @return Boolean which was set in the config.
	 */
	public boolean isFlymodeMode() {
		return false;
	}
	
	/*
	 * Is the FlyMode active
	 */
	public boolean isFlyMode(UUID uuid) {
		return false;
	}
	
	/**
	 * Enable the Fly Mode for the Player. If active, the player can press double Spacebar to fly.
	 * 
	 * @param uuid - The Player UUID
	 */
	public void enableFlyMode(UUID uuid) {}

	/**
	 * Disables the Fly Mode and if the Player is Online and Flying, it will be set to false
	 * 
	 * @param uuid - The Player UUID
	 */
	public void disableFlyMode(UUID uuid) {}
	
	/**
	 * Disables the Fly Mode and if the Player is Online and Flying, it will be set to false
	 * 
	 * @param uuid - The Player UUID
	 * @param blacklistedArea - Set to true, if player should get permission to fly after joining a whitelisted area.
	 */
	public void disableFlyMode(UUID uuid, boolean blacklistedArea) {}
	
	/**
	 * 
	 * @param player - The Player to check the TempFly Status
	 * @return boolean - if the player is flying through the TempFly plugin
	 */
	public boolean isFlying(Player player) {
		return false;
			
	}
	
	public CancelReason setPlayerFlying(Player player, boolean value) {
		return CancelReason.SUCCESS;
	}
	
	/**
	 * Sets the Player Flying; Without deactivating the Mode.
	 * Player can always double jump to fly again.
	 * To Disable Flying completely, use @disableFlyMode
	 * Doesn't activate, if the player is not allowed to fly
	 * 
	 * @param p
	 * @param value
	 * @return
	 */
	public CancelReason setPlayerFlying(Player player, boolean value, FlyReason reason) {
		return CancelReason.SUCCESS;
	}
	
	/**
	 * Sets the Flytime of the given Player
	 * 
	 * @param uuid - The Player UUID
	 * @param millis - The Flytime to add in Milliseconds
	 */
	public void setFlyTime(UUID uuid, long millis) {}
	
	/**
	 * Add the Flytime to the given Player
	 * 
	 * @param uuid = The Player UUID
	 * @param millis - The Flytime to add in Milliseconds
	 */
	public void addFlyTime(UUID uuid, long millis) {}

	/**
	 * Remove the Flytime from the given Player
	 * 
	 * @param uuid = The Player UUID
	 * @param millis - The Flytime to remove in Milliseconds
	 */
	public void removeFlyTime(UUID uuid, long millis) {}
	
	/**
	 * Gets the Flytime that is left for the given Player
	 * Depending on the Mode, it will be removed after /tf or while flying
	 * 
	 * @param uuid - The Player UUID
	 * @return - The Flytime in Milliseconds that is left
	 */
	public long getFlyTime(UUID uuid) {
		return 0;
	}
	
	/**
	 * Converts the Time from Human Input to Milliseconds
	 * 
	 * @param timeUnit - The Time Unit
	 * @param timeValue - The Time Amount
	 * @return - Milliseconds
	 */
	public long getTimeConvertedMillis(Time timeUnit, long timeValue) {
		return 0;
	}
	/**
	 * The Formatted String for the Time left
	 * 
	 * @param uuid - The Player UUID
	 * @return - The String formatted Time
	 */
	public String getTimeFormatted(UUID uuid, boolean ignoreLimiter) {
		return null;
	}
	
	/**
	 * The Formatted String for the Time left
	 * 
	 * @param uuid - The Player UUID
	 * @return - The String formatted Time
	 */
	public String getTimeFormatted(UUID uuid, boolean infinite, boolean showAlsoZeros, boolean ignoreLimiter) {
		return null;
	}
	
	/**
	 * The Formatted String for the Time left
	 * 
	 * @param uuid - The Player UUID
	 * @param time - the time to convert
	 * @return - The String formatted Time
	 */
	public String getTimeFormatted(UUID uuid, long time) {
		return null;
	}
	
	/**
	 * The Formatted String for the Time left
	 * 
	 * @param uuid - The Player UUID
	 * @param time - the time to convert
	 * @return - The String formatted Time
	 */
	public String getTimeFormatted(UUID uuid, long time, boolean infinite, boolean showAlsoZeros, boolean ignoreLimiter) {
		return null;
	}
	
	public String getTimestamp(UUID uuid) {
		return null;
	}

	public String getTimestamp(UUID uuid, long time) {
		return null;
	}
	
	/**
	 * Checks if the given World is blacklisted from the Plugin
	 * 
	 * @param world - The World to check
	 * @return boolean - if the World is blacklisted
	 */
	public boolean isBlacklistedWorld(World world) {
		return false;
	}
	
	/**
	 * Checks if the given Region is blacklisted from the Plugin
	 * or if the Worldguard flag is set to deny
	 * 
	 * @param region - The Region to check
	 * @return boolean - if the Region is blacklisted
	 */
	public boolean isBlacklistedRegion(World w, String region) {
		return false;
	}
	
	/**
	 * Checks if Player is allowed to use flying in the current Plot
	 * Plotsquared
	 * 
	 * @param p - The Player
	 * @return
	 */
	public boolean isFlyingAllowedInPlot(Player p, Location loc) {
		return false;
	}

	/**
	 * Checks if Player is allowed to use flying in the current Claim
	 * GriefPrevention
	 * 
	 * @param p - The Player
	 * @return
	 */
	public boolean isFlyingAllowedInClaim(Player p, Location loc) {
		return false;
	}

	/**
	 * Checks if Player is allowed to use flying in the current Area
	 * LandsAPI
	 * 
	 * @param p - The Player
	 * @return
	 */
	public boolean isFlyingAllowedInArea(Player p, Location loc) {
		return false;
	}
	
	/**
	 * Checks if Player is allowed to use flying in the current Area
	 * HuskClaims
	 * 
	 * @param p - The Player
	 * @return
	 */
	public boolean isFlyingAllowedInHuskClaim(Player p, Location loc) {
		return false;
	}

	/**
	 * Checks if Player is allowed to Fly in that region from Towny.
	 * 
	 * @param p - The Player
	 * @param loc - The Location to check
	 * @return
	 */
	public boolean isFlyingAllowedInTown(Player p, Location loc) {
		return false;
	}
	
	/**
	 * Checks if Player is allowed to use flying in the current Residence
	 * 
	 * @param p - The Player
	 * @return
	 */
	public boolean isFlyingAllowedInResidence(Player p, Location loc) {
		return false;
	}

	/**
	 * Checks if Player is allowed to use flying in the current Faction
	 * 
	 * @param p - The Player
	 * @return
	 */
	public boolean isFlyingAllowedInFaction(Player p, Location loc) {
		return false;
	}
	
	/**
	 * Checks if Player is allowed to use flying in the current Skyblock Island
	 * 
	 * @param p - The Player
	 * @return
	 */
	public boolean isFlyingAllowedInSkyblock(Player p, Location loc) {
		return false;
	}
	
	/**
	 * 
	 * @param p - Player
	 * @param loc - Location
	 * @param withMessage - sends a message to the player, if he is not allowed
	 * 
	 * @return Checks all APIs for Fly Allowed. Doesn't stop or cancel the flight
	 */
	public boolean checkApiForFlyAllowed(Player p, Location loc, boolean withMessage) {
		return false;
	}
}
