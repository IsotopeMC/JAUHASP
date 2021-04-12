package me.gamewithjerry.hideandseek.items;

import me.gamewithjerry.hideandseek.HideAndSeek;
import me.gamewithjerry.hideandseek.items.menu.QuitItemListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class ListenerCollection {

    protected HideAndSeek instance;

    public ListenerCollection(HideAndSeek instance) {
        this.instance = instance;
    }

    public void loadItemListeners() {
        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new QuitItemListener(instance), HideAndSeek.getInstance());
    }
}
