package me.gamewithjerry.hideandseek;

import me.gamewithjerry.hideandseek.game.GameState;
import me.gamewithjerry.hideandseek.game.GameTeam;
import me.gamewithjerry.hideandseek.game.GameUtils;
import me.gamewithjerry.hideandseek.items.ListenerCollection;
import me.gamewithjerry.hideandseek.listener.PlayerJoinQuitListener;
import me.gamewithjerry.hideandseek.listener.PlayerLoginListener;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class HideAndSeek extends JavaPlugin {

    public static HideAndSeek instance;
    public static PluginManager pluginManager = Bukkit.getPluginManager();

    public final String PREFIX = "§7[§eHide§2N§6Seek§7]§r ";
    public final String NO_PERMISSIONS = PREFIX + "§4Dazu hast du keine Rechte!";

    public final GameState gamestate = new GameState(this);
    public final GameUtils gameutils = new GameUtils(this);

    public final GameTeam hiders = new GameTeam(this, "Hider", Color.RED, false);
    public final GameTeam seekers = new GameTeam(this, "Seeker", Color.YELLOW, false);
    public final GameTeam spectators = new GameTeam(this, "Spectator", Color.GRAY, true);

    public final GameTeam lobby = new GameTeam(this, "Spieler", Color.GRAY, false);

    public static HideAndSeek getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        pluginManager.registerEvents(new PlayerLoginListener(this), this);
        pluginManager.registerEvents(new PlayerJoinQuitListener(this), this);

        ListenerCollection listenercollection = new ListenerCollection(this);
        listenercollection.loadItemListeners();

        this.gamestate.setToLobbyState();
    }
}
