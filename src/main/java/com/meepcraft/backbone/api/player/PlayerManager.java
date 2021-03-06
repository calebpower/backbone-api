/*
 * Copyright (c) 2019 Axonibyte Innovations, LLC. All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.meepcraft.backbone.api.player;

import java.util.UUID;

import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.Sound;

/**
 * Manages and interacts with players in the universe.
 * 
 * @author Caleb L. Power
 */
public interface PlayerManager {
  
  /**
   * Broadcasts a message to all players.
   * 
   * @param message the message
   */
  public void broadcastMessage(String message);
  
  /**
   * Broadcasts a message to all players on a particular server.
   * 
   * @param server the name of the server
   * @param message the message
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean broadcastMessage(String server, String message);
  
  /**
   * Broadcasts a message to all players on a particular world.
   * 
   * @param server the name of the server
   * @param world the name of the world
   * @param message the message
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean broadcastMessage(String server, String world, String message);
  
  /**
   * Broadcasts a message to all players on a particular world.
   * 
   * @param server the name of the server
   * @param world the name of the world
   * @param message the message
   * @param permission a permission that a player must have to receive the message
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean broadcastMessage(String server, String world, String message, String permission);
  
  /**
   * Broadcasts a title to all players.
   * 
   * @param title the title in question
   * @param subtitle the subtitle in question
   * @param fadeInDuration the duration of the fade-in effect
   * @param staticDuration the duration of the title
   * @param fadeOutDuration the duration of the fade-out effect
   */
  public void broadcastTitle(String title, String subtitle,
      int fadeInDuration, int staticDuration, int fadeOutDuration);
  
  /**
   * Broadcasts a title to all players on a particular server.
   * 
   * @param server the server in question
   * @param title the title in question
   * @param subtitle the subtitle in question
   * @param fadeInDuration the duration of the fade-in effect
   * @param staticDuration the duration of the title
   * @param fadeOutDuration the duration of the fade-out effect
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean broadcastTitle(String server, String title, String subtitle,
      int fadeInDuration, int staticDuration, int fadeOutDuration);
  
  /**
   * Broadcasts a title to all players in a particular world.
   * 
   * @param server the server in question
   * @param world the world in question
   * @param title the title in question
   * @param subtitle the subtitle in question
   * @param fadeInDuration the duration of the fade-in effect
   * @param staticDuration the duration of the title
   * @param fadeOutDuration the duration of the fade-out effect
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean broadcastTitle(String server, String world, String title, String subtitle,
      int fadeInDuration, int staticDuration, int fadeOutDuration);
  
  /**
   * Broadcasts a title to all players in a particular world.
   * 
   * @param server the server in question
   * @param world the world in question
   * @param title the title in question
   * @param subtitle the subtitle in question
   * @param fadeInDuration the duration of the fade-in effect
   * @param staticDuration the duration of the title
   * @param fadeOutDuration the duration of the fade-out effect
   * @param permission a permission that a player must have to receive the title
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean broadcastTitle(String server, String world, String title, String subtitle,
      int fadeInDuration, int staticDuration, int fadeOutDuration, String permission);
  
  /**
   * Broadcasts a note to all players.
   * 
   * @param instrument the instrument in question
   * @param note the note in question
   */
  public void broadcastNote(Instrument instrument, Note note);
  
  /**
   * Broadcasts a note to all players on a particular server.
   * 
   * @param server the server in question
   * @param instrument the instrument in question
   * @param note the note in question
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean broadcastNote(String server, Instrument instrument, Note note);
  
  /**
   * Broadcasts a note to all players in a particular world.
   * 
   * @param server the server in question
   * @param world the world in question
   * @param instrument the instrument in question
   * @param note the note in question
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean broadcastNote(String server, String world, Instrument instrument, Note note);
  
  /**
   * Broadcasts a note to all players in a particular world.
   * 
   * @param server the server in question
   * @param world the world in question
   * @param instrument the instrument in question
   * @param note the note in question
   * @param permission a permission required for a player to receive the note
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean broadcastNote(String server, String world,
      Instrument instrument, Note note, String permission);
  
  /**
   * Broadcasts a sound to all players.
   * 
   * @param sound the sound in question
   * @param volume the volume of the sound
   * @param pitch the pitch of the sound
   */
  public void broadcastSound(Sound sound, float volume, float pitch);
  
  /**
   * Broadcasts a sound to all players on a particular server.
   * 
   * @param server the server in question
   * @param sound the sound in question
   * @param volume the volume of the sound
   * @param pitch the pitch of the sound
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean broadcastSound(String server, Sound sound, float volume, float pitch);
  
  /**
   * Broadcasts a sound to all players in a particular world.
   * 
   * @param server the server in question
   * @param world the world in question
   * @param sound the sound in question
   * @param volume the volume of the sound
   * @param pitch the pitch of the sound
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean broadcastSound(String server, String world, Sound sound, float volume, float pitch);
  
  /**
   * Broadcasts a sound to all players in a particular world.
   * 
   * @param server the server in question
   * @param world the world in question
   * @param sound the sound in question
   * @param volume the volume of the sound
   * @param pitch the pitch of the sound
   * @param permission a permission required for a sound to be played to a player
   * @return <code>true</code> on transmission preflight check success
   */
  public boolean broadcastSound(String server, String world,
      Sound sound, float volume, float pitch, String permission);
  
  /**
   * Retrieves a global player by unique identifier if they exist.
   * 
   * @param uuid the UUID of the player
   * @return the global player
   */
  public GlobalPlayer getGlobalPlayer(UUID uuid);
  
  /**
   * Retrieves a global player by name if they exist.
   * Note: If they changed their name and haven't logged on, they will be known
   * by their old name until it gets updated.
   * 
   * @param ign the player's in-game name
   * @return the global player
   */
  public GlobalPlayer getGlobalPlayer(String ign);
  
  /**
   * Updates the global player. The player passed in as an argument will be
   * known throughout the universe.
   * 
   * @param player the player
   */
  public void updateGlobalPlayer(GlobalPlayer player);
  
}
