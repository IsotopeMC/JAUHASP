package dev.isotopemc.hideandseek.game;

import dev.isotopemc.hideandseek.HideAndSeek;
import net.minestom.server.color.Color;
import net.minestom.server.entity.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class GameTeam {

    protected HideAndSeek instance;

    protected final String name;
    protected final Color color;
    protected final Boolean hidden;
    protected final Boolean canFly;

    protected List<Player> players = new ArrayList<>();

    public GameTeam(HideAndSeek instance, String name, Color color, Boolean hidden, Boolean canFly) {
        this.instance = instance;

        this.name = name;
        this.color = color;
        this.hidden = hidden;
        this.canFly = canFly;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
        this.updateInventory(player);

        //this.instance.updateHiddenPlayers();
        player.setAllowFlying(this.canFly());
    }

    public String getName() {
        return this.name;
    }

    public void removePlayer(Player player) {
        this.players.remove(player);

        //this.instance.updateHiddenPlayers();
        player.setAllowFlying(false);
    }

    public boolean containsPlayer(Player player) {
        return this.players.contains(player);
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public boolean canFly() {
        return this.canFly;
    }

    public abstract void updateInventory(Player player);

    public abstract void updateScoreboard(Player player);
}
