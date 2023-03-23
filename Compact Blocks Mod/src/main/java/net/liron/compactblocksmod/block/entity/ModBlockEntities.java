package net.liron.compactblocksmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.liron.compactblocksmod.CompactBlocksMod;
import net.liron.compactblocksmod.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
	public static BlockEntityType<CompactorBlockEntity> COMPACTOR_BLOCK;
	
	public static void registerBlockEntities() {
		COMPACTOR_BLOCK =Registry.register(Registry.BLOCK_ENTITY_TYPE,
				new Identifier(CompactBlocksMod.MOD_ID,"compactor_block") ,
				FabricBlockEntityTypeBuilder.create(CompactorBlockEntity::new,
						ModBlocks.COMPACTOR_BLOCK).build(null));
	}
}
