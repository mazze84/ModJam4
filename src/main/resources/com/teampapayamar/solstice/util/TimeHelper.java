package com.teampapayamar.solstice.util;

public class TimeHelper
{
    /**
     * Scratch notes because I (Pahimar) am lazy - 24,000 ticks in a MC day == 20 minutes game time - 168,000 ticks in a
     * MC week == 140 minutes game time == 2 hours 20 minutes - 672,000 ticks in a MC month == 9 hours 20 minutes -
     * 2,016,000 ticks in a MC season - 8,064,000 ticks in a MC year
     */

    public static final long TICKS_IN_DAY = 24000L;
    public static final long TICKS_IN_WEEK = TICKS_IN_DAY * 7;
    public static final long TICKS_IN_MONTH = TICKS_IN_WEEK * 4;
    public static final long TICKS_IN_SEASON = TICKS_IN_MONTH * 3;
    public static final long TICKS_IN_YEAR = TICKS_IN_SEASON * 4;


    public static String convertTicksToTimeString(long worldTime)
    {
        // Offset world time by one season, to accommodate that we start players on the first day of Spring
        long adjustedWorldTime = worldTime + TICKS_IN_SEASON;

        long year = adjustedWorldTime / TICKS_IN_YEAR;
        long season = (adjustedWorldTime % TICKS_IN_YEAR) / TICKS_IN_SEASON;
        long month = (adjustedWorldTime % TICKS_IN_YEAR) / TICKS_IN_MONTH;
        long week_of_year = (adjustedWorldTime % TICKS_IN_YEAR) / TICKS_IN_WEEK;
        long week_of_month = (adjustedWorldTime % TICKS_IN_YEAR) / (month * 4 * TICKS_IN_WEEK);
        long day_of_year = (adjustedWorldTime % TICKS_IN_YEAR) / TICKS_IN_DAY;
        long day_of_month =

        long timeOfDay = adjustedWorldTime;

        return String.format("Year: %s, Season: %s, Month: %s, Week of Year: %s, Week of Month: %s, Day of Year: %s, Time of Day: %s", year, season, month, week_of_year, week_of_month, day_of_year, timeOfDay);
    }
}
