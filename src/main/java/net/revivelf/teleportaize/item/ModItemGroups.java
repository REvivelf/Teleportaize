package net.revivelf.teleportaize.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.revivelf.teleportaize.Teleportaize;

public class ModItemGroups {
    public static final String GROUP_NAME = "teleportaize_group";
    public static final ItemGroup TELEPORTAIZE_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.ITEM_MONOLITH))
            .displayName(Text.translatable("itemGroup.teleportaize.group"))
            .entries((context, entries) -> {
                entries.add(ModItems.ITEM_MONOLITH);
                entries.add(ModItems.ITEM_TELEPORT_BELL);
                entries.add(ModItems.ITEM_TELEPORT_BOOK);
            })
            .build();

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Teleportaize.MOD_ID, GROUP_NAME), TELEPORTAIZE_GROUP);
    }
}
