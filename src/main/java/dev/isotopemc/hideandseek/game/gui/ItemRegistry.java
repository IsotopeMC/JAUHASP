package dev.isotopemc.hideandseek.game.gui;

import net.kyori.adventure.text.Component;
import net.minestom.server.item.ItemStack;
import net.minestom.server.item.Material;

public class ItemRegistry {
    public static ItemStack QUIT_ITEM = ItemStack.builder(Material.MAGMA_CREAM).displayName(Component.text("Verlassen")).build();

    public static ItemStack HIDER_AXE = ItemStack.builder(Material.IRON_AXE).displayName(Component.text("Verstecker-Axt")).meta(itemMetaBuilder -> itemMetaBuilder.unbreakable(true)).build();
    public static ItemStack HIDER_HELMET = ItemStack.builder(Material.NETHERITE_HELMET).displayName(Component.text("Verstecker-Helm")).meta(itemMetaBuilder -> itemMetaBuilder.unbreakable(true)).build();
    public static ItemStack HIDER_CHESTPLATE = ItemStack.builder(Material.NETHERITE_CHESTPLATE).displayName(Component.text("Verstecker-Brustplatte")).meta(itemMetaBuilder -> itemMetaBuilder.unbreakable(true)).build();
    public static ItemStack HIDER_LEGGINGS = ItemStack.builder(Material.NETHERITE_LEGGINGS).displayName(Component.text("Verstecker-Hose")).meta(itemMetaBuilder -> itemMetaBuilder.unbreakable(true)).build();
    public static ItemStack HIDER_BOOTS = ItemStack.builder(Material.NETHERITE_BOOTS).displayName(Component.text("Verstecker-Schuhe")).meta(itemMetaBuilder -> itemMetaBuilder.unbreakable(true)).build();

    public static ItemStack SEEKER_HELMET = ItemStack.builder(Material.LEATHER_HELMET).displayName(Component.text("Sucher-Helm")).meta(itemMetaBuilder -> {
        itemMetaBuilder.unbreakable(true);
        //ADD COLOR 128, 0, 0
        return itemMetaBuilder;
    }).build();
    public static ItemStack SEEKER_CHESTPLATE = ItemStack.builder(Material.LEATHER_CHESTPLATE).displayName(Component.text("Sucher-Brustplatte")).meta(itemMetaBuilder -> {
        itemMetaBuilder.unbreakable(true);
        //ADD COLOR 128, 0, 0
        return itemMetaBuilder;
    }).build();
    public static ItemStack SEEKER_LEGGINGS = ItemStack.builder(Material.LEATHER_LEGGINGS).displayName(Component.text("Sucher-Hose")).meta(itemMetaBuilder -> {
        itemMetaBuilder.unbreakable(true);
        //ADD COLOR 128, 0, 0
        return itemMetaBuilder;
    }).build();
    public static ItemStack SEEKER_BOOTS = ItemStack.builder(Material.LEATHER_BOOTS).displayName(Component.text("Sucher-Schuhe")).meta(itemMetaBuilder -> {
        itemMetaBuilder.unbreakable(true);
        //ADD COLOR 128, 0, 0
        return itemMetaBuilder;
    }).build();
}
