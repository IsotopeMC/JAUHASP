package me.gamewithjerry.hideandseek;

import jdk.jfr.internal.Utils;
import me.gamewithjerry.hideandseek.game.GameState;
import me.gamewithjerry.hideandseek.game.GameTeam;
import me.gamewithjerry.hideandseek.game.GameUtils;
import me.gamewithjerry.hideandseek.items.ListenerCollection;
import me.gamewithjerry.hideandseek.javautils.UtilsCollection;
import me.gamewithjerry.hideandseek.listener.GameProtectionListener;
import me.gamewithjerry.hideandseek.listener.PlayerJoinQuitListener;
import me.gamewithjerry.hideandseek.listener.PlayerLoginListener;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.World;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class HideAndSeek extends JavaPlugin {

    public static HideAndSeek instance;
    public static PluginManager pluginManager = Bukkit.getPluginManager();

    public final String PREFIX = "§7[§eHide§2N§6Seek§7]§r ";
    public final String NO_PERMISSIONS = PREFIX + "§4Dazu hast du keine Rechte!";

    public List<World> listOfWorlds;

    public final UtilsCollection utilsCollection = new UtilsCollection();
    public final GameState gamestate = new GameState(this);
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
        listOfWorlds = Bukkit.getWorlds();

        //create a copy of the main map
        if(Bukkit.getWorld("temp_lobby") != null) {
            utilsCollection.deleteWorld(Bukkit.getWorld("temp_lobby"));
        }

        utilsCollection.copyWorld(listOfWorlds.get(0), "temp_lobbymap");

        //register Events
        pluginManager.registerEvents(new PlayerLoginListener(this), this);
        pluginManager.registerEvents(new PlayerJoinQuitListener(this), this);
        pluginManager.registerEvents(new GameProtectionListener(this), this);

        //register all Events in ListernerCollection
        ListenerCollection listenercollection = new ListenerCollection(this);
        listenercollection.loadItemListeners();

        this.gamestate.setToLobbyState();
    }

    @Override
    public void onDisable() {
        //cleanup
        if(Bukkit.getWorld("temp_lobby") != null) {
            utilsCollection.deleteWorld(Bukkit.getWorld("temp_lobby"));
        }

        if(Bukkit.getWorld("temp_gamemap") != null) {
            utilsCollection.deleteWorld(Bukkit.getWorld("temp_gamemap"));
        }
    }
}
