package dev.isotopemc.hideandseek.game.gui.items.armor.seeker;

import dev.isotopemc.hideandseek.game.GameItem;
import org.bukkit.Color;
import org.bukkit.Material;

public class SeekerChestplateItem extends GameItem {
    public SeekerChestplateItem() {
        super("Sucher Brustplatte", Material.LEATHER_CHESTPLATE, 1, true);
        setColor(Color.fromRGB(128, 0, 0));
    }
}
