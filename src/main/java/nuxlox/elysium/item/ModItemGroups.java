package nuxlox.elysium.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nuxlox.elysium.Elysium;

public class ModItemGroups {

    public static final ItemGroup ELYSIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Elysium.MOD_ID, "elinite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.elysium"))
                    .icon(() -> new ItemStack(ModItems.ELINITE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ELINITE);
                        entries.add(ModItems.GRIMSTONE);
            }).build());

    public static void registerItemGroups() {
        Elysium.LOGGER.info("Registering Item Groups.");
    }
}
