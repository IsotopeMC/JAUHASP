package io.github.unstableprogrammers.hideandseek.game.teams;

import io.github.unstableprogrammers.hideandseek.game.GameTeam;
import org.bukkit.Color;
import org.bukkit.entity.Player;

public class SeekerTeam extends GameTeam {

    public SeekerTeam() {
        super("Seeker", Color.YELLOW, false);
    }

    @Override
    public void updateInventory(Player player) {

    }

    @Override
    public void updateScoreboard(Player player) {

    }
}
