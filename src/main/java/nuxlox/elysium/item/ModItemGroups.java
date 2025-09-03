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
                        entries.add(ModItems.EVERDEATH_TOME);
                        entries.add(ModItems.ENDERITE_ALLOY);
                        entries.add(ModBlocks.ENDERITE_ALLOY_BLOCK);
                        entries.add(ModItems.ENDERITE_POWDER);
                        entries.add(ModItems.NETHERITE_POWDER);
                        entries.add(ModItems.END_STONE_POWDER);
            }).build());

    public static void registerItemGroups() {
        Elysium.LOGGER.info("Registering Item Groups.");
    }
}
