package io.github.unstableprogrammers.hideandseek.gui.inventories;

import io.github.unstableprogrammers.hideandseek.gui.items.QuitItem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class LobbyInventory {

    public void setInventory(Player player) {
        PlayerInventory pinv = player.getInventory();

        pinv.clear();

        pinv.setItem(8, new QuitItem().get());
    }
}
