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
