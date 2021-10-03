package io.github.unstableprogrammers.hideandseek.listener.player;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public record PlayerLoginListener(HideAndSeek instance) implements Listener {

    @EventHandler
    public void on(PlayerLoginEvent event) {
        if (!instance.gamestate.canJoin()) {
            event.disallow(PlayerLoginEvent.Result.KICK_OTHER, "Bitte warte noch einen Moment, bis der Server gestartet ist.");
        }
    }
}
