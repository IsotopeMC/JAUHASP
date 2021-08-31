package io.github.unstableprogrammers.hideandseek.listener.items;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import io.github.unstableprogrammers.hideandseek.game.gui.items.QuitItem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class QuitItemListener implements Listener {

    protected HideAndSeek instance;

    public QuitItemListener(HideAndSeek instance) {
        this.instance = instance;
    }

    @EventHandler
    public void onUse(PlayerInteractEvent event) {
        if (event.getAction().equals(Action.LEFT_CLICK_AIR) || event.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
            return;
        }

        Player player = event.getPlayer();
        ItemStack inhand = player.getInventory().getItemInMainHand();

        QuitItem item = new QuitItem();

        if (inhand.getType().isItem()) {
            if (inhand.equals(item.get())) {
                player.kickPlayer(null);
            }
        }
    }
}
