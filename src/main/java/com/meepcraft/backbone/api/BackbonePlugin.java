package com.meepcraft.backbone.api;

import org.bukkit.plugin.java.JavaPlugin;

public abstract class BackbonePlugin extends JavaPlugin {
  
  public abstract PlayerManager getPlayerManager();
  
}
