package com.frede1404.toolmod;

import com.frede1404.toolmod.configuration.ConfigurationHandler;
import com.frede1404.toolmod.proxy.IProxy;
import com.frede1404.toolmod.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION)
public class ToolMod {

    @Mod.Instance(Reference.MOD_ID)
    public static ToolMod instance;

    @SidedProxy (clientSide = "com.frede1404.toolmod.proxy.ClientProxy", serverSide = "com.frede1404.toolmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event) {

    }
}
