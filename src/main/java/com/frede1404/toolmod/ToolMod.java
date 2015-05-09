package com.frede1404.toolmod;

import com.frede1404.toolmod.handler.ConfigurationHandler;
import com.frede1404.toolmod.proxy.IProxy;
import com.frede1404.toolmod.reference.Reference;
import com.frede1404.toolmod.utility.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ToolMod {

    @Mod.Instance(Reference.MOD_ID)
    public static ToolMod instance;

    @SidedProxy (clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event) {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event) {
        LogHelper.info("Post Initialization Complete!");
    }
}
