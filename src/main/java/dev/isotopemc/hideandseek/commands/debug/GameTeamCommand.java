package dev.isotopemc.hideandseek.commands.debug;

import dev.isotopemc.hideandseek.HideAndSeek;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public record GameTeamCommand(HideAndSeek instance) implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (!(sender instanceof Player player)) {
            return false;
        }

        if (args.length != 0) {
            switch (args[0]) {
                case "LOBBY" -> instance.teams.setToLobby(player);
                case "SPECTATOR" -> instance.teams.setToSpectator(player);
                case "HIDER" -> instance.teams.setToHider(player);
                case "SEEKER" -> instance.teams.setToSeeker(player);
                default -> player.sendMessage(instance.PREFIX + "Kein gültiges Team");
            }
        }

        player.sendMessage(instance.PREFIX + "Dein aktuelles Team ist: " + instance.teams.getTeamOfPlayer(player).getName());
        return true;
    }
}
