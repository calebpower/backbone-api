package com.meepcraft.backbone.api.request;

import com.axonibyte.bonemesh.listener.AckListener;
import com.axonibyte.bonemesh.socket.Payload;

/**
 * When registered, listens for a notification of a message's success or
 * failure.
 * 
 * @author Caleb L. Power
 */
public abstract class RequestAckListener implements AckListener {
  
  /**
   * {@inheritDoc}
   */
  @Override public void receiveAck(Payload payload) {
    onResponse(payload, true);
  }

  /**
   * {@inheritDoc}
   */
  @Override public void receiveNak(Payload payload) {
    onResponse(payload, false);
  }
  
  /**
   * Performs some action if there is a response.
   * 
   * @param originalPayload the original payload that was to be sent
   * @param success <code>true</code> if an ACK was received from the other node
   */
  public abstract void onResponse(Payload originalPayload, boolean success);

}
