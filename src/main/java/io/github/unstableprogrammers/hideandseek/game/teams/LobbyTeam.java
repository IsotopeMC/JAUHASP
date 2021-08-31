package io.github.unstableprogrammers.hideandseek.game.teams;

import io.github.unstableprogrammers.hideandseek.game.GameTeam;
import io.github.unstableprogrammers.hideandseek.game.gui.inventories.LobbyInventory;
import org.bukkit.Color;
import org.bukkit.entity.Player;

public class LobbyTeam extends GameTeam {

    public LobbyTeam() {
        super("Lobby", Color.GRAY, false);
    }

    @Override
    public void updateInventory(Player player) {
        new LobbyInventory().setInventory(player);
    }

    @Override
    public void updateScoreboard(Player player) {

    }
}
