package com.meepcraft.backbone.api.player.listener;

import com.meepcraft.backbone.api.player.listener.event.GlobalPlayerQuitEvent;

/**
 * Listens for instances of {@link GlobalPlayerQuitEvent} to be thrown.
 * 
 * @author Caleb L. Power
 */
public interface GlobalPlayerQuitListener extends GlobalEventListener {
  
  /**
   * Fires when a player quits globally.
   * 
   * @param event the {@link GlobalPlayerQuitEvent} object in question
   */
  public void onGlobalPlayerQuit(GlobalPlayerQuitEvent event);
  
}
