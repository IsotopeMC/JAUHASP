package dev.isotopemc.hideandseek.game.teams;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.game.GameTeam;
import org.bukkit.Color;
import org.bukkit.entity.Player;

public class SpectatorTeam extends GameTeam {

    public SpectatorTeam(HideAndSeek instance) {
        super(instance, "Spectator", Color.GRAY, true, true);
    }

    @Override
    public void updateInventory(Player player) {
        player.getInventory().clear();
    }

    @Override
    public void updateScoreboard(Player player) {

    }
}
