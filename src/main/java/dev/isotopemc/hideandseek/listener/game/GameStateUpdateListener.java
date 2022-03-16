package dev.isotopemc.hideandseek.listener.game;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.game.GameState;
import dev.isotopemc.hideandseek.game.events.GameStateUpdateEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public record GameStateUpdateListener(HideAndSeek instance) implements Listener {

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
