package me.gamewithjerry.hideandseek.game;

import me.gamewithjerry.hideandseek.HideAndSeek;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class GameUtils {

    public Map<Player, GameTeam> players = new HashMap<>();
    protected HideAndSeek instance;

    public GameUtils(HideAndSeek instance) {
        this.instance = instance;
    }

    public void removeFromTeam(Player player) {
        if (players.containsKey(player)) {
            players.get(player).removePlayer(player);
            players.remove(player);
        }
    }

    public void setToPlayer(Player player) {
        this.removeFromTeam(player);

        players.put(player, instance.lobby);
        instance.lobby.addPlayer(player);
    }

    public void setToSpectator(Player player) {
        this.removeFromTeam(player);

        players.put(player, instance.spectators);
        instance.spectators.addPlayer(player);
    }

    public void setToHider(Player player) {
        this.removeFromTeam(player);

        players.put(player, instance.hiders);
        instance.hiders.addPlayer(player);
    }

    public void setToSeeker(Player player) {
        this.removeFromTeam(player);

        players.put(player, instance.seekers);
        instance.seekers.addPlayer(player);
    }

    public void teleportPlayer(Player player) {

    }
}
