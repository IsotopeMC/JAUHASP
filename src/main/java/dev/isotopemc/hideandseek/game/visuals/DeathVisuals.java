package dev.isotopemc.hideandseek.game.visuals;

import net.minestom.server.entity.Player;

public abstract class DeathVisuals {

    protected Player player;

    public DeathVisuals(Player player) {
        this.player = player;
        execute();
    }

    public abstract void execute();
}
