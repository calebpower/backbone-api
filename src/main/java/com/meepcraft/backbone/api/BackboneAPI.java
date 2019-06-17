package com.meepcraft.backbone.api;

import java.sql.Connection;

import org.bukkit.Server;
import org.bukkit.plugin.Plugin;

import com.meepcraft.backbone.api.request.BackboneRequest;

public class BackboneAPI {
  
  private BackbonePlugin plugin = null;
  
  public BackboneAPI(Server server) {
    Plugin plugin = server.getPluginManager().getPlugin("MeepBackbone");
    if(plugin != null) try {
      this.plugin = (BackbonePlugin)plugin;
    } catch(ClassCastException e) {
      e.printStackTrace();
    }
  }
  
  public Connection getDBConnection() {
    if(plugin != null)
      return plugin.getDBConnection();
    return null;
  }
  
  public PlayerManager getPlayerManager() {
    if(plugin != null)
      return plugin.getPlayerManager();
    return null;
  }
  
  public String getThisNodeLabel() {
    if(plugin != null)
      return plugin.getThisNodeLabel();
    return null;
  }
  
  public boolean dispatchRequest(BackboneRequest request) {
    if(plugin != null)
      return plugin.dispatchRequest(request);
    return false;
  }
  
  public boolean dispatchRequest(String node, BackboneRequest request) {
    if(plugin != null)
      return plugin.dispatchRequest(node, request);
    return false;
  }
  
}
