package nuxlox.elysium.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nuxlox.elysium.Elysium;

public class ModBlocks {

    public static final Block COMPRESSED_ENDERITE_ALLOY_BLOCK = registerBlock("compressed_enderite_alloy_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    // Block Methods
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Elysium.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Elysium.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Elysium.LOGGER.info("Registering Blocks.");
    }

}
