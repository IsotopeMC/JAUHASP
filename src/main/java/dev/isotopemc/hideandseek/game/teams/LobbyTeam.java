package dev.isotopemc.hideandseek.game.teams;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.game.GameTeam;
import net.minestom.server.entity.Player;
import org.bukkit.Color;
import org.bukkit.entity.Player;

public class LobbyTeam extends GameTeam {

    public LobbyTeam(HideAndSeek instance) {
        super(instance, "Lobby", Color.GRAY, false, false);
    }

    @Override
    public void updateInventory(Player player) {
        new LobbyInventory().setInventory(player);
    }

    @Override
    public void updateScoreboard(Player player) {

    }
}
