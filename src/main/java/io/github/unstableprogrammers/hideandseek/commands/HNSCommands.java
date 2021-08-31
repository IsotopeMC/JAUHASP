package io.github.unstableprogrammers.hideandseek.commands;

import io.github.unstableprogrammers.hideandseek.commands.debug.GameStateCommand;
import io.github.unstableprogrammers.hideandseek.HideAndSeek;

public class HNSCommands {
    public static void registerCommands(HideAndSeek instance) {
        instance.getCommand("gamestate").setExecutor(new GameStateCommand(instance));
    }
}
