package com.meepcraft.backbone.api.request;

import com.calebpower.bonemesh.listener.AckListener;
import com.calebpower.bonemesh.socket.Payload;

public abstract class RequestAckListener implements AckListener {

  @Override public void receiveAck(Payload payload) {
    onResponse(payload, true);
  }

  @Override public void receiveNak(Payload payload) {
    onResponse(payload, false);
  }
  
  public abstract void onResponse(Payload originalPayload, boolean success);

}
