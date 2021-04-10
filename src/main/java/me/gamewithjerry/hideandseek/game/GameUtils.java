package me.gamewithjerry.hideandseek.game;

import me.gamewithjerry.hideandseek.HideAndSeek;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class GameUtils {

    protected HideAndSeek instance;

    public Map<Team, Player> players = new HashMap<>();

    public GameUtils(HideAndSeek instance) {
        this.instance = instance;
    }

    public void setToPlayer(Player player) {

    }

    public void setToSpectator(Player player) {

    }

    public void setToHider(Player player) {

    }

    public void setToSeeker(Player player) {

    }

    public void teleportPlayer(Player player) {

    }
}
