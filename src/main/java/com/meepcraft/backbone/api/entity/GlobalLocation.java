package com.meepcraft.backbone.api.entity;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.json.JSONObject;

public class GlobalLocation {
  
  private static String defaultServer = null;
  
  private String server = null;
  private String world = null;
  private double x = 0d;
  private double y = 0d;
  private double z = 0d;
  private float pitch = 0f;
  private float yaw = 0f;
  
  public GlobalLocation(String server, String world, double x, double y, double z) {
    this.server = server;
    this.world = world;
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public GlobalLocation(String server, String world, double x, double y, double z, float pitch, float yaw) {
    this(server, world, x, y, z);
    this.pitch = pitch;
    this.yaw = yaw;
  }
  
  public GlobalLocation(Location location) {
    this(defaultServer, location);
  }
  
  public GlobalLocation(String server, Location location) {
    this.server = server;
    this.world = location.getWorld().getName();
    this.x = location.getX();
    this.y = location.getY();
    this.z = location.getZ();
    this.pitch = location.getPitch();
    this.yaw = location.getYaw();
  }
  
  public GlobalLocation(JSONObject json) {
    server = json.getString("server");
    world = json.getString("world");
    x = json.getDouble("x");
    y = json.getDouble("y");
    z = json.getDouble("z");
    pitch = json.getFloat("pitch");
    yaw = json.getFloat("yaw");
  }
  
  public JSONObject serialize() {
    return new JSONObject()
        .put("server", server)
        .put("world", world)
        .put("x", x)
        .put("y", y)
        .put("z", z)
        .put("pitch", pitch)
        .put("yaw", yaw);
  }
  
  public Location getLocation() {
    Location location = null;
    World world = Bukkit.getWorld(this.world);
    if(world != null)
      location = new Location(world, x, y, z, pitch, yaw);
    return location;
  }
  
  public String getServer() {
    return server;
  }
  
  public String getWorld() {
    return world;
  }
  
  public double getX() {
    return x;
  }
  
  public double getY() {
    return y;
  }
  
  public double getZ() {
    return z;
  }
  
  public float getPitch() {
    return pitch;
  }
  
  public float getYaw() {
    return yaw;
  }
  
  public static void setDefaultServer(String server) {
    defaultServer = server;
  }
  
}
