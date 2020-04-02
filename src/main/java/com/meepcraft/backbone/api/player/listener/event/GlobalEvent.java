package com.meepcraft.backbone.api.player.listener.event;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * A global event.
 * 
 * @author Caleb L. Power
 */
public class GlobalEvent {
  
  private AtomicBoolean canceled = null;
  
  protected GlobalEvent() {
    this.canceled = new AtomicBoolean(false);
  }
  
  /**
   * Determines whether or not this event is canceled.
   * 
   * @return <code>true</code> iff this event should be canceled
   */
  public boolean isCanceled() {
    return this.canceled.get();
  }
  
  /**
   * Cancels or resume this event.
   * 
   * @param canceled <code>true</code> iff this event should be canceled
   */
  public void setCanceled(boolean canceled) {
    this.canceled.set(canceled);
  }
  
}
