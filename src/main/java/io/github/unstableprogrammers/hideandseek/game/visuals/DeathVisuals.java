package io.github.unstableprogrammers.hideandseek.game.visuals;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import org.bukkit.Location;

public abstract class DeathVisuals {

    protected HideAndSeek instance;
    protected Location location;

    public DeathVisuals(HideAndSeek instance, Location loc) {
        this.location = loc;
        this.instance = instance;
        execute();
    }

    public abstract void execute();
}
