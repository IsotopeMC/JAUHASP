package me.gamewithjerry.hideandseek.gui.inventories;

import me.gamewithjerry.hideandseek.gui.items.armor.hider.HiderBootsItem;
import me.gamewithjerry.hideandseek.gui.items.armor.hider.HiderChestplateItem;
import me.gamewithjerry.hideandseek.gui.items.armor.hider.HiderHelmetItem;
import me.gamewithjerry.hideandseek.gui.items.armor.hider.HiderLeggingsItem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class HiderInventory {

    public void setInventory(Player player) {
        PlayerInventory pinv = player.getInventory();

        pinv.clear();

        pinv.setHelmet(new HiderHelmetItem().get());
        pinv.setChestplate(new HiderChestplateItem().get());
        pinv.setLeggings(new HiderLeggingsItem().get());
        pinv.setBoots(new HiderBootsItem().get());
    }
}
