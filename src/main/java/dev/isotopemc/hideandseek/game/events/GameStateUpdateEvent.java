package dev.isotopemc.hideandseek.game.events;

import dev.isotopemc.hideandseek.game.GameState;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public final class GameStateUpdateEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private final GameState gamestate;

    public GameStateUpdateEvent(GameState gamestate) {
        this.gamestate = gamestate;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public GameState getNewState() {
        return gamestate;
    }
}
