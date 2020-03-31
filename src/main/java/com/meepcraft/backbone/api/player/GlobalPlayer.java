package com.meepcraft.backbone.api.player;

import java.util.Date;
import java.util.UUID;

import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.Sound;
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
    /**
     * The player is online and active.
     */
    ACTIVE,
    
    /**
     * The player is online and away and idle.
     */
    AFK,
    
    /**
     * The player is offline but not banned.
     */
    OFFLINE,
    
    /**
     * The player has been banned.
     */
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
  
  /**
   * Retrieves the location of this player.
   * 
   * @return a GlobalLocation denoting the location of this player
   */
  public GlobalLocation getLocation();
  
  /**
   * Sends a message to a particular player.
   * 
   * @param message the message
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean sendMessage(String message);
  
  /**
   * Sends a message title to a particular player.
   * 
   * @param title the message title
   * @param subtitle the message subtitle
   * @param fadeInDuration the tick duration of the fade-in effect
   * @param staticDuration the length in ticks that the effect stays in place
   * @param fadeOutDuration the tick duration of the fade-out effect
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean sendTitle(String title, String subtitle, int fadeInDuration, int staticDuration, int fadeOutDuration);
  
  /**
   * Plays a note to the player and surrounding players.
   * 
   * @param instrument the instrument in question
   * @param note the note in question
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean playNote(Instrument instrument, Note note);
  
  /**
   * Plays a sound to the player and surrounding players.
   * 
   * @param sound the sound in question
   * @param volume the volume of the sound
   * @param pitch the pitch of the sound
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean playSound(Sound sound, float volume, float pitch);
  
  /**
   * Teleports a player to some location in the universe.
   * 
   * @param location the location
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean teleportPlayer(GlobalLocation location);
  
}
