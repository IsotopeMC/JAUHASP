package io.github.unstableprogrammers.hideandseek.game;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import org.bukkit.Color;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class GameTeam {

    protected HideAndSeek instance;

    protected final String name;
    protected final Color color;
    protected final Boolean hidden;
    protected List<Player> players = new ArrayList<>();

    public GameTeam(HideAndSeek instance, String name, Color color, Boolean hidden) {
        this.instance = instance;

        this.name = name;
        this.color = color;
        this.hidden = hidden;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
        this.updateInventory(player);

        this.instance.updateHiddenPlayers();
    }

    public String getName() {
        return this.name;
    }

    public void removePlayer(Player player) {
        this.players.remove(player);

        this.instance.updateHiddenPlayers();
    }

    public boolean containsPlayer(Player player) {
        return this.players.contains(player);
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public abstract void updateInventory(Player player);

    public abstract void updateScoreboard(Player player);
}
