package dev.isotopemc.hideandseek.game;

import dev.isotopemc.hideandseek.helpers.ItemHelper;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class GameItem {

    protected final String name;
    protected final Material material;
    protected final Integer amount;
    protected final Boolean unbreakable;

    protected Color color;

    public GameItem(String name, Material material, Integer amount, Boolean unbreakable) {
        this.name = name;
        this.material = material;
        this.amount = amount;
        this.unbreakable = unbreakable;
    }

    public ItemStack get() {
        ItemHelper helper = new ItemHelper(this.getMaterial());
        helper.setAmount(this.getAmount()).setDisplayname(this.getName()).setUnbreakable(this.isUnbreakable());

        if (this.getColor() != null) {
            helper.setColor(this.getColor());
        }

        return helper.get();
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

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Boolean isUnbreakable() {
        return this.unbreakable;
    }
}
