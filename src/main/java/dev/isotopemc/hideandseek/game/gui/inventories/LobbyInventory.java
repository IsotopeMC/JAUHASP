package dev.isotopemc.hideandseek.game.gui.inventories;

import dev.isotopemc.hideandseek.game.gui.items.QuitItem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class LobbyInventory {

    public void setInventory(Player player) {
        PlayerInventory pinv = player.getInventory();

        pinv.clear();

        pinv.setItem(8, new QuitItem().get());
    }
}
