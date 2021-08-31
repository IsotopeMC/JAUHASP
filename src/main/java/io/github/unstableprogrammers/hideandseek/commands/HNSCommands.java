package io.github.unstableprogrammers.hideandseek.commands;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import io.github.unstableprogrammers.hideandseek.commands.debug.GameStateCommand;
import io.github.unstableprogrammers.hideandseek.commands.debug.GameTeamCommand;

public class HNSCommands {
    @SuppressWarnings("ConstantConditions")
    public static void registerCommands(HideAndSeek instance) {
        instance.getCommand("gamestate").setExecutor(new GameStateCommand(instance));
        instance.getCommand("gameteam").setExecutor(new GameTeamCommand(instance));
    }
}
