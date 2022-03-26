package dev.isotopemc.hideandseek.commands.debug;

import dev.isotopemc.hideandseek.HideAndSeek;
import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.arguments.ArgumentType;
import net.minestom.server.entity.Player;

public class GameTeamCommand extends Command {

    public GameTeamCommand() {
        super("gameteam");

        setDefaultExecutor((sender, context)-> {
            sender.sendMessage("Kein Argument angegeben!");
        });

        var typeArgument = ArgumentType.String("type");

        addSyntax((sender, context) -> {
            final String type = context.get(typeArgument);

            assert sender instanceof Player;
            Player player = (Player) sender;

            switch (type) {
                case "LOBBY" -> HideAndSeek.getInstance().teams.setToLobby(player);
                case "SPECTATOR" -> HideAndSeek.getInstance().teams.setToSpectator(player);
                case "HIDER" -> HideAndSeek.getInstance().teams.setToHider(player);
                case "SEEKER" -> HideAndSeek.getInstance().teams.setToSeeker(player);
                default -> player.sendMessage(HideAndSeek.PREFIX + "Kein gültiges Team");
            }

            sender.sendMessage(HideAndSeek.PREFIX + "Dein aktueller Team ist: " + HideAndSeek.getInstance().teams.getTeamOfPlayer(player).getName());
        }, typeArgument);
    }
}
