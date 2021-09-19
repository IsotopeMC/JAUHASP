package io.github.unstableprogrammers.hideandseek.listener;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import io.github.unstableprogrammers.hideandseek.listener.game.GameProtectionListener;
import io.github.unstableprogrammers.hideandseek.listener.game.GameStateUpdateListener;
import io.github.unstableprogrammers.hideandseek.listener.items.QuitItemListener;
import io.github.unstableprogrammers.hideandseek.listener.player.PlayerDeathListener;
import io.github.unstableprogrammers.hideandseek.listener.player.PlayerJoinQuitListener;
import io.github.unstableprogrammers.hideandseek.listener.player.PlayerLoginListener;
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
