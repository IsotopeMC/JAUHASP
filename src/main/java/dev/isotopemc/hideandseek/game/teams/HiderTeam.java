package dev.isotopemc.hideandseek.game.teams;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.game.GameTeam;
import net.minestom.server.entity.Player;

public class HiderTeam extends GameTeam {

    public HiderTeam(HideAndSeek instance) {
        super(instance, "Hider", Color.RED, false, false);
    }

    @Override
    public void updateInventory(Player player) {
        new HiderInventory().setInventory(player);
    }

    @Override
    public void updateScoreboard(Player player) {

    }
}
