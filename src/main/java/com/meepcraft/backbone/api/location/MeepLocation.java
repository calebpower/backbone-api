package com.meepcraft.backbone.api.location;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.json.JSONObject;

/**
 * A location specifically on MeepCraft.
 * Initializes the abstract GlobalLocation methods.
 * 
 * @see GlobalLocation
 * @author Caleb
 */
public class MeepLocation implements GlobalLocation {
  
  private String server = null;
  private String world = null;
  private double x = 0d;
  private double y = 0d;
  private double z = 0d;
  private float pitch = 0f;
  private float yaw = 0f;
  
  /**
   * Overloaded constructor to generate a MeepLocation and, by extension,
   * a GlobalLocation. The pitch and yaw will be set to <code>0</code>.
   * 
   * @param server the name of the server
   * @param world the name of the world
   * @param x the x-coordinate
   * @param y the y-coordinate
   * @param z the z-coordinate
   */
  public MeepLocation(String server, String world, double x, double y, double z) {
    this.server = server;
    this.world = world;
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  /**
   * Overloaded constructor to generate a MeepLocation and, by extension,
   * a GlobalLocation.
   * 
   * @param server the name of the server
   * @param world the name of the world
   * @param x the x-coordinate
   * @param y the y-coordinate
   * @param z the z-coordinate
   * @param pitch the pitch
   * @param yaw the yaw
   */
  public MeepLocation(String server, String world, double x, double y, double z, float pitch, float yaw) {
    this(server, world, x, y, z);
    this.pitch = pitch;
    this.yaw = yaw;
  }
  
  /**
   * Overloaded constructor to generate a MeepLocation and, by extension,
   * a GlobalLocation from an existing location.
   * 
   * @param server the name of the server
   * @param location a reference to the Spigot location
   */
  public MeepLocation(String server, Location location) {
    this.server = server;
    this.world = location.getWorld().getName();
    this.x = location.getX();
    this.y = location.getY();
    this.z = location.getZ();
    this.pitch = location.getPitch();
    this.yaw = location.getYaw();
  }
  
  /**
   * Overloaded constructor to generate a MeepLocation via deserialization.
   * 
   * @param json the serialized GlobalLocation
   */
  public MeepLocation(JSONObject json) {
    server = json.getString("server");
    world = json.getString("world");
    x = json.getDouble("x");
    y = json.getDouble("y");
    z = json.getDouble("z");
    pitch = json.getFloat("pitch");
    yaw = json.getFloat("yaw");
  }
  
  /**
   * {@inheritDoc}
   */
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
  
  /**
   * {@inheritDoc}
   */
  @Override public Location getLocation() {
    Location location = null;
    World world = Bukkit.getWorld(this.world);
    if(world != null)
      location = new Location(world, x, y, z, yaw, pitch);
    return location;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override public String getServer() {
    return server;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override public String getWorld() {
    return world;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override public double getX() {
    return x;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override public double getY() {
    return y;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override public double getZ() {
    return z;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override public float getPitch() {
    return pitch;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override public float getYaw() {
    return yaw;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override public boolean equals(GlobalLocation location) {
    return serialize().similar(location.serialize());
  }
  
}
