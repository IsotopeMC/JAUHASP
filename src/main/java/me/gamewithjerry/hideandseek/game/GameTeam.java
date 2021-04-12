package me.gamewithjerry.hideandseek.game;

import me.gamewithjerry.hideandseek.HideAndSeek;
import org.bukkit.Color;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class GameTeam {

    protected final HideAndSeek instance;

    public final String name;
    public final Color color;
    public final Boolean hidden;

    public List<Player> players = new ArrayList<>();

    public GameTeam(HideAndSeek instance, String name, Color color, Boolean hidden) {
        this.instance = instance;

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
