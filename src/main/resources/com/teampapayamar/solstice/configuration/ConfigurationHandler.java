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

            Settings.daysInWeek = configuration.get(CATEGORY_SEASONS, "daysInWeek", Defaults.DAYS_IN_WEEK, "The number of days in a Minecraft week").getInt();
            Settings.weeksInMonth = configuration.get(CATEGORY_SEASONS, "weeksInMonth", Defaults.WEEKS_IN_MONTH, "The number of weeks in a Minecraft month").getInt();
            Settings.monthsInSeason = configuration.get(CATEGORY_SEASONS, "monthsInSeason", Defaults.MONTHS_IN_SEASON, "The number of months in a single Minecraft season").getInt();
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
