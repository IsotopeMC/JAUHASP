package dev.isotopemc.hideandseek.game.teams;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.game.GameTeam;
import dev.isotopemc.hideandseek.game.gui.inventories.SeekerInventory;
import net.minestom.server.entity.Player;

public class SeekerTeam extends GameTeam {

    public SeekerTeam(HideAndSeek instance) {
        super(instance, "Seeker", Color.YELLOW, false, false);
    }

    @Override
    public void updateInventory(Player player) {
        new SeekerInventory().setInventory(player);
    }

    @Override
    public void updateScoreboard(Player player) {

    }
}
