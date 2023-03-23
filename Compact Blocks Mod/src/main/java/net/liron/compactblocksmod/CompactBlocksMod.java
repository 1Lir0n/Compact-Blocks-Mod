package net.liron.compactblocksmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.liron.compactblocksmod.block.ModBlocks;
import net.liron.compactblocksmod.block.entity.ModBlockEntities;
import net.liron.compactblocksmod.screen.ModScreenHandlers;
import net.minecraft.client.render.RenderLayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompactBlocksMod implements ModInitializer {
	public static final String MOD_ID="compactblocksmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		
		ModBlockEntities.registerBlockEntities();
		ModBlocks.registerModBlocks();
		ModScreenHandlers.registerAllScreenhandlers();
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COMPACTOR_BLOCK, RenderLayer.getCutout());
	}
}