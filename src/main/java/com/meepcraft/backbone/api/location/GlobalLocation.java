package com.meepcraft.backbone.api.location;

import org.bukkit.Location;
import org.json.JSONObject;

public interface GlobalLocation {

  public JSONObject serialize();
  
  public Location getLocation();
  
  public String getServer();
  
  public String getWorld();
  
  public double getX();
  
  public double getY();
  
  public double getZ();
  
  public float getPitch();
  
  public float getYaw();
  
  public boolean equals(GlobalLocation location);
  
}
