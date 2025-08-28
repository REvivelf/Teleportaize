package net.revivelf.teleportaize.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;

import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.revivelf.teleportaize.Teleportaize;


public class ModItems {
    public static final Item ITEM_MONOLITH = registerItem(
            "monolith_item",
            new Item(new FabricItemSettings())
    );
    public static final Item ITEM_TELEPORT_BELL = registerItem(
            "teleport_bell_item",
            new Item(new FabricItemSettings())
    );
    public static final Item ITEM_TELEPORT_BOOK = registerItem(
            "teleport_book_item",
            new Item(new FabricItemSettings())
    );

    public static Item registerItem(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(Teleportaize.MOD_ID, name),
                item
        );
    }

    public static Item registerItem(String name, Item item, RegistryKey<ItemGroup> itemGroup) {
        Item proccedItem = Registry.register(
                Registries.ITEM,
                new Identifier(Teleportaize.MOD_ID, name),
                item
        );

        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(proccedItem));

        return proccedItem;
    }

    public static void register() {}
}
