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

package com.meepcraft.backbone.api.listener.event;

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
