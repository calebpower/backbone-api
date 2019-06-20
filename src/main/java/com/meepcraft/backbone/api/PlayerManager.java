package com.meepcraft.backbone.api;

import java.util.UUID;

import com.meepcraft.backbone.api.location.GlobalLocation;
import com.meepcraft.backbone.api.player.GlobalPlayer;

/**
 * Manages and interacts with players in the universe.
 * 
 * @author Caleb L. Power
 */
public interface PlayerManager {
  
  /**
   * Broadcasts a message to all players.
   * 
   * @param message the message
   */
  public void broadcastMessage(String message);
  
  /**
   * Broadcasts a message to all players on a particular server.
   * 
   * @param server the name of the server
   * @param message the message
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean broadcastMessage(String server, String message);
  
  /**
   * Sends a message to a particular player.
   * 
   * @param player the player
   * @param message the message
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean sendMessage(GlobalPlayer player, String message);
  
  /**
   * Teleports a player to some location in the universe.
   * 
   * @param player the player
   * @param location the location
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean teleportPlayer(GlobalPlayer player, GlobalLocation location);
  
  /**
   * Retrieves a global player by unique identifier if they exist.
   * 
   * @param uuid the UUID of the player
   * @return the global player
   */
  public GlobalPlayer getGlobalPlayer(UUID uuid);
  
  /**
   * Retrieves a global player by name if they exist.
   * Note: If they changed their name and haven't logged on, they will be known
   * by their old name until it gets updated.
   * 
   * @param ign the player's in-game name
   * @return the global player
   */
  public GlobalPlayer getGlobalPlayer(String ign);
  
  /**
   * Updates the global player. The player passed in as an argument will be
   * known throughout the universe.
   * 
   * @param player the player
   */
  public void updateGlobalPlayer(GlobalPlayer player);
  
}
