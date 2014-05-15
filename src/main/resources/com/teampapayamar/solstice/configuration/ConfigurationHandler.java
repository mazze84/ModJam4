package com.teampapayamar.solstice.configuration;

import com.teampapayamar.solstice.util.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    private static Configuration configuration;

    public static void init(File configFile)
    {
        configuration = new Configuration(configFile);

        try
        {
            configuration.load();
        }
        catch (Exception e)
        {
            LogHelper.error(e.getCause());
        }
        finally
        {
            configuration.save();
        }
    }
}
