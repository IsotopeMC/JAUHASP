package io.github.unstableprogrammers.hideandseek.helpers;

import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.entity.LivingEntity;

public class WorldHelper {

    public static void setGameRules(World world) {
        world.setGameRule(GameRule.ANNOUNCE_ADVANCEMENTS, false);
        world.setGameRule(GameRule.DISABLE_RAIDS, true);
        world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
        world.setGameRule(GameRule.DO_FIRE_TICK, false);
        world.setGameRule(GameRule.DO_MOB_SPAWNING, false);
        world.setGameRule(GameRule.DO_WEATHER_CYCLE, false);
        world.setGameRule(GameRule.DO_TRADER_SPAWNING, false);
        world.setGameRule(GameRule.MOB_GRIEFING, false);
    }

    public static void killNonMapEntities(World world) {
        for (LivingEntity entity : world.getLivingEntities()) {
            entity.remove();
        }
    }
}
