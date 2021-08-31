package io.github.unstableprogrammers.hideandseek.game.visuals;

import org.bukkit.Location;

public abstract class DeathVisuals {

    protected Location location;

    public DeathVisuals(Location loc) {
        this.location = loc;
        execute();
    }

    public abstract void execute();
}
