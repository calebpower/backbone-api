package com.meepcraft.backbone.api.listener;

import com.meepcraft.backbone.api.listener.event.GlobalPlayerTeleportEvent;

/**
 * Listens for instances of {@link GlobalPlayerTeleportEvent} to be thrown.
 * 
 * @author Caleb L. Power
 */
public interface GlobalPlayerTeleportListener extends GlobalEventListener {
  
  /**
   * Fires when a player teleports globally.
   * 
   * @param event the {@link GlobalPlayerTeleportEvent} object in question
   */
  public void onGlobalPlayerTeleport(GlobalPlayerTeleportEvent event);
  
}
