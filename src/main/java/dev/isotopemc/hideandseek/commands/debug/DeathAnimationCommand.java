package dev.isotopemc.hideandseek.commands.debug;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.game.visuals.deaths.LightningBoltDeath;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public record DeathAnimationCommand(HideAndSeek instance) implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (!(sender instanceof Player player)) {
            return false;
        }

        if (args.length != 0) {
            switch (args[0]) {
                case "LIGHTNING_BOLT" -> new LightningBoltDeath(instance, player.getLocation());
                default -> player.sendMessage(instance.PREFIX + "Keine gültige Animation!");
            }
        }

        return false;
    }
}
