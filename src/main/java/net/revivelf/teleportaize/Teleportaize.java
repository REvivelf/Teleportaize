package net.revivelf.teleportaize;

import net.fabricmc.api.ModInitializer;
import net.revivelf.teleportaize.block.ModBlocks;
import net.revivelf.teleportaize.item.ModItemGroups;
import net.revivelf.teleportaize.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Teleportaize implements ModInitializer {
    public static final String MOD_ID = "teleportaize";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.register();
        ModBlocks.register();
        ModItemGroups.initialize();
    }
}
