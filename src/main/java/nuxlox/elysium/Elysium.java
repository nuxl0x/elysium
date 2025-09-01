package nuxlox.elysium;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Elysium implements ModInitializer {
	public static final String MOD_ID = "elysium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initialization begun.");
	}
}