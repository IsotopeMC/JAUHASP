package me.gamewithjerry.hideandseek.items.menu;

import me.gamewithjerry.hideandseek.game.GameItem;
import me.gamewithjerry.hideandseek.helpers.ItemHelper;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class QuitItem extends GameItem {

    public QuitItem() {
        this.name = "Verlassen";
        this.material = Material.MAGMA_CREAM;
    }

    public ItemStack get() {
        return new ItemHelper(material).setAmount(1).setDisplayname(name).get();
    }
}
