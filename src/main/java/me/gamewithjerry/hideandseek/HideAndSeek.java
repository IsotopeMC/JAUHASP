package me.gamewithjerry.hideandseek;

import me.gamewithjerry.hideandseek.commands.HNSCommands;
import me.gamewithjerry.hideandseek.game.GameState;
import me.gamewithjerry.hideandseek.game.GameTeam;
import me.gamewithjerry.hideandseek.game.GameUtils;
import me.gamewithjerry.hideandseek.listener.HNSListener;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.GameRule;
import org.bukkit.plugin.java.JavaPlugin;

public final class HideAndSeek extends JavaPlugin {

    public static HideAndSeek instance;

    public final String PREFIX = "§7[§eHide§2N§6Seek§7]§r ";
    public final String NO_PERMISSIONS = PREFIX + "§4Dazu hast du keine Rechte!";

    public GameState gamestate = GameState.STARTING;
    public final GameUtils gameutils = new GameUtils(this);

    public final GameTeam hiders = new GameTeam("Hider", Color.RED, false);
    public final GameTeam seekers = new GameTeam("Seeker", Color.YELLOW, false);
    public final GameTeam spectators = new GameTeam("Spectator", Color.GRAY, true);

    public final GameTeam lobby = new GameTeam("Spieler", Color.GRAY, false);

    public static HideAndSeek getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        //register Listener
        HNSListener.registerListener(this);

        //register Commands
        HNSCommands.registerCommands(this);

        //disable natural mob spawning
        Bukkit.getServer().getWorlds().forEach((world)->{
            world.setGameRule(GameRule.ANNOUNCE_ADVANCEMENTS, false);
            world.setGameRule(GameRule.DISABLE_RAIDS, true);
            world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
            world.setGameRule(GameRule.DO_FIRE_TICK, false);
            world.setGameRule(GameRule.DO_MOB_SPAWNING, false);
            world.setGameRule(GameRule.DO_WEATHER_CYCLE, false);
            world.setGameRule(GameRule.DO_TRADER_SPAWNING, false);
            world.setGameRule(GameRule.MOB_GRIEFING, false);
        });

        this.gamestate = GameState.LOBBY;
    }

    @Override
    public void onDisable() {
    }
}
