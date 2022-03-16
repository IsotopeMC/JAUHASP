package dev.isotopemc.hideandseek.listener;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.listener.game.GameProtectionListener;
import dev.isotopemc.hideandseek.listener.game.GameStateUpdateListener;
import dev.isotopemc.hideandseek.listener.items.QuitItemListener;
import dev.isotopemc.hideandseek.listener.player.PlayerDeathListener;
import dev.isotopemc.hideandseek.listener.player.PlayerJoinQuitListener;
import dev.isotopemc.hideandseek.listener.player.PlayerLoginListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class HNSListener {
    public static void registerListener(HideAndSeek instance) {
        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new PlayerLoginListener(instance), instance);
        pm.registerEvents(new PlayerJoinQuitListener(instance), instance);
        pm.registerEvents(new GameProtectionListener(instance), instance);
        pm.registerEvents(new GameStateUpdateListener(instance), instance);
        pm.registerEvents(new PlayerDeathListener(instance), instance);

        //ITEMS AND MENUS
        pm.registerEvents(new QuitItemListener(instance), instance);
    }
}
