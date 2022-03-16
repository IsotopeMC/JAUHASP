package dev.isotopemc.hideandseek.commands.debug;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.game.GameState;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public record GameStateCommand(HideAndSeek instance) implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (!(sender instanceof Player player)) {
            return false;
        }

        if (args.length != 0) {
            switch (args[0]) {
                case "LOBBY" -> instance.gamestate = GameState.LOBBY;
                case "IN_GAME" -> instance.gamestate = GameState.IN_GAME;
                case "ENDING" -> instance.gamestate = GameState.ENDING;
                default -> player.sendMessage(instance.PREFIX + "Kein gültiger GameState");
            }
        }

        player.sendMessage(instance.PREFIX + "Dein aktueller GameState ist: " + instance.gamestate.name());
        return true;
    }
}
