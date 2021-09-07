package io.github.unstableprogrammers.hideandseek;

import io.github.unstableprogrammers.hideandseek.commands.HNSCommands;
import io.github.unstableprogrammers.hideandseek.game.GameState;
import io.github.unstableprogrammers.hideandseek.game.events.GameStateUpdateEvent;
import io.github.unstableprogrammers.hideandseek.helpers.TeamHelper;
import io.github.unstableprogrammers.hideandseek.helpers.WorldHelper;
import io.github.unstableprogrammers.hideandseek.listener.HNSListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class HideAndSeek extends JavaPlugin {

    public static HideAndSeek instance;

    public final String PREFIX = "§7[§eHide§2N§6Seek§7]§r ";
    public final String NO_PERMISSIONS = PREFIX + "§4Dazu hast du keine Rechte!";

    public GameState gamestate = GameState.STARTING;
    public TeamHelper teams = new TeamHelper(this);

    public static HideAndSeek getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        //register Listener & Commands
        HNSListener.registerListener(this);
        HNSCommands.registerCommands(this);

        //perform various actions on all worlds
        Bukkit.getServer().getWorlds().forEach((world) -> {
            WorldHelper.setGameRules(world);
            WorldHelper.killNonMapEntities(world);
        });

        setGamestate(GameState.LOBBY);
    }

    @Override
    public void onDisable() {
    }

    public void setGamestate(GameState state) {
        this.gamestate = state;
        Bukkit.getPluginManager().callEvent(new GameStateUpdateEvent(state));
    }
}
