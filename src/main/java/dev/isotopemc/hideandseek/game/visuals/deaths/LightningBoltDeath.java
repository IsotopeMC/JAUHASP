package dev.isotopemc.hideandseek.game.visuals.deaths;

import dev.isotopemc.hideandseek.game.visuals.DeathVisuals;
import net.minestom.server.entity.Entity;
import net.minestom.server.entity.EntityType;
import net.minestom.server.entity.Player;

public class LightningBoltDeath extends DeathVisuals {

    public LightningBoltDeath(Player player) {
        super(player);
    }

    @Override
    public void execute() {
        assert player.getInstance() != null;

        Entity lightning = new Entity(EntityType.LIGHTNING_BOLT);
        lightning.setInstance(player.getInstance(), player.getPosition());

        /*assert world != null;
        world.spawnParticle(Particle.EXPLOSION_NORMAL, location, 10);
        world.spawnParticle(Particle.EXPLOSION_LARGE, location, 1);
        world.spawnParticle(Particle.EXPLOSION_HUGE, location, 1);
        world.strikeLightning(location);*/
    }
}
