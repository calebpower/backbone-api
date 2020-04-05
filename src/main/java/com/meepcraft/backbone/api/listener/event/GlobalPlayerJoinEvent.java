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

import com.meepcraft.backbone.api.location.GlobalLocation;
import com.meepcraft.backbone.api.player.GlobalPlayer;

/**
 * An event that is thrown when a player has joined the server at large.
 * 
 * @author Caleb L. Power
 */
public class GlobalPlayerJoinEvent {
  
  private GlobalLocation location = null;
  private GlobalPlayer player = null;
  
  /**
   * Initializes a GlobalPlayerJoinEvent.
   * 
   * @param player the player that logged in
   * @param location the location where the player logged in
   */
  public GlobalPlayerJoinEvent(GlobalPlayer player, GlobalLocation location) {
    this.location = location;
    this.player = player;
  }
  
  /**
   * Retrieves the player that logged in.
   * 
   * @return a GlobalPlayer object representing the player
   */
  public GlobalPlayer getPlayer() {
    return player;
  }
  
  /**
   * Retrieves the location where the player logged in.
   * 
   * @return a GlobalLocation object representing the location in question
   */
  public GlobalLocation getLocation() {
    return location;
  }
  
}
