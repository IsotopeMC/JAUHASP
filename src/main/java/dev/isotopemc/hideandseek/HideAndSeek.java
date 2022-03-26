package dev.isotopemc.hideandseek;

import dev.isotopemc.hideandseek.commands.debug.DeathAnimationCommand;
import dev.isotopemc.hideandseek.commands.debug.GameStateCommand;
import dev.isotopemc.hideandseek.commands.debug.GameTeamCommand;
import dev.isotopemc.hideandseek.game.GameState;
import dev.isotopemc.hideandseek.helpers.TeamHelper;
import net.minestom.server.MinecraftServer;

public class HideAndSeek {

    public static HideAndSeek instance;

    public static final String PREFIX = "§7[§eHide§2N§6Seek§7]§r ";

    public GameState gamestate = GameState.STARTING;
    public TeamHelper teams = new TeamHelper(this);

    public static HideAndSeek getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        HideAndSeek instance = new HideAndSeek();
        instance.start();
    }

    public void start() {
        instance = this;

        // Initialize the server
        MinecraftServer minecraftServer = MinecraftServer.init();

        //Initialize commands
        MinecraftServer.getCommandManager().register(new DeathAnimationCommand());
        MinecraftServer.getCommandManager().register(new GameStateCommand());
        MinecraftServer.getCommandManager().register(new GameTeamCommand());

        // Start the server
        minecraftServer.start("0.0.0.0", 25565);
    }

    /*public void updateHiddenPlayers() {
        Bukkit.getOnlinePlayers().forEach((player) -> Bukkit.getOnlinePlayers().forEach((otherPlayer) -> {
            if (player != otherPlayer) {
                GameTeam otherTeam = this.teams.getTeamOfPlayer(otherPlayer);

                if (otherTeam.isHidden() && !otherTeam.containsPlayer(player)) {
                    player.hidePlayer(this, otherPlayer);
                } else {
                    player.showPlayer(this, otherPlayer);
                }
            }
        }));
    }*/
}
