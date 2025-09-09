package nuxlox.elysium.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import nuxlox.elysium.Elysium;

public class ModItems {
    // Enderite
    public static final Item ENDERITE_ALLOY = registerItem("enderite_alloy", new Item(new FabricItemSettings()));
    public static final Item ENDERITE_DUST = registerItem("enderite_dust", new Item(new FabricItemSettings()));
    public static final Item ENDERITE_BINDING = registerItem("enderite_binding", new Item(new FabricItemSettings()));

    // Dusts
    public static final Item NETHERITE_DUST = registerItem("netherite_dust", new Item(new FabricItemSettings()));
    public static final Item END_STONE_DUST = registerItem("end_stone_dust", new Item(new FabricItemSettings()));


    // Steel
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_PLATE = registerItem("steel_plate", new Item(new FabricItemSettings()));

    // Soulsteel
    public static final Item SOULSTEEL_INGOT = registerItem("soulsteel_ingot", new Item(new FabricItemSettings()));
    public static final Item SOULSTEEL_BINDING = registerItem("soulsteel_binding", new Item(new FabricItemSettings()));
    // Soulsteel Tools
    public static final Item SOULSTEEL_PICKAXE = registerItem("soulsteel_pickaxe", new PickaxeItem(ModToolMaterial.SOULSTEEL,2, 2f, new FabricItemSettings().maxCount(1)));
    public static final Item SOULSTEEL_SWORD = registerItem("soulsteel_sword", new SwordItem(ModToolMaterial.SOULSTEEL, 8, 2f, new FabricItemSettings().maxCount(1)));
    public static final Item SOULSTEEL_AXE = registerItem("soulsteel_axe", new AxeItem(ModToolMaterial.SOULSTEEL, 7, 1f, new FabricItemSettings().maxCount(1)));
    public static final Item SOULSTEEL_SHOVEL = registerItem("soulsteel_shovel", new ShovelItem(ModToolMaterial.SOULSTEEL, 2, 3f, new FabricItemSettings().maxCount(1)));
    public static final Item SOULSTEEL_HOE = registerItem("soulsteel_hoe", new HoeItem(ModToolMaterial.SOULSTEEL, 3, 4f, new FabricItemSettings().maxCount(1)));

    // Misc
    public static final Item EVERDEATH_TOME = registerItem("everdeath_tome", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item REINFORCED_STICK = registerItem("reinforced_stick", new Item(new FabricItemSettings()));

    // Item Registration Methods
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Elysium.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Elysium.LOGGER.info("Registering Items for mod '" + Elysium.MOD_ID + "'.");
    }

}
