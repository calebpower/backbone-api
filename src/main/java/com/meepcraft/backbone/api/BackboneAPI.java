package com.meepcraft.backbone.api;

import org.bukkit.Server;
import org.bukkit.plugin.Plugin;

public class BackboneAPI {
  
  private Server server = null;
  
  public BackboneAPI(Server server) {
    this.server = server;
  }
  
  public PlayerManager getPlayerManager() {
    Plugin plugin = server.getPluginManager().getPlugin("MeepBackbone");
    if(plugin != null) try {
      BackbonePlugin backbonePlugin = (BackbonePlugin)plugin;
      return backbonePlugin.getPlayerManager();
    } catch(ClassCastException e) {
      e.printStackTrace();
    }
    
    return null;
  }
  
}
