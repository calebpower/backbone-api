package com.meepcraft.backbone.api.listener.event;

import com.meepcraft.backbone.api.location.GlobalLocation;
import com.meepcraft.backbone.api.player.GlobalPlayer;

/**
 * An event that is thrown when a player has left the server at large.
 * 
 * @author Caleb L. Power
 */
public class GlobalPlayerQuitEvent {
  
  private GlobalLocation location = null;
  private GlobalPlayer player = null;
  
  /**
   * Initializes a GlobalPlayerQuitEvent.
   * 
   * @param player the player that logged out
   * @param location the player's last location before logging out
   */
  public GlobalPlayerQuitEvent(GlobalPlayer player, GlobalLocation location) {
    this.location = location;
    this.player = player;
  }
  
  /**
   * Retrieves the player that logged out.
   * 
   * @return a GlobalPlayer object representing the player
   */
  public GlobalPlayer getPlayer() {
    return player;
  }
  
  /**
   * Retrieves the player's last location before logging out
   * 
   * @return a GlobalLocation object representing the location in question
   */
  public GlobalLocation getLocation() {
    return location;
  }
  
}
