package nuxlox.elysium;

import net.fabricmc.api.ModInitializer;

import nuxlox.elysium.item.ModItemGroups;
import nuxlox.elysium.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Elysium implements ModInitializer {
	public static final String MOD_ID = "elysium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initialization of mod '" + Elysium.MOD_ID + "' has begun.");

        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
	}
}