package dev.isotopemc.hideandseek.game.gui.inventories;

import dev.isotopemc.hideandseek.game.gui.items.armor.seeker.SeekerBootsItem;
import dev.isotopemc.hideandseek.game.gui.items.armor.seeker.SeekerChestplateItem;
import dev.isotopemc.hideandseek.game.gui.items.armor.seeker.SeekerHelmetItem;
import dev.isotopemc.hideandseek.game.gui.items.armor.seeker.SeekerLeggingsItem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class SeekerInventory {

    public void setInventory(Player player) {
        PlayerInventory pinv = player.getInventory();

        pinv.clear();

        pinv.setHelmet(new SeekerHelmetItem().get());
        pinv.setChestplate(new SeekerChestplateItem().get());
        pinv.setLeggings(new SeekerLeggingsItem().get());
        pinv.setBoots(new SeekerBootsItem().get());
    }
}
