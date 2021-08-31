package io.github.unstableprogrammers.hideandseek.game.teams;

import io.github.unstableprogrammers.hideandseek.game.GameTeam;
import org.bukkit.Color;
import org.bukkit.entity.Player;

public class SpectatorTeam extends GameTeam {

    public SpectatorTeam() {
        super("Spectator", Color.GRAY, true);
    }

    @Override
    public void updateInventory(Player player) {

    }

    @Override
    public void updateScoreboard(Player player) {

    }
}
