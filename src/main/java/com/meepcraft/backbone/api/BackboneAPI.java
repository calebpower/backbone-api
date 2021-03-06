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

import org.bukkit.Server;
import org.bukkit.plugin.Plugin;

import com.meepcraft.backbone.api.listener.GlobalEventListener;
import com.meepcraft.backbone.api.player.PlayerManager;
import com.meepcraft.backbone.api.request.BackboneRequest;
import com.meepcraft.backbone.api.request.RequestAckListener;
import com.meepcraft.backbone.api.request.RequestListener;

/**
 * API object that grants access to the MeepBackbone plugin.
 * 
 * @author Caleb L. Power
 */
public class BackboneAPI {
  
  private BackbonePlugin plugin = null;
  
  /**
   * Overloaded constructor.
   * 
   * @param server the Spigot server
   */
  public BackboneAPI(Server server) {
    Plugin plugin = server.getPluginManager().getPlugin("MeepBackbone");
    if(plugin != null) try {
      this.plugin = (BackbonePlugin)plugin;
    } catch(ClassCastException e) {
      e.printStackTrace();
    }
  }
  
  /**
   * Retrieves a connection to the database.
   * 
   * @return the database connection or <code>null</code> if the database
   *         connection couldn't be retrieved
   * @see BackbonePlugin#getDBConnection()
   */
  public Connection getDBConnection() {
    if(plugin != null)
      return plugin.getDBConnection();
    return null;
  }
  
  /**
   * Retrieves the player manager.
   * 
   * @return the player manager or <code>null</code> if the player manager
   *         couldn't be retrieved
   * @see BackbonePlugin#getPlayerManager()
   */
  public PlayerManager getPlayerManager() {
    if(plugin != null)
      return plugin.getPlayerManager();
    return null;
  }
  
  /**
   * Retrieves the name of this node/server.
   * 
   * @return the instance label or <code>null</code> if the label couldn't be
   *         retrieved
   * @see BackbonePlugin#getThisNodeLabel()
   */
  public String getThisNodeLabel() {
    if(plugin != null)
      return plugin.getThisNodeLabel();
    return null;
  }
  
  /**
   * Dispatches a request to all other servers. Automatically retries failed
   * transmissions.
   * 
   * @param request the request
   * @return <code>true</code> iff all servers received the request
   * @see BackbonePlugin#dispatchRequest(BackboneRequest)
   */
  public boolean dispatchRequest(BackboneRequest request) {
    if(plugin != null)
      return plugin.dispatchRequest(request);
    return false;
  }
  
  /**
   * Dispatches a request to all other servers. Allows for explicit direction
   * as to whether a failed request should be retried. 
   * 
   * @param request the request
   * @param retryOnFailure <code>true</code> to retry on transmission failure
   * @return <code>true</code> iff all servers received the request on the first try
   * @see BackbonePlugin#dispatchRequest(BackboneRequest, boolean)
   */
  public boolean dispatchRequest(BackboneRequest request, boolean retryOnFailure) {
    if(plugin != null)
      return plugin.dispatchRequest(request, retryOnFailure);
    return false;
  }
  
  /**
   * Dispatches a request to a single node/server.
   * 
   * @param node the recipient node
   * @param request the request
   * @return <code>true</code> iff the server received the transmission
   * @see BackbonePlugin#dispatchRequest(String, BackboneRequest)
   */
  public boolean dispatchRequest(String node, BackboneRequest request) {
    if(plugin != null)
      return plugin.dispatchRequest(node, request);
    return false;
  }
  
  /**
   * Dispatches a request to a single node/server. Allows for explicit
   * direction as to whether a failed request should be retried.
   * 
   * @param node the recipient node
   * @param request the request
   * @param retryOnFailure <code>true</code> to retry on transmission failure
   * @return <code>true</code> iff the server received the transmission on the first try
   * @see BackbonePlugin#dispatchRequest(String, BackboneRequest, boolean)
   */
  public boolean dispatchRequest(String node, BackboneRequest request, boolean retryOnFailure) {
    if(plugin != null)
      return plugin.dispatchRequest(node, request, retryOnFailure);
    return false;
  }
  
  /**
   * Dispatches a request to a single node/server.
   * 
   * @param node the recipient node
   * @param request the request
   * @param ackListeners additional acknowledgement listeners to attach to the payload
   * @return <code>true</code> iff the server received the transmission
   * @see BackbonePlugin#dispatchRequest(String, BackboneRequest, RequestAckListener...)
   */
  public boolean dispatchRequest(String node, BackboneRequest request, RequestAckListener... ackListeners) {
    if(plugin != null)
      return plugin.dispatchRequest(node, request, ackListeners);
    return false;
  }
  
  /**
   * Dispatches a request to a single node/server. Allows for explicit
   * direction as to whether a failed request should be retried.
   * 
   * @param node the recipient node
   * @param request the request
   * @param retryOnFailure <code>true</code> to retry on transmission failure
   * @param ackListeners additional acknowledgement listeners to attach to the payload
   * @return <code>true</code> iff the server received the transmission on the first try
   * @see BackbonePlugin#dispatchRequest(String, BackboneRequest, boolean, RequestAckListener...)
   */
  public boolean dispatchRequest(String node, BackboneRequest request, boolean retryOnFailure, RequestAckListener... ackListeners) {
    if(plugin != null)
      return plugin.dispatchRequest(node, request, retryOnFailure, ackListeners);
    return false;
  }
  
  /**
   * Registers a global event listener.
   * 
   * @param listener the listener
   * @return <code>true</code> iff the registration was successful
   */
  public boolean registerEventListener(GlobalEventListener listener) {
    if(plugin == null) return false;
    plugin.registerEventListener(listener);
    return true;
  }
  
  /**
   * Deregisters a global event listener.
   * 
   * @param listener the listener
   * @return <code>true</code> iff the registration was successful
   */
  public boolean deregisterEventListener(GlobalEventListener listener) {
    if(plugin == null) return false;
    plugin.deregisterEventListener(listener);
    return true;
  }
  
  /**
   * Registers a request listener.
   * 
   * @param requestListener the listener
   * @return <code>true</code> iff the registration was successful
   * @see BackbonePlugin#registerRequestListener(RequestListener)
   */
  public boolean registerRequestListener(RequestListener requestListener) {
    if(plugin == null) return false;
    plugin.registerRequestListener(requestListener);
    return true;
  }
  
  /**
   * Deregisters a request listener.
   * 
   * @param requestListener the listener
   * @return <code>true</code> iff the deregistration was successful
   * @see BackbonePlugin#deregisterRequestListener(RequestListener)
   */
  public boolean deregisterRequestListener(RequestListener requestListener) {
    if(plugin == null) return false;
    plugin.deregisterRequestListener(requestListener);
    return true;
  }
  
  /**
   * Executes a command on all servers as the CONSOLE.
   * 
   * @param command the command
   * @return <code>true</code> iff the command was sent and executed
   */
  public boolean executeCommand(String command) {
    if(plugin == null) return false;
    plugin.executeCommand(command);
    return true;
  }
  
  /**
   * Executes a command on a particular server as the CONSOLE.
   * 
   * @param command the command
   * @param server the server
   * @return <code>true</code> iff the command was sent and executed
   */
  public boolean executeCommand(String command, String server) {
    if(plugin == null) return false;
    return executeCommand(command, server);
  }
  
}
