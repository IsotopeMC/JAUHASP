package dev.isotopemc.hideandseek.game.gui.items.armor.seeker;

import dev.isotopemc.hideandseek.game.GameItem;
import org.bukkit.Color;
import org.bukkit.Material;

public class SeekerBootsItem extends GameItem {
    public SeekerBootsItem() {
        super("Sucher Stiefel", Material.LEATHER_BOOTS, 1, true);
        setColor(Color.fromRGB(128, 0, 0));
    }
}
