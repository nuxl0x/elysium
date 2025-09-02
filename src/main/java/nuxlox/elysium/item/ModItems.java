package nuxlox.elysium.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nuxlox.elysium.Elysium;

public class ModItems {

    public static final Item ELINITE = registerItem("elinite", new Item(new FabricItemSettings()));
    public static final Item GRIMSTONE = registerItem("grimstone", new Item(new FabricItemSettings()));

    // Item Registration Methods
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Elysium.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Elysium.LOGGER.info("Registering Items for mod '" + Elysium.MOD_ID + "'.");
    }

}
