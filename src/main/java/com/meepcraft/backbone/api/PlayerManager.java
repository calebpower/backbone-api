package com.meepcraft.backbone.api;

import java.util.UUID;

import com.meepcraft.backbone.api.location.GlobalLocation;
import com.meepcraft.backbone.api.player.GlobalPlayer;

public interface PlayerManager {
  
  public void broadcastMessage(String message);
  
  public boolean broadcastMessage(String server, String message);
  
  public boolean sendMessage(GlobalPlayer player, String message);
  
  public boolean teleportPlayer(GlobalPlayer player, GlobalLocation location);
  
  public GlobalPlayer getGlobalPlayer(UUID uuid);
  
  public GlobalPlayer getGlobalPlayer(String ign);
  
  public void updateGlobalPlayer(GlobalPlayer player);
  
}
