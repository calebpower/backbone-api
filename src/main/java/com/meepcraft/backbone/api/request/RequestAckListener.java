/*
 * Copyright (c) 2019 Axonibyte Innovations, LLC. All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
