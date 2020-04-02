package com.meepcraft.backbone.api.player.listener.event;

import com.meepcraft.backbone.api.location.GlobalLocation;
import com.meepcraft.backbone.api.player.GlobalPlayer;

/**
 * An event that is thrown when a player has joined the server at large.
 * 
 * @author Caleb L. Power
 */
public class GlobalPlayerJoinEvent {
  
  private GlobalLocation location = null;
  private GlobalPlayer player = null;
  
  /**
   * Initializes a GlobalPlayerJoinEvent.
   * 
   * @param player the player that logged in
   * @param location the location where the player logged in
   */
  public GlobalPlayerJoinEvent(GlobalPlayer player, GlobalLocation location) {
    this.location = location;
    this.player = player;
  }
  
  /**
   * Retrieves the player that logged in.
   * 
   * @return a GlobalPlayer object representing the player
   */
  public GlobalPlayer getPlayer() {
    return player;
  }
  
  /**
   * Retrieves the location where the player logged in.
   * 
   * @return a GlobalLocation object representing the location in question
   */
  public GlobalLocation getLocation() {
    return location;
  }
  
}
