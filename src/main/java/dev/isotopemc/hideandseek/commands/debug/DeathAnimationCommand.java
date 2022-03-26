package dev.isotopemc.hideandseek.commands.debug;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.game.visuals.deaths.LightningBoltDeath;
import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.arguments.ArgumentType;
import net.minestom.server.entity.Player;

public class DeathAnimationCommand extends Command {

    public DeathAnimationCommand() {
        super("deathanimation");

        setDefaultExecutor((sender, context)-> {
            sender.sendMessage("Kein Argument angegeben!");
        });

        var typeArgument = ArgumentType.String("type");

        addSyntax((sender, context) -> {
           final String type = context.get(typeArgument);

           assert sender instanceof Player;

            switch (type) {
                case "LIGHTNING_BOLT" -> new LightningBoltDeath((Player) sender);
                default -> sender.sendMessage(HideAndSeek.PREFIX + "Keine gültige Animation!");
            }
        }, typeArgument);
    }
}
