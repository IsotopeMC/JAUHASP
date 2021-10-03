package io.github.unstableprogrammers.hideandseek.commands.debug;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import io.github.unstableprogrammers.hideandseek.game.visuals.deaths.LightningBoltDeath;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public record DeathAnimationCommand(HideAndSeek instance) implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
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
