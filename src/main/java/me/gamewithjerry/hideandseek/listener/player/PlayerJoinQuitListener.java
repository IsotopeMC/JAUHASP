package me.gamewithjerry.hideandseek.listener.player;

import me.gamewithjerry.hideandseek.HideAndSeek;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinQuitListener implements Listener {

    protected HideAndSeek instance;

    public PlayerJoinQuitListener(HideAndSeek instance) {
        this.instance = instance;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (instance.gamestate.announceJoins()) {
            event.setJoinMessage(instance.PREFIX + player.getDisplayName() + " hat das Spiel betreten.");
        } else {
            event.setJoinMessage("");
        }

        if (instance.gamestate.joinAsSpectator()) {
            instance.gameutils.setToSpectator(player);
        } else {
            instance.gameutils.setToPlayer(player);
        }

        player.sendMessage(instance.gamestate.getJoinMessage());
        instance.gameutils.teleportPlayer(player);
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        instance.gameutils.removeFromTeam(player);

        if (instance.gamestate.announceQuits()) {
            event.setQuitMessage(instance.PREFIX + player.getDisplayName() + " hat das Spiel verlassen.");
        } else {
            event.setQuitMessage("");
        }
    }
}
