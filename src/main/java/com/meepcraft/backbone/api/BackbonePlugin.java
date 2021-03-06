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

package com.meepcraft.backbone.api;

import java.sql.Connection;

import org.bukkit.plugin.java.JavaPlugin;

import com.meepcraft.backbone.api.listener.GlobalEventListener;
import com.meepcraft.backbone.api.player.PlayerManager;
import com.meepcraft.backbone.api.request.BackboneRequest;
import com.meepcraft.backbone.api.request.RequestAckListener;
import com.meepcraft.backbone.api.request.RequestListener;

/**
 * An API to allow plugins to easily utilize BoneMesh functionality.
 * 
 * @author Caleb L. Power
 */
public abstract class BackbonePlugin extends JavaPlugin {
  
  /**
   * Retrieves a connection to the database.
   * 
   * @return the database connection
   * @see BackboneAPI#getDBConnection()
   */
  public abstract Connection getDBConnection();
  
  /**
   * Retrieves the player manager.
   * 
   * @return the player manager or <code>null</code>
   * @see BackboneAPI#getPlayerManager()
   */
  public abstract PlayerManager getPlayerManager();
  
  /**
   * Retrieves the name of this node/server.
   * 
   * @return the instance label
   * @see BackboneAPI#getThisNodeLabel()
   */
  public abstract String getThisNodeLabel();
  
  /**
   * Dispatches a request to all other servers. Automatically retries failed
   * transmissions.
   * 
   * @param request the request
   * 
   * @return <code>true</code> if all servers received the request
   * @see BackboneAPI#dispatchRequest(BackboneRequest)
   */
  public abstract boolean dispatchRequest(BackboneRequest request);
  
  /**
   * Dispatches a request to all other servers. Allows for explicit direction
   * as to whether a failed request should be retried. 
   * 
   * @param request the request
   * @param retryOnFailure <code>true</code> to retry on transmission failure
   * @return <code>true</code> if all servers received the request on the first try
   * @see BackboneAPI#dispatchRequest(BackboneRequest, boolean)
   */
  public abstract boolean dispatchRequest(BackboneRequest request, boolean retryOnFailure);
  
  /**
   * Dispatches a request to a single node/server.
   * 
   * @param node the recipient node
   * @param request the request
   * @return <code>true</code> if the server received the transmission
   * @see BackboneAPI#dispatchRequest(String, BackboneRequest)
   */
  public abstract boolean dispatchRequest(String node, BackboneRequest request);
  
  /**
   * Dispatches a request to a single node/server. Allows for explicit
   * direction as to whether a failed request should be retried.
   * 
   * @param node the recipient node
   * @param request the request
   * @param retryOnFailure <code>true</code> to retry on transmission failure
   * @return <code>true</code> if the server received the transmission on the first try
   * @see BackboneAPI#dispatchRequest(String, BackboneRequest, boolean)
   */
  public abstract boolean dispatchRequest(String node, BackboneRequest request, boolean retryOnFailure);
  
  /**
   * Dispatches a request to a single node/server.
   * 
   * @param node the recipient node
   * @param request the request
   * @param ackListeners additional acknowledgement listeners to attach to the payload
   * @return <code>true</code> if the server received the transmission
   * @see BackboneAPI#dispatchRequest(String, BackboneRequest, RequestAckListener...)
   */
  public abstract boolean dispatchRequest(String node, BackboneRequest request, RequestAckListener... ackListeners);
  
  /**
   * Dispatches a request to a single node/server. Allows for explicit
   * direction as to whether a failed request should be retried.
   * 
   * @param node the recipient node
   * @param request the request
   * @param retryOnFailure <code>true</code> to retry on transmission failure
   * @param ackListeners additional acknowledgement listeners to attach to the payload
   * @return <code>true</code> if the server received the transmission on the first try
   * @see BackboneAPI#dispatchRequest(String, BackboneRequest, boolean, RequestAckListener...)
   */
  public abstract boolean dispatchRequest(String node, BackboneRequest request, boolean retryOnFailure, RequestAckListener...ackListeners);
  
  /**
   * Registers a global event listener.
   * 
   * @param listener the listener
   */
  public abstract void registerEventListener(GlobalEventListener listener);
  
  /**
   * Deregisters a global event listener.
   * 
   * @param listener the listener
   */
  public abstract void deregisterEventListener(GlobalEventListener listener);
  
  /**
   * Registers a request listener.
   * 
   * @param listener the listener
   * @see BackboneAPI#registerRequestListener(RequestListener)
   */
  public abstract void registerRequestListener(RequestListener listener);
  
  /**
   * Deregisters a request listener.
   * 
   * @param listener the listener
   * @see BackboneAPI#deregisterRequestListener(RequestListener)
   */
  public abstract void deregisterRequestListener(RequestListener listener);
  
  /**
   * Executes a command on all servers as the CONSOLE.
   * 
   * @param command the command
   */
  public abstract void executeCommand(String command);
  
  /**
   * Executes a command on a particular server as the CONSOLE.
   * 
   * @param command the command
   * @param server the server
   * @return <code>true</code> iff the command was sent
   */
  public abstract boolean executeCommand(String command, String server);
  
}
