package me.gamewithjerry.hideandseek.inventories;

import me.gamewithjerry.hideandseek.items.menu.QuitItem;
import org.bukkit.entity.Player;

public class LobbyInventory {

    public void updateInventory(Player player) {
        player.getInventory().clear();

        player.getInventory().setItem(8, new QuitItem().get());
    }
}
