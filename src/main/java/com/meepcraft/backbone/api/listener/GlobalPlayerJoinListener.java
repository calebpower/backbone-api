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

package com.meepcraft.backbone.api.listener;

import com.meepcraft.backbone.api.listener.event.GlobalPlayerJoinEvent;

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
