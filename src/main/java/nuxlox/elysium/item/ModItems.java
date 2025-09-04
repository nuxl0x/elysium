package nuxlox.elysium.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import nuxlox.elysium.Elysium;

public class ModItems {
    // Enderite/Enderite Related
    public static final Item ENDERITE_ALLOY = registerItem("enderite_alloy", new Item(new FabricItemSettings()));
    public static final Item ENDERITE_DUST = registerItem("enderite_dust", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_DUST = registerItem("netherite_dust", new Item(new FabricItemSettings()));
    public static final Item END_STONE_DUST = registerItem("end_stone_dust", new Item(new FabricItemSettings()));

    // Soulsteel/Soulsteel Related
    public static final Item SOULSTEEL_INGOT = registerItem("soulsteel_ingot", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));

    public static final Item SOULSTEEL_PICKAXE = registerItem("soulsteel_pickaxe",
            new PickaxeItem(ModToolMaterial.SOULSTEEL,2, 2f, new FabricItemSettings()));

    // Cleavers

    // Misc
    public static final Item EVERDEATH_TOME = registerItem("everdeath_tome", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));

    // Item Registration Methods
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Elysium.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Elysium.LOGGER.info("Registering Items for mod '" + Elysium.MOD_ID + "'.");
    }

}
