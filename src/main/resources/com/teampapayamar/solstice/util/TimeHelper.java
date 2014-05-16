package com.teampapayamar.solstice.util;

public class TimeHelper
{
    /**
     * Scratch notes because I (Pahimar) am lazy - 24,000 ticks in a MC day == 20 minutes game time - 168,000 ticks in a
     * MC week == 140 minutes game time == 2 hours 20 minutes - 672,000 ticks in a MC month == 9 hours 20 minutes -
     * 2,016,000 ticks in a MC season - 8,064,000 ticks in a MC year
     */
    public static final long TICKS_IN_MINUTE = 17L;
    public static final long TICKS_IN_HOUR = 1000L;
    public static final long TICKS_IN_DAY = TICKS_IN_HOUR * 24;
    public static final long TICKS_IN_WEEK = TICKS_IN_DAY * 7;
    public static final long TICKS_IN_MONTH = TICKS_IN_WEEK * 4;
    public static final long TICKS_IN_SEASON = TICKS_IN_MONTH * 3;
    public static final long TICKS_IN_YEAR = TICKS_IN_SEASON * 4;

    public static String convertTicksToTimeString(long worldTime)
    {
        // Offset world time by one season, to accommodate that we start players on the first day of Spring
//        long adjustedWorldTime = worldTime + TICKS_IN_SEASON;
//        long year = adjustedWorldTime / TICKS_IN_YEAR;
//        long season = (adjustedWorldTime % TICKS_IN_YEAR) / TICKS_IN_SEASON;
//        long month = (adjustedWorldTime % TICKS_IN_YEAR) / TICKS_IN_MONTH;
//        long week_of_year = (adjustedWorldTime % TICKS_IN_YEAR) / TICKS_IN_WEEK;
//        long week_of_month = (adjustedWorldTime % TICKS_IN_YEAR % TICKS_IN_MONTH) / TICKS_IN_WEEK;
//        long day_of_year = (adjustedWorldTime % TICKS_IN_YEAR) / TICKS_IN_DAY;
//        long day_of_month = (adjustedWorldTime % TICKS_IN_YEAR % TICKS_IN_MONTH) / TICKS_IN_DAY;
//        long day_of_week = (adjustedWorldTime % TICKS_IN_YEAR % TICKS_IN_MONTH % TICKS_IN_WEEK) / TICKS_IN_DAY;
//        long hours = (((adjustedWorldTime % TICKS_IN_YEAR % TICKS_IN_MONTH % TICKS_IN_WEEK % TICKS_IN_DAY) / TICKS_IN_HOUR) + 6) % 24;
//        long minutes = (adjustedWorldTime % TICKS_IN_YEAR % TICKS_IN_MONTH % TICKS_IN_WEEK % TICKS_IN_DAY % TICKS_IN_HOUR) / TICKS_IN_MINUTE;

        return String.format("Year: %s, Season: %s, Month: %s, Day of Month, %s, Day of Week: %s, %02d:%02d", getYear(worldTime), getSeason(worldTime), getMonth(worldTime), getDayOfMonth(worldTime), getDayOfWeek(worldTime), getHour(worldTime), getMinutes(worldTime));
    }

    public static long getYear(long worldTime)
    {
        return (worldTime + TICKS_IN_SEASON) / TICKS_IN_YEAR;
    }

    public static long getSeason(long worldTime)
    {
        return ((worldTime + TICKS_IN_SEASON) % TICKS_IN_YEAR) / TICKS_IN_SEASON;
    }

    public static long getMonth(long worldTime)
    {
        return ((worldTime + TICKS_IN_SEASON) % TICKS_IN_YEAR) / TICKS_IN_MONTH;
    }

    public static long getDayOfMonth(long worldTime)
    {
        return ((worldTime + TICKS_IN_SEASON) % TICKS_IN_YEAR % TICKS_IN_MONTH) / TICKS_IN_DAY;
    }

    public static long getDayOfWeek(long worldTime)
    {
        return ((worldTime + TICKS_IN_SEASON) % TICKS_IN_YEAR % TICKS_IN_MONTH % TICKS_IN_WEEK) / TICKS_IN_DAY;
    }

    public static long getHour(long worldTime)
    {
        return ((((worldTime + TICKS_IN_SEASON) % TICKS_IN_YEAR % TICKS_IN_MONTH % TICKS_IN_WEEK % TICKS_IN_DAY) / TICKS_IN_HOUR) + 6) % 24;
    }

    public static long getMinutes(long worldTime)
    {
        return ((worldTime + TICKS_IN_SEASON) % TICKS_IN_YEAR % TICKS_IN_MONTH % TICKS_IN_WEEK % TICKS_IN_DAY % TICKS_IN_HOUR) / TICKS_IN_MINUTE;
    }
}
