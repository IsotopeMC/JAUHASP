package dev.isotopemc.hideandseek.commands.debug;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.game.GameState;
import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.arguments.ArgumentType;
import net.minestom.server.entity.Player;

public class GameStateCommand extends Command {

    public GameStateCommand() {
        super("gamestate");

        setDefaultExecutor((sender, context)-> {
            sender.sendMessage("Kein Argument angegeben!");
        });

        var typeArgument = ArgumentType.String("type");

        addSyntax((sender, context) -> {
            final String type = context.get(typeArgument);

            assert sender instanceof Player;

            switch (type) {
                case "LOBBY" -> HideAndSeek.getInstance().gamestate = GameState.LOBBY;
                case "IN_GAME" -> HideAndSeek.getInstance().gamestate = GameState.IN_GAME;
                case "ENDING" -> HideAndSeek.getInstance().gamestate = GameState.ENDING;
                default -> sender.sendMessage(HideAndSeek.PREFIX + "Kein gültiger GameState");
            }

            sender.sendMessage(HideAndSeek.PREFIX + "Dein aktueller GameState ist: " + HideAndSeek.getInstance().gamestate.name());
        }, typeArgument);
    }
}
