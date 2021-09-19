package io.github.unstableprogrammers.hideandseek.game.gui.items.armor.seeker;

import io.github.unstableprogrammers.hideandseek.game.GameItem;
import org.bukkit.Color;
import org.bukkit.Material;

public class SeekerLeggingsItem extends GameItem {
    public SeekerLeggingsItem() {
        super("Sucher Hose", Material.LEATHER_LEGGINGS, 1, true);
        setColor(Color.fromRGB(128,0,0));
    }
}
