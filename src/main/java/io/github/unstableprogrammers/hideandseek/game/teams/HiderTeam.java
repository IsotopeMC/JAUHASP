package io.github.unstableprogrammers.hideandseek.game.teams;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import io.github.unstableprogrammers.hideandseek.game.GameTeam;
import io.github.unstableprogrammers.hideandseek.game.gui.inventories.HiderInventory;
import org.bukkit.Color;
import org.bukkit.entity.Player;

public class HiderTeam extends GameTeam {

    public HiderTeam(HideAndSeek instance) {
        super(instance, "Hider", Color.RED, false);
    }

    @Override
    public void updateInventory(Player player) {
        new HiderInventory().setInventory(player);
    }

    @Override
    public void updateScoreboard(Player player) {

    }
}
