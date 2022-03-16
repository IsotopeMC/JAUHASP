package dev.isotopemc.hideandseek.commands;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.commands.debug.DeathAnimationCommand;
import dev.isotopemc.hideandseek.commands.debug.GameStateCommand;
import dev.isotopemc.hideandseek.commands.debug.GameTeamCommand;

public class HNSCommands {
    @SuppressWarnings("ConstantConditions")
    public static void registerCommands(HideAndSeek instance) {
        instance.getCommand("gamestate").setExecutor(new GameStateCommand(instance));
        instance.getCommand("gameteam").setExecutor(new GameTeamCommand(instance));
        instance.getCommand("deathanimation").setExecutor(new DeathAnimationCommand(instance));
    }
}
