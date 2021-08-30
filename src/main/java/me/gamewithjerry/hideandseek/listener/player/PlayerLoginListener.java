package me.gamewithjerry.hideandseek.listener.player;

import me.gamewithjerry.hideandseek.HideAndSeek;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class PlayerLoginListener implements Listener {

    private final HideAndSeek instance;

    public PlayerLoginListener(HideAndSeek instance) {
        this.instance = instance;
    }

    @EventHandler
    public void on(PlayerLoginEvent event) {
        if (!instance.gamestate.canJoin()) {
            event.disallow(PlayerLoginEvent.Result.KICK_OTHER, "Bitte warte noch einen Moment, bis der Server gestartet ist.");
        }
    }
}