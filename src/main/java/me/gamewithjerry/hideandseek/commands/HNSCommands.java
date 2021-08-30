package me.gamewithjerry.hideandseek.commands;

import me.gamewithjerry.hideandseek.HideAndSeek;
import me.gamewithjerry.hideandseek.commands.debug.GameStateCommand;

public class HNSCommands {
    public static void registerCommands(HideAndSeek instance) {
        instance.getCommand("gamestate").setExecutor(new GameStateCommand(instance));
    }
}
