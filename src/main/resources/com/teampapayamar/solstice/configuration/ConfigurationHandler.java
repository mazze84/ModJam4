package com.teampapayamar.solstice.configuration;

import com.teampapayamar.solstice.util.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    private static final String CATEGORY_SEASONS = "seasons";
    private static Configuration configuration;

    public static void init(File configFile)
    {
        configuration = new Configuration(configFile);

        try
        {
            configuration.load();

            Settings.useNorthernHemisphereForSeasons = configuration.get(CATEGORY_SEASONS, "useNorthernHemisphereForSeasons", Defaults.useNorthernHemisphereForSeasons).getBoolean(Defaults.useNorthernHemisphereForSeasons);
            Settings.weekStartsOnSunday = configuration.get(CATEGORY_SEASONS, "weekStartsOnSunday", Defaults.weekStartsOnSunday).getBoolean(Defaults.weekStartsOnSunday);
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
