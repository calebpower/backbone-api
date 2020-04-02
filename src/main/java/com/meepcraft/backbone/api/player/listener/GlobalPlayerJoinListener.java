package com.meepcraft.backbone.api.player.listener;

import com.meepcraft.backbone.api.player.listener.event.GlobalPlayerJoinEvent;

/**
 * Listens for instances of {@link GlobalPlayerJoinEvent} to be thrown.
 * 
 * @author Caleb L. Power
 */
public interface GlobalPlayerJoinListener extends GlobalEventListener {
  
  /**
   * Fires when a player joins globally.
   * 
   * @param event the {@link GlobalPlayerJoinEvent} object in question
   */
  public void onGlobalPlayerJoin(GlobalPlayerJoinEvent event);
  
}
