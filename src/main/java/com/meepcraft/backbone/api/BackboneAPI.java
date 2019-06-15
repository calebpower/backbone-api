package com.meepcraft.backbone.api;

import java.sql.Connection;

import org.bukkit.Server;
import org.bukkit.plugin.Plugin;

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
  
}
