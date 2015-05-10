package com.frede1404.toolmod.init;

import com.frede1404.toolmod.item.ItemHardenedIron;
import com.frede1404.toolmod.item.ItemTM;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemTM hardenedIron = new ItemHardenedIron();

    public static void init() {
        GameRegistry.registerItem(hardenedIron, "hardenedIron");
    }
}
