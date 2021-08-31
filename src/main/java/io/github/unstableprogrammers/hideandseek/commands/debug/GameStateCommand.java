package io.github.unstableprogrammers.hideandseek.commands.debug;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import io.github.unstableprogrammers.hideandseek.game.GameState;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameStateCommand implements CommandExecutor {

    protected final HideAndSeek instance;

    public GameStateCommand(HideAndSeek instance) {
        this.instance = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player player)) { return false; }

        if(args.length != 0) {
            switch (args[0]) {
                case "LOBBY" -> instance.gamestate = GameState.LOBBY;
                case "IN_GAME" -> instance.gamestate = GameState.IN_GAME;
                case "ENDING" -> instance.gamestate = GameState.ENDING;
                default -> player.sendMessage(instance.PREFIX + "Kein gültiger GameState");
            }
        }

        player.sendMessage(instance.PREFIX + "Dein aktueller GameState ist: "+instance.gamestate.name());
        return true;
    }
}
