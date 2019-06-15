package com.meepcraft.backbone.api;

import java.sql.Connection;

import org.bukkit.plugin.java.JavaPlugin;

public abstract class BackbonePlugin extends JavaPlugin {
  
  public abstract Connection getDBConnection();
  
  public abstract PlayerManager getPlayerManager();
  
}
