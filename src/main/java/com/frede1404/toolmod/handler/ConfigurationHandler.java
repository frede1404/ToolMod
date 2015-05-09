package com.frede1404.toolmod.handler;

import com.frede1404.toolmod.reference.Reference;
import com.google.common.eventbus.Subscribe;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static boolean testValue = false;


    public static void init(File configFile) {

        //Create the configuration object from the given configuration file
        configuration = new Configuration(configFile);
        if (configuration == null) {
            configuration = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            //Resync config
            loadConfiguration();
        }
    }

    public void loadConfiguration() {
        testValue = configuration.getBoolean("configValue", configuration.CATEGORY_GENERAL, true, "This is an example configuration value");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
