package com.meepcraft.backbone.api.listener.event;

import com.meepcraft.backbone.api.location.GlobalLocation;
import com.meepcraft.backbone.api.player.GlobalPlayer;

/**
 * An event that is thrown when a player is about to teleport from one global
 * location to another.
 * 
 * @author Caleb L. Power
 */
public class GlobalPlayerTeleportEvent extends GlobalEvent {
  
  private GlobalLocation pointA = null;
  private GlobalLocation pointB = null;
  private GlobalPlayer player = null;
  
  /**
   * Initializes a GlobalPlayerTeleportEvent.
   * 
   * @param player the player who teleported
   * @param pointA the location they teleported from
   * @param pointB the location that they are teleporting to
   */
  public GlobalPlayerTeleportEvent(GlobalPlayer player, GlobalLocation pointA, GlobalLocation pointB) {
    this.player = player;
    this.pointA = pointA;
    this.pointB = pointB;
  }
  
  /**
   * Retrieves the player that is teleporting.
   * 
   * @return a GlobalPlayer object representing the player
   */
  public GlobalPlayer getPlayer() {
    return player;
  }
  
  /**
   * Retrieves the location that the player is teleporting away from.
   * 
   * @return a GlobalLocation object representing Point A
   */
  public GlobalLocation getPointA() {
    return pointA;
  }
  
  /**
   * Retrieves the location that the player is teleporting to.
   * 
   * @return a GlobalLocation object representing Point B
   */
  public GlobalLocation getPointB() {
    return pointB;
  }
  
}
