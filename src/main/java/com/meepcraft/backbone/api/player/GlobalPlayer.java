package com.meepcraft.backbone.api.player;

import java.util.Date;
import java.util.UUID;

import org.json.JSONObject;

import com.meepcraft.backbone.api.location.GlobalLocation;

/**
 * Denotes a player somewhere in the universe.
 * 
 * @author Caleb L. Power
 */
public interface GlobalPlayer {
  
  /**
   * The current status of this player.
   * 
   * @author Caleb L. Power
   */
  public static enum Status {
    ACTIVE,
    AFK,
    OFFLINE,
    BANNED
  }
  
  /**
   * Retrieves the player's unique identifier.
   * 
   * @return the player's UUID
   */
  public UUID getUUID();
  
  /**
   * Retrieves the player's in-game name.
   * 
   * @return the player's current name
   */
  public String getIGN();
  
  /**
   * Retrieves the current status of the player.
   * 
   * @return the player's status
   */
  public Status getStatus();
  
  /**
   * Retrieves the last known global location of the player.
   * 
   * @return the player's last known location
   */
  public GlobalLocation getLastKnownLocation();
  
  /**
   * Retrieves the date and time at which the player was first seen.
   * 
   * @return the timestamp correlating to when the player was first seen
   */
  public Date getFirstSeenTimestamp();
  
  /**
   * Retrieves the date and time at which the player was seen last.
   * 
   * @return the timestamp correlating to when the player was seen last
   */
  public Date getLastSeenTimestamp();
  
  /**
   * Serializes the player into a JSON object for storage or transmission.
   * 
   * @return a JSON object representing the global player
   */
  public JSONObject serialize();
  
  /**
   * Determines if this global player is the same as another global player.
   * 
   * @param player the player to compare
   * @return <code>true</code> if the players are the same
   */
  public boolean equals(GlobalPlayer player);
  
  /**
   * Determines if the player in question is online.
   * 
   * @return <code>true</code> if the player is online
   */
  public boolean isOnline();
  
}
