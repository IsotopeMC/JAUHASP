package me.gamewithjerry.hideandseek.commands.debug;

import me.gamewithjerry.hideandseek.HideAndSeek;
import me.gamewithjerry.hideandseek.game.GameState;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameStateCommand implements CommandExecutor {

    public HideAndSeek instance;

    public GameStateCommand(HideAndSeek instance) {
        this.instance = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) { return false; }
        Player player = (Player) sender;

        if(args.length != 0) {
            switch (args[0]) {
                case "LOBBY" -> instance.gamestate = GameState.LOBBY;
                case "IN_GAME" -> instance.gamestate = GameState.IN_GAME;
                case "ENDING" -> instance.gamestate = GameState.ENDING;
                default -> player.sendMessage(instance.PREFIX + "Kein gültiger GameState");
            }
        }

        player.sendMessage(instance.PREFIX + "Der aktuelle GameState ist: "+instance.gamestate.name());
        return true;
    }
}
