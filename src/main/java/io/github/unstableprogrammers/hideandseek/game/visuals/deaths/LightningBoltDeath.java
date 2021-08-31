package io.github.unstableprogrammers.hideandseek.game.visuals.deaths;

import io.github.unstableprogrammers.hideandseek.game.visuals.DeathVisuals;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;

public class LightningBoltDeath extends DeathVisuals {
    public LightningBoltDeath(Location loc) {
        super(loc);
    }

    @Override
    public void execute() {
        try {
            World world = location.getWorld();

            world.spawnParticle(Particle.EXPLOSION_NORMAL, location, 10);
            world.spawnParticle(Particle.EXPLOSION_LARGE, location, 1);
            world.strikeLightning(location);
        } catch(NullPointerException e) {
            e.printStackTrace();
        }
    }
}
