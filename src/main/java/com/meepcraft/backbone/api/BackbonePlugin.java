package com.meepcraft.backbone.api;

import java.sql.Connection;

import org.bukkit.plugin.java.JavaPlugin;

import com.meepcraft.backbone.api.request.BackboneRequest;
import com.meepcraft.backbone.api.request.RequestListener;

public abstract class BackbonePlugin extends JavaPlugin {
  
  public abstract Connection getDBConnection();
  
  public abstract PlayerManager getPlayerManager();
  
  public abstract String getThisNodeLabel();
  
  public abstract boolean dispatchRequest(BackboneRequest request);
  
  public abstract boolean dispatchRequest(String node, BackboneRequest request);
  
  public abstract void registerRequestListener(RequestListener requestListener);
  
  public abstract void deregisterRequestListener(RequestListener requestListener);
  
}
