package me.gamewithjerry.hideandseek.listener;

import me.gamewithjerry.hideandseek.HideAndSeek;
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
        if(instance.gamestate.announceJoinAndQuits) {
            event.setJoinMessage(instance.PREFIX + event.getPlayer().getDisplayName() + " hat das Spiel betreten.");
        } else {
            event.setJoinMessage("");
        }

        if(instance.gamestate.joinAsSpectator) {
            instance.gameutils.setToSpectator(event.getPlayer());
        } else {
            instance.gameutils.setToPlayer(event.getPlayer());
        }

        instance.gameutils.teleportPlayer(event.getPlayer());
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        if(instance.gamestate.announceJoinAndQuits) {
            event.setQuitMessage(instance.PREFIX + event.getPlayer().getDisplayName() + " hat das Spiel verlassen.");
        } else {
            event.setQuitMessage("");
        }

        instance.gameutils.removeFromTeam(event.getPlayer());
    }
}
