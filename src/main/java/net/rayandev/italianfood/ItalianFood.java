package net.rayandev.italianfood;

import net.fabricmc.api.ModInitializer;


import net.rayandev.italianfood.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ItalianFood implements ModInitializer {
	public static final String MOD_ID = "italianfood";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}