package com.teampapayamar.solstice.util;

import org.apache.logging.log4j.Level;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class TempHelper {
	/*
	 * Basic temperature model. Uses average temperature to display the current temperature
	 * 
	 * 
	 */
	public static int getTemp(World world) {
		// World is the Nether or very hot place. Therefore the temperature is very hot
		if (world.provider.isHellWorld) {
			return 50;			
		}
		
		// World is the End. Pahi stated that there should be cold weather because there's no sun
		if (world.provider.dimensionId == 1) {
			return 0;
		}
		
		int month = TimeHelper.getMonth(world.getTotalWorldTime());
		int temperature = 0;
		if (month == 0) {
			temperature = 3;
		}
		if (month == 1) {
			temperature = 5;
		}
		if (month == 2) {
			temperature = 10;
		}
		if (month == 3) {
			temperature = 13;
		}
		if (month == 4) {
			temperature = 19;
		}
		if (month == 5) {
			temperature = 22;
		}
		if (month == 6) {
			temperature = 24;
		}
		if (month == 7) {
			temperature = 25;
		}
		if (month == 8) {
			temperature = 19;
		}
		if (month == 9) {
			temperature = 14;
		}
		if (month == 10) {
			temperature = 7;
		}
		if (month == 11) {
			temperature = 3;
		}
		
		// when raining lower the temperature based on the rain strength. Max temperature loss is 10 °C
//		if( world.isRaining()) {
//			temperature -= world.rainingStrength * 10;
//		}
		
		
		// temperature depends on the sun brightness
		// factors in rain and thunder
		// night is 10 °C colder than day
		float brightness = world.getSunBrightness(0);
		if (brightness == 0) {
			temperature -= 10;
		} else {
			temperature -= 1/brightness - 1;
		}
		if(Minecraft.getMinecraft().getLanguageManager().getCurrentLanguage().getLanguageCode().equals("en_US")) {
			return celciusToFahrenheit(temperature);
		}
		return temperature;
	}
	
	public static int celciusToFahrenheit(int temp) {
		return (int)(temp * 1.8 + 32);
	}
	
	/*
	 * calculates player temperature
	 * TODO: Generate formula to factor in armor type. Body temperature gets higher with wool armor and lower with chain mail.
	 * Body temperature can't be higher than 41 °C and lower than 35 °C.
	 */
	public static int getPlayerTemp(EntityPlayer player, World world) {
		int worldTemp = getTemp(world);
		int playerTemp = 37;
		if (worldTemp > 15) {
			playerTemp += 1;
		} else {
			playerTemp -= 1;
		}
		
		return playerTemp;
	}

}