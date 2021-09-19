package io.github.unstableprogrammers.hideandseek.listener.player;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import io.github.unstableprogrammers.hideandseek.game.visuals.deaths.LightningBoltDeath;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {

    protected HideAndSeek instance;

    public PlayerDeathListener(HideAndSeek instance) {
        this.instance = instance;
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();

        event.getDrops().clear();
        event.setDeathMessage(null);

        new LightningBoltDeath(player.getLocation());

        if(instance.teams.isHider(player)) {
            instance.teams.setToSpectator(player);
        }

        player.spigot().respawn();
    }
}
