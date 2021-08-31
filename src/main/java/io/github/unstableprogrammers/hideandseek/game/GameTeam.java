package io.github.unstableprogrammers.hideandseek.game;

import org.bukkit.Color;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class GameTeam {

    public final String name;
    public final Color color;
    public final Boolean hidden;
    public List<Player> players = new ArrayList<>();

    public GameTeam(String name, Color color, Boolean hidden) {
        this.name = name;
        this.color = color;
        this.hidden = hidden;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(Player player) {
        this.players.remove(player);
    }

    public boolean containsPlayer(Player player) {
        return this.players.contains(player);
    }
}
