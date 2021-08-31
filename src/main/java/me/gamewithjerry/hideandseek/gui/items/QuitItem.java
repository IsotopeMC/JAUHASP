package me.gamewithjerry.hideandseek.gui.items;

import me.gamewithjerry.hideandseek.game.GameItem;
import me.gamewithjerry.hideandseek.helpers.ItemHelper;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class QuitItem extends GameItem {
    public QuitItem() {
        super("Verlassen", Material.MAGMA_CREAM, 1);
    }
}
