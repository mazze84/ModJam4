package com.teampapayamar.solstice.util;

public class TimeHelper
{
    /**
     * Scratch notes because I (Pahimar) am lazy - 24,000 ticks in a MC day == 20 minutes game time - 168,000 ticks in a
     * MC week == 140 minutes game time == 2 hours 20 minutes - 672,000 ticks in a MC month == 9 hours 20 minutes -
     * 2,016,000 ticks in a MC season - 8,064,000 ticks in a MC year
     */

    public static String convertTicksToTimeString(long worldTime)
    {
        long tempTime = worldTime + 2016000L;
        long year = tempTime / 8064000L;

        tempTime = tempTime % 8064000L;
        long season = tempTime / 2016000L;

        tempTime = tempTime % 2016000L;
        long month = tempTime / 672000L;

        tempTime = tempTime % 672000L;
        long week = tempTime / 168000L;

        tempTime = tempTime % 168000L;
        long day = tempTime / 24000;

        tempTime = tempTime % 24000;
        long timeOfDay = tempTime;

        return String.format("Year: %s, Season: %s, Month: %s, Week: %s, Day: %s, Time of Day: %s", year, season, month, week, day, timeOfDay);
    }
}
