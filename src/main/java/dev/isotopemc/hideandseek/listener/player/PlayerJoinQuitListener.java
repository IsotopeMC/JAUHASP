package dev.isotopemc.hideandseek.listener.player;

import dev.isotopemc.hideandseek.HideAndSeek;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public record PlayerJoinQuitListener(HideAndSeek instance) implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.joinMessage(
                instance.gamestate.announceJoins() ?
                        Component.text(instance.PREFIX + player.displayName().examinableName()+"hat das Spiel betreten.") :
                        null
        );

        if (instance.gamestate.joinAsSpectator()) {
            instance.teams.setToSpectator(player);
        } else {
            instance.teams.setToLobby(player);
        }

        player.sendMessage(instance.gamestate.getJoinMessage());
        instance.teams.teleportPlayer(player);
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        instance.teams.removeFromTeam(player);

        event.quitMessage(
                instance.gamestate.announceJoins() ?
                        Component.text(instance.PREFIX + player.displayName().examinableName()+" hat das Spiel verlassen.") :
                        null
        );
    }
}
