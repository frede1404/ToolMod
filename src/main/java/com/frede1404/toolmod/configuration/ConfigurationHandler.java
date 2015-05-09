package com.frede1404.toolmod.configuration;

        import net.minecraftforge.common.config.Configuration;
        import net.minecraftforge.common.config.Property;

        import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile) {

        //Create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);

        boolean configValue = false;

        try {
            //load the donfiguration file
            configuration.load();

            //Read the properties from configuration file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        } catch (Exception e) {
            //log the exception
        } finally {
            //save the configuration file
            configuration.save();
        }
        System.out.println("Configuration Test: " + configValue);
    }
}
