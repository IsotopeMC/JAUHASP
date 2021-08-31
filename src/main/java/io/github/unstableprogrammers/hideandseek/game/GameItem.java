package io.github.unstableprogrammers.hideandseek.game;

import io.github.unstableprogrammers.hideandseek.helpers.ItemHelper;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class GameItem {

    protected final String name;
    protected final Material material;
    protected final Integer amount;

    public GameItem(String name, Material material, Integer amount) {
        this.name = name;
        this.material = material;
        this.amount = amount;
    }
    public ItemStack get() {
        return new ItemHelper(this.getMaterial()).setAmount(this.getAmount()).setDisplayname(this.getName()).get();
    }

    public String getName() {
        return this.name;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public Material getMaterial() {
        return this.material;
    }
}
