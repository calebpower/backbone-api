package com.meepcraft.backbone.api.location;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.json.JSONObject;

public class MeepLocation implements GlobalLocation {
  
  private String server = null;
  private String world = null;
  private double x = 0d;
  private double y = 0d;
  private double z = 0d;
  private float pitch = 0f;
  private float yaw = 0f;
  
  public MeepLocation(String server, String world, double x, double y, double z) {
    this.server = server;
    this.world = world;
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public MeepLocation(String server, String world, double x, double y, double z, float pitch, float yaw) {
    this(server, world, x, y, z);
    this.pitch = pitch;
    this.yaw = yaw;
  }
  
  public MeepLocation(String server, Location location) {
    this.server = server;
    this.world = location.getWorld().getName();
    this.x = location.getX();
    this.y = location.getY();
    this.z = location.getZ();
    this.pitch = location.getPitch();
    this.yaw = location.getYaw();
  }
  
  public MeepLocation(JSONObject json) {
    server = json.getString("server");
    world = json.getString("world");
    x = json.getDouble("x");
    y = json.getDouble("y");
    z = json.getDouble("z");
    pitch = json.getFloat("pitch");
    yaw = json.getFloat("yaw");
  }
  
  @Override public JSONObject serialize() {
    return new JSONObject()
        .put("server", server)
        .put("world", world)
        .put("x", x)
        .put("y", y)
        .put("z", z)
        .put("pitch", pitch)
        .put("yaw", yaw);
  }
  
  @Override public Location getLocation() {
    Location location = null;
    World world = Bukkit.getWorld(this.world);
    if(world != null)
      location = new Location(world, x, y, z, yaw, pitch);
    return location;
  }
  
  @Override public String getServer() {
    return server;
  }
  
  @Override public String getWorld() {
    return world;
  }
  
  @Override public double getX() {
    return x;
  }
  
  @Override public double getY() {
    return y;
  }
  
  @Override public double getZ() {
    return z;
  }
  
  @Override public float getPitch() {
    return pitch;
  }
  
  @Override public float getYaw() {
    return yaw;
  }
  
  @Override public boolean equals(GlobalLocation location) {
    return serialize().similar(location.serialize());
  }
  
}
