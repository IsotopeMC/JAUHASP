package io.github.unstableprogrammers.hideandseek.game.events;

import io.github.unstableprogrammers.hideandseek.game.GameState;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@SuppressWarnings("FieldMayBeFinal")
public class GameStateUpdateEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private GameState gamestate;

    public GameStateUpdateEvent(GameState gamestate) {
        this.gamestate = gamestate;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public GameState getNewState() {
        return gamestate;
    }
}
