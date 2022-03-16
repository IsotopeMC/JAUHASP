package dev.isotopemc.hideandseek.game.visuals.deaths;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.game.visuals.DeathVisuals;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;

public class LightningBoltDeath extends DeathVisuals {

    public LightningBoltDeath(HideAndSeek instance, Location loc) {
        super(instance, loc);
    }

    @Override
    public void execute() {
        World world = location.getWorld();

        assert world != null;
        world.spawnParticle(Particle.EXPLOSION_NORMAL, location, 10);
        world.spawnParticle(Particle.EXPLOSION_LARGE, location, 1);
        world.spawnParticle(Particle.EXPLOSION_HUGE, location, 1);
        world.strikeLightning(location);
    }
}
