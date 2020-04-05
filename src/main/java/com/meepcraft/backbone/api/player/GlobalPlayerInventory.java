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

import org.bukkit.inventory.ItemStack;

/**
 * Represents a player's inventory.
 * 
 * @author Caleb L. Power
 */
public interface GlobalPlayerInventory {
  
  /**
   * Returns the ItemStack from the boots slot.
   * 
   * @return an ItemStack representing the item(s) in the boots slot
   */
  public ItemStack getBoots();
  
  /**
   * Sets the ItemStack in the boots slot.
   * 
   * @param itemStack the ItemStack that is to be placed in the boots slot
   * @return this GlobalPlayerInventory object
   */
  public GlobalPlayerInventory setBoots(ItemStack itemStack);
  
  /**
   * Returns the ItemStack from the chestplate slot.
   * 
   * @return an ItemStack representing the item(s) in the chestplate slot
   */
  public ItemStack getChestplate();
  
  /**
   * Sets the ItemStack in the chestplate slot.
   * 
   * @param itemStack the ItemStack that is to be placed in the chestplate slot
   * @return this GlobalPlayerInventory object
   */
  public GlobalPlayerInventory setChestplate(ItemStack itemStack);
  
  /**
   * Returns the ItemStack from the helmet slot.
   * 
   * @return an ItemStack representing the item(s) in the helmet slot
   */
  public ItemStack getHelmet();
  
  /**
   * Sets the ItemStack in the helmet slot.
   * 
   * @param itemStack the ItemStack that is to be placed in the helmet slot
   * @return this GlobalPlayerInventory object
   */
  public GlobalPlayerInventory setHelmet(ItemStack itemStack);
  
  /**
   * Returns the ItemStack in the leggings slot.
   * 
   * @return an ItemStack representing the item(s) in the leggings slot
   */
  public ItemStack getLeggings();
  
  /**
   * Sets the ItemStack in the leggings slot.
   * 
   * @param itemStack the ItemStack that is to be placed in the leggings slot
   * @return this GlobalPlayerInventory object
   */
  public GlobalPlayerInventory setLeggings(ItemStack itemStack);
  
  /**
   * Retrieves the contents of an inventory.
   * 
   * @return an array of ItemStacks representing the items in an inventory
   */
  public ItemStack[] getContents();
  
  /**
   * Sets the contents of an inventory.
   * 
   * @param itemStacks the array of ItemStacks that should replace the inventory
   * @return this GlobalPlayerInventory object
   */
  public GlobalPlayerInventory setContents(ItemStack[] itemStacks);
  
}
