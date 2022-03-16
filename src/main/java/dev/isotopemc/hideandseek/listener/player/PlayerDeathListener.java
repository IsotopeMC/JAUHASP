package dev.isotopemc.hideandseek.listener.player;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.game.visuals.deaths.LightningBoltDeath;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public record PlayerDeathListener(HideAndSeek instance) implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();

        event.setKeepInventory(true);
        event.getDrops().clear();
        event.deathMessage(null);

        new LightningBoltDeath(instance, player.getLocation());

        if (instance.teams.isHider(player)) {
            instance.teams.setToSpectator(player);
        }

        player.spigot().respawn();
    }
}
