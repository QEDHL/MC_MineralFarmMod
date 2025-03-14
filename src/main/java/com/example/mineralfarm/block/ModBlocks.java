package com.example.mineralfarm.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block FARM_BLOCK = new FarmBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    public static void registerBlocks() {
        Registry.register(Registries.BLOCK, new Identifier("mineralfarm", "farm_block"), FARM_BLOCK);
    }
}
