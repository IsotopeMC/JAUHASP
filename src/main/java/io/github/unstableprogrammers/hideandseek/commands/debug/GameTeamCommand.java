package io.github.unstableprogrammers.hideandseek.commands.debug;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameTeamCommand implements CommandExecutor {

    protected HideAndSeek instance;

    public GameTeamCommand(HideAndSeek instance) {
        this.instance = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player player)) { return false; }

        if(args.length != 0) {
            switch (args[0]) {
                case "LOBBY" -> instance.teams.setToLobby(player);
                case "SPECTATOR" -> instance.teams.setToSpectator(player);
                case "HIDER" -> instance.teams.setToHider(player);
                case "SEEKER" -> instance.teams.setToSeeker(player);
                default -> player.sendMessage(instance.PREFIX + "Kein gültiges Team");
            }
        }

        player.sendMessage(instance.PREFIX + "Dein aktuelles Team ist: "+instance.teams.getTeamOfPlayer(player).getName());

        return true;
    }
}
