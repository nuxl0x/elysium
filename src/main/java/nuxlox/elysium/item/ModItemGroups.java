package nuxlox.elysium.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nuxlox.elysium.Elysium;
import nuxlox.elysium.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup ELYSIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Elysium.MOD_ID, "elysium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.elysium"))
                    .icon(() -> new ItemStack(ModItems.EVERDEATH_TOME)).entries((displayContext, entries) -> {
                        // Misc
                        entries.add(ModItems.EVERDEATH_TOME);
                        entries.add(ModItems.REINFORCED_STICK);

                        // Enderite
                        entries.add(ModItems.ENDERITE_ALLOY);
                        entries.add(ModBlocks.ENDERITE_ALLOY_BLOCK);
                        entries.add(ModItems.ENDERITE_DUST);
                        entries.add(ModItems.ENDERITE_BINDING);

                        // Dusts
                        entries.add(ModItems.NETHERITE_DUST);
                        entries.add(ModItems.END_STONE_DUST);

                        // Steel
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_PLATE);

                        // Soulsteel
                        entries.add(ModItems.SOULSTEEL_INGOT);
                        entries.add(ModItems.SOULSTEEL_BINDING);
                        // Soulsteel Tools
                        entries.add(ModItems.SOULSTEEL_SWORD);
                        entries.add(ModItems.SOULSTEEL_PICKAXE);
                        entries.add(ModItems.SOULSTEEL_AXE);
                        entries.add(ModItems.SOULSTEEL_SHOVEL);
                        entries.add(ModItems.SOULSTEEL_HOE);

                        // Cursed/Imbued Items
            }).build());

    public static void registerItemGroups() {
        Elysium.LOGGER.info("Registering Item Groups.");
    }
}
