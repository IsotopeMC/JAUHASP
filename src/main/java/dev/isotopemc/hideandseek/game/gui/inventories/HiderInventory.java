package dev.isotopemc.hideandseek.game.gui.inventories;

import dev.isotopemc.hideandseek.game.gui.items.armor.hider.HiderAxe;
import dev.isotopemc.hideandseek.game.gui.items.armor.hider.HiderBootsItem;
import dev.isotopemc.hideandseek.game.gui.items.armor.hider.HiderChestplateItem;
import dev.isotopemc.hideandseek.game.gui.items.armor.hider.HiderHelmetItem;
import dev.isotopemc.hideandseek.game.gui.items.armor.hider.HiderLeggingsItem;
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

        pinv.setItem(0, new HiderAxe().get());
    }
}
