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

package com.meepcraft.backbone.api.location;

import org.bukkit.Location;

/**
 * Represents any global location.
 * 
 * @author Caleb L. Power
 */
public interface GlobalLocation {

  /**
   * Retrieves the Spigot in-game location on an arbitrary server.
   * 
   * @return the player's location; not guaranteed to be a reference
   *         to the original object
   */
  public Location getLocation();
  
  /**
   * Retrieves the name of the server referenced by this global location.
   * 
   * @return a String denoting the name of the server
   */
  public String getServer();
  
  /**
   * Retrieves the name of the world referenced by this global location.
   * 
   * @return a String denoting the name of the world
   */
  public String getWorld();
  
  /**
   * Retrieves the x-value referenced by this global location.
   * X-values denote locations in relation to the map's East and West.
   * 
   * @return a double denoting the x-value
   */
  public double getX();
  
  /**
   * Retrieves the y-value referenced by this global location.
   * Y-values denote the height of a player, with a value of <code>0</code>
   * denoting the bottom bedrock layer.
   * 
   * @return a double denoting the y-value
   */
  public double getY();
  
  /**
   * Retrieves the z-value referenced by this global location.
   * Z-values denote locations in relation to the map's North and South.
   * 
   * @return a double denoting the z-value
   */
  public double getZ();
  
  /**
   * Retrieves the pitch referenced by this global location.
   * Ranges from <code>[-90, 90]</code>, where <code>-90</code> signifies that
   * a player is facing up, <code>0</code> signifies that a player is facing
   * straight ahead, and <code>90</code> signifies that a player is facing down.
   * 
   * @return a float denoting the pitch
   */
  public float getPitch();
  
  /**
   * Retrieves the yaw referenced by this global location.
   * Ranges from <code>(-180, 180]</code>, where <code>-90</code> signifies
   * that the player is facing the East, <code>0</code> signifies that the
   * player is facing the South, <code>90</code> signifies that the player is
   * facing the West, and <code>180</code> signifies that the player is facing
   * the North.
   * 
   * @return a float denoting the yaw
   */
  public float getYaw();
  
  /**
   * Determines whether or not two locations are equivalent.
   * 
   * @param location the location in question
   * @return <code>true</code> iff the locations are equivalent
   */
  public boolean equals(GlobalLocation location);
  
}
