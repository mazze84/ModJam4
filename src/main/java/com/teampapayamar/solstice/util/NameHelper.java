package com.teampapayamar.solstice.util;

public class NameHelper
{
    public static String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
