package io.github.unstableprogrammers.hideandseek.game.gui.items.armor.seeker;

import io.github.unstableprogrammers.hideandseek.game.GameItem;
import org.bukkit.Color;
import org.bukkit.Material;

public class SeekerHelmetItem extends GameItem {
    public SeekerHelmetItem() {
        super("Verstecker Helm", Material.LEATHER_HELMET, 1, true);
        setColor(Color.fromRGB(128,0,0));
    }
}
