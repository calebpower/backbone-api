package com.meepcraft.backbone.api.player;

import java.util.Date;
import java.util.UUID;

import org.json.JSONObject;

import com.meepcraft.backbone.api.location.GlobalLocation;

public interface GlobalPlayer {
  
  public static enum Status {
    ACTIVE,
    AFK,
    OFFLINE,
    BANNED
  }
  
  public UUID getUUID();
  
  public String getIGN();
  
  public Status getStatus();
  
  public GlobalLocation getLastKnownLocation();
  
  public Date getFirstSeenTimestamp();
  
  public Date getLastSeenTimestamp();
    
  public JSONObject serialize();
  
  public boolean equals(GlobalPlayer player);
  
  public boolean isOnline();
  
}
