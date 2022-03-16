package dev.isotopemc.hideandseek.listener.player;

import dev.isotopemc.hideandseek.HideAndSeek;
import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public record PlayerLoginListener(HideAndSeek instance) implements Listener {

    @EventHandler
    public void on(PlayerLoginEvent event) {
        if (!instance.gamestate.canJoin()) {
            event.disallow(PlayerLoginEvent.Result.KICK_OTHER, Component.text("Bitte warte noch einen Moment, bis der Server gestartet ist."));
        }
    }
}
