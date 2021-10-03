package io.github.unstableprogrammers.hideandseek.game.teams;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import io.github.unstableprogrammers.hideandseek.game.GameTeam;
import io.github.unstableprogrammers.hideandseek.game.gui.inventories.SeekerInventory;
import org.bukkit.Color;
import org.bukkit.entity.Player;

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
