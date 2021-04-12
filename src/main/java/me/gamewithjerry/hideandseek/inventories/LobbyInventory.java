package me.gamewithjerry.hideandseek.inventories;

import me.gamewithjerry.hideandseek.HideAndSeek;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class LobbyInventory {

    protected HideAndSeek instance;

    private final Map<Integer, ItemStack> items = new HashMap<>();

    public LobbyInventory(HideAndSeek instance) {
        this.instance = instance;


    }


}
