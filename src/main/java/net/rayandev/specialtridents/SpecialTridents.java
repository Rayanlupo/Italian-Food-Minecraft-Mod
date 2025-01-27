package net.rayandev.specialtridents;

import net.fabricmc.api.ModInitializer;

import net.rayandev.specialtridents.entity.ModEntities;
import net.rayandev.specialtridents.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpecialTridents implements ModInitializer {
	public static final String MOD_ID = "specialtridents";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModEntities.registerEntities();
	}
}