package dev.isotopemc.hideandseek.game.teams;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.game.GameTeam;
import dev.isotopemc.hideandseek.game.gui.inventories.HiderInventory;
import org.bukkit.Color;
import org.bukkit.entity.Player;

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
