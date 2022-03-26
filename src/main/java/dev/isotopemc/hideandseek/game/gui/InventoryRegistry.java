package dev.isotopemc.hideandseek.game.gui;

import net.minestom.server.entity.Player;
import net.minestom.server.inventory.PlayerInventory;
import net.minestom.server.item.ItemStack;

import java.util.Objects;

public class InventoryRegistry {

    public static void setHiderInventory(Player iPlayer) {
        PlayerInventory pInventory = iPlayer.getInventory();

        pInventory.clear();
        pInventory.setHelmet(ItemRegistry.HIDER_HELMET);
        pInventory.setChestplate(ItemRegistry.HIDER_CHESTPLATE);
        pInventory.setLeggings(ItemRegistry.HIDER_LEGGINGS);
        pInventory.setBoots(ItemRegistry.HIDER_BOOTS);

        pInventory.setItemStack(0, ItemRegistry.HIDER_AXE);
    }

    public static void setSeekerInventory(Player iPlayer) {
        PlayerInventory pInventory = iPlayer.getInventory();

        pInventory.clear();
        pInventory.setHelmet(ItemRegistry.SEEKER_HELMET);
        pInventory.setChestplate(ItemRegistry.SEEKER_CHESTPLATE);
        pInventory.setLeggings(ItemRegistry.SEEKER_LEGGINGS);
        pInventory.setBoots(ItemRegistry.SEEKER_BOOTS);

        pInventory.setItemStack(0, ItemRegistry.HIDER_AXE);
    }

    public static void setLobbyInventory(Player iPlayer) {
        PlayerInventory pInventory = iPlayer.getInventory();

        pInventory.clear();
        pInventory.setItemStack(8, ItemRegistry.QUIT_ITEM);

        pInventory.addInventoryCondition((player, slot, clickType, inventoryConditionResult) -> {
            ItemStack clickedItem = Objects.requireNonNull(player.getOpenInventory()).getItemStack(slot);
            if(clickedItem == ItemRegistry.QUIT_ITEM) {
                iPlayer.kick("");
            }

            inventoryConditionResult.setCancel(true);
        });
    }
}
