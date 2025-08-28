package net.revivelf.teleportaize.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.revivelf.teleportaize.Teleportaize;
import net.revivelf.teleportaize.item.ModItemGroups;
import net.revivelf.teleportaize.item.ModItems;

public class ModBlocks {
    public static final Block MONOLITH_BLOCK = registerBlock(
            "monolith_block",
            new Block(FabricBlockSettings.create().strength(1.0F).luminance(10)),
            RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Teleportaize.MOD_ID, ModItemGroups.GROUP_NAME))
    );

    public static void register() {}

    private static Block registerBlock(String id, Block block) {
        ModItems.registerItem(id, new BlockItem(block, new FabricItemSettings()));

        return Registry.register(Registries.BLOCK, new Identifier(Teleportaize.MOD_ID, id), block);
    }

    private static Block registerBlock(String id, Block block, RegistryKey<ItemGroup> itemGroup) {
        ModItems.registerItem(id, new BlockItem(block, new FabricItemSettings()), itemGroup);

        return Registry.register(Registries.BLOCK, new Identifier(Teleportaize.MOD_ID, id), block);
    }
}
