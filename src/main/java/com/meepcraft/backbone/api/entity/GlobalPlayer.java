package com.meepcraft.backbone.api.entity;

import java.util.UUID;

public class GlobalPlayer {
  
  private GlobalLocation lastKnownLocation = null;
  private UUID uuid = null;
  private String ign = null;
  private Status status = null;
  
  public static enum Status {
    ACTIVE,
    AFK,
    OFFLINE,
    BANNED
  }
  
  public GlobalPlayer(UUID uuid, String ign, Status status, GlobalLocation lastKnownLocation) {
    this.uuid = uuid;
    this.ign = ign;
    this.status = status;
    this.lastKnownLocation = lastKnownLocation;
  }
  
  public GlobalLocation getLastKnownLocation() {
    return lastKnownLocation;
  }
  
  public UUID getUUID() {
    return uuid;
  }
  
  public String getIGN() {
    return ign;
  }
  
  public Status getStatus() {
    return status;
  }
  
}
