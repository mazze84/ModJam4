package com.teampapayamar.solstice.util;

import com.teampapayamar.solstice.configuration.Settings;
import com.teampapayamar.solstice.reference.Time;

public class TimeHelper
{
    /**
     * Scratch notes because I (Pahimar) am lazy - 24,000 ticks in a MC day == 20 minutes game time - 168,000 ticks in a
     * MC week == 140 minutes game time == 2 hours 20 minutes - 672,000 ticks in a MC month == 9 hours 20 minutes -
     * 2,016,000 ticks in a MC season - 8,064,000 ticks in a MC year
     */
    public static final int TICKS_IN_MINUTE = 17;
    public static final int TICKS_IN_HOUR = 1000;
    public static final int TICKS_IN_DAY = TICKS_IN_HOUR * 24;
    public static final int TICKS_IN_WEEK = TICKS_IN_DAY * 7;
    public static final int TICKS_IN_MONTH = TICKS_IN_WEEK * 4;
    public static final int TICKS_IN_SEASON = TICKS_IN_MONTH * 3;
    public static final int TICKS_IN_YEAR = TICKS_IN_SEASON * 4;

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

//        return String.format("Year: %s, Season: %s, Month: %s, Day of Month, %s, Day of Week: %s, %02d:%02d %s", getYear(worldTime), getSeason(worldTime), getMonth(worldTime), getDayOfMonth(worldTime), getDayOfWeek(worldTime), getHour(worldTime, false), getMinutes(worldTime), getAMPM(worldTime));
        return String.format("%s %s %s, %s AC %02d:%02d %s [%s]", Time.DAY_OF_WEEK[getDayOfWeek(worldTime)], Time.MONTHS[getMonth(worldTime)], getDayOfMonth(worldTime) + 1, getYear(worldTime), getHour(worldTime, false), getMinutes(worldTime), getAMPM(worldTime), Time.SEASONS[getSeason(worldTime)]);
    }

    public static int getYear(long worldTime)
    {
        return ((((int) worldTime) + 2 * TICKS_IN_MONTH) / TICKS_IN_YEAR);
    }

    public static String getYear(long worldTime)
    {

    }

    /**
     *  Seasons go:
     *      Months 11, 0, 1 == Winter
     *      Months 2, 3, 4 == Spring
     *      Months 5, 6, 7 == Summer
     *      Months 8, 9, 10 == Fall/Autumn
     *
     * @param worldTime
     * @return
     */
    public static int getSeason(long worldTime)
    {
        int month = getMonth(worldTime);

        if (month == 11 || month == 0 || month == 1)
        {
            return 0;
        }
        else if (month == 2 || month == 3 || month == 4)
        {
            return 1;
        }
        else if (month == 5 || month == 6 || month == 7)
        {
            return 2;
        }
        else // (month == 8 || month == 9 || month == 10)
        {
            return 3;
        }
    }

    public static int getMonth(long worldTime)
    {
        return (((((int) worldTime) + 2 * TICKS_IN_MONTH) % TICKS_IN_YEAR)) / TICKS_IN_MONTH;
    }

    public static int getDayOfMonth(long worldTime)
    {
        return ((((int) worldTime) + 2 * TICKS_IN_MONTH) % TICKS_IN_YEAR % TICKS_IN_MONTH) / TICKS_IN_DAY;
    }

    public static int getDayOfWeek(long worldTime)
    {
        return ((((int) worldTime) + 2 * TICKS_IN_MONTH) % TICKS_IN_YEAR % TICKS_IN_MONTH % TICKS_IN_WEEK) / TICKS_IN_DAY;
    }

    public static int getHour(long worldTime, boolean is24HourTime)
    {
        if (is24HourTime)
        {
            return ((((((int) worldTime) + 2 * TICKS_IN_MONTH) % TICKS_IN_YEAR % TICKS_IN_MONTH % TICKS_IN_WEEK % TICKS_IN_DAY) / TICKS_IN_HOUR) + 6) % 24;
        }
        else
        {
            return ((((((int) worldTime) + 2 * TICKS_IN_MONTH) % TICKS_IN_YEAR % TICKS_IN_MONTH % TICKS_IN_WEEK % TICKS_IN_DAY) / TICKS_IN_HOUR) + 6) % 12;
        }
    }

    public static int getMinutes(long worldTime)
    {
        return ((((int) worldTime) + 2 * TICKS_IN_MONTH) % TICKS_IN_YEAR % TICKS_IN_MONTH % TICKS_IN_WEEK % TICKS_IN_DAY % TICKS_IN_HOUR) / TICKS_IN_MINUTE;
    }

    public static String getAMPM(long worldTime)
    {
        if (getHour(worldTime, true) >= 12)
        {
            return "PM";
        }
        else if (getHour(worldTime, true) < 12)
        {
            return "AM";
        }
        else
        {
            return "";
        }
    }
}
