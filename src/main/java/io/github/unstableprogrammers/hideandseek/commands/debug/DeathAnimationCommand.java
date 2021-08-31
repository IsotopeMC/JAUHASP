package io.github.unstableprogrammers.hideandseek.commands.debug;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import io.github.unstableprogrammers.hideandseek.game.visuals.deaths.LightningBoltDeath;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DeathAnimationCommand implements CommandExecutor {

    protected HideAndSeek instance;

    public DeathAnimationCommand(HideAndSeek instance) {
        this.instance = instance;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player player)) { return false; }

        if(args.length != 0) {
            switch (args[0]) {
                case "LIGHTNING_BOLT" -> new LightningBoltDeath(player.getLocation());
                default -> player.sendMessage(instance.PREFIX + "Keine gültige Animation!");
            }
        }

        return false;
    }
}
