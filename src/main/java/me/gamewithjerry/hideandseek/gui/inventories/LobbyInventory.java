package me.gamewithjerry.hideandseek.gui.inventories;

import me.gamewithjerry.hideandseek.gui.items.QuitItem;
import org.bukkit.entity.Player;

public class LobbyInventory {

    public void updateInventory(Player player) {
        player.getInventory().clear();

        player.getInventory().setItem(8, new QuitItem().get());
    }
}
