package io.github.unstableprogrammers.hideandseek.helpers;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ItemHelper {

    public ItemStack itemstack;
    public ItemMeta itemmeta;

    public ItemHelper(Material material) {
        itemstack = new ItemStack(material, 1);
        itemmeta = itemstack.getItemMeta();
    }

    public ItemHelper setDisplayname(String name) {
        itemmeta.setDisplayName(name);
        return this;
    }

    public ItemHelper setAmount(Integer amount) {
        itemstack.setAmount(amount);
        return this;
    }

    public ItemHelper setColor(Color color) {
        LeatherArmorMeta meta = (LeatherArmorMeta) itemmeta;
        meta.setColor(color);
        return this;
    }

    public ItemHelper setUnbreakable(Boolean bool) {
        itemmeta.setUnbreakable(bool);
        return this;
    }

    public ItemStack get() {
        itemstack.setItemMeta(itemmeta);
        return itemstack;
    }
}
