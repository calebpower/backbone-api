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
   * Returns the ItemStack that is in the player's main hand.
   * 
   * @return an ItemStack representing the item(s) in the player's main hand
   */
  public ItemStack getItemInMainHand();
  
  /**
   * Sets the ItemStack in the player's main hand.
   * 
   * @param itemStack the ItemStack that is to be placed in the player's main hand
   * @return this GlobalPlayerInventory object
   */
  public GlobalPlayerInventory setItemInMainHand(ItemStack itemStack);
  
  /**
   * Returns the ItemStack that is in the player's off hand.
   * 
   * @return an ItemStack representing the item(s) in the player's off hand
   */
  public ItemStack getItemInOffHand();
  
  /**
   * Sets the ItemStack in the player's off hand.
   * 
   * @param itemStack the ItemStack that is to be placed in the player's off hand
   * @return this GlobalPlayerInventory object
   */
  public GlobalPlayerInventory setItemInOffHand(ItemStack itemStack);
  
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
  
  /**
   * Retrieves the slot number for the item that the player is holding.
   * 
   * @return an integer representing the slot number in question
   */
  public int getHeldItemSlot();
  
  /**
   * Sets the slot number for the item that the player is holding.
   * 
   * @param slot the slot position representing the slot number in question
   * @return this GlobalPlayerInventory object
   */
  public GlobalPlayerInventory setHeldItemSlot(int slot);
  
}
