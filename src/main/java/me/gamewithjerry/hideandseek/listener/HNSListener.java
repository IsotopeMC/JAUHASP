package me.gamewithjerry.hideandseek.listener;

import me.gamewithjerry.hideandseek.HideAndSeek;
import me.gamewithjerry.hideandseek.listener.items.QuitItemListener;
import me.gamewithjerry.hideandseek.listener.game.GameProtectionListener;
import me.gamewithjerry.hideandseek.listener.player.PlayerJoinQuitListener;
import me.gamewithjerry.hideandseek.listener.player.PlayerLoginListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class HNSListener {
    public static void registerListener(HideAndSeek instance) {
        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new PlayerLoginListener(instance), instance);
        pm.registerEvents(new PlayerJoinQuitListener(instance), instance);
        pm.registerEvents(new GameProtectionListener(instance), instance);

        //ITEMS AND MENUS
        pm.registerEvents(new QuitItemListener(instance), instance);
    }
}
