package io.github.unstableprogrammers.hideandseek.listener.game;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import io.github.unstableprogrammers.hideandseek.game.GameState;
import io.github.unstableprogrammers.hideandseek.game.events.GameStateUpdateEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class GameStateUpdateListener implements Listener {

    protected final HideAndSeek instance;

    public GameStateUpdateListener(HideAndSeek instance) {
        this.instance = instance;
    }

    @EventHandler
    public void onStateChange(GameStateUpdateEvent event) {
        GameState newState = event.getNewState();

        switch (newState) {
            case IN_GAME -> this.startGame();
            case ENDING -> this.endGame();
        }
    }

    public void startGame() {

    }

    public void endGame() {

    }
}
