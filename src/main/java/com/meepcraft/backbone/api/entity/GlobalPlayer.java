package com.meepcraft.backbone.api.entity;

import java.util.UUID;

import org.json.JSONObject;

public interface GlobalPlayer {
  
  public static enum Status {
    ACTIVE,
    AFK,
    OFFLINE,
    BANNED
  }
  
  public GlobalLocation getLastKnownLocation();
  
  public UUID getUUID();
  
  public String getIGN();
  
  public Status getStatus();
  
  public JSONObject serialize();
  
  public boolean equals(GlobalPlayer player);
  
  public boolean isOnline();
  
}
