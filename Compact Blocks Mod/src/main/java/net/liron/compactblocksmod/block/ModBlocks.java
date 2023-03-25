package net.liron.compactblocksmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.liron.compactblocksmod.CompactBlocksMod;
import net.liron.compactblocksmod.block.custom.CompactorBlock;
import net.liron.compactblocksmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class ModBlocks {
	
	//adds the compactor block that compacts automatically
	public static final Block COMPACTOR_BLOCK = registerBlock("compactor_block",
			new CompactorBlock(FabricBlockSettings.of(Material.GLASS).strength(2f).requiresTool().nonOpaque())
			,ModItemGroup.COMPACTBLOCKS);
	
	//add all the wool types to compacted wools
	public static final Block COMPACT_WHITE_WOOL = registerBlock("compact_white_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);
	
	public static final Block COMPACT_ORANGE_BLOCK = registerBlock("compact_orange_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);
	
	public static final Block COMPACT_MAGENTA_BLOCK = registerBlock("compact_magenta_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);
	
	public static final Block COMPACT_LIGHT_BLUE_BLOCK = registerBlock("compact_light_blue_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);
	
	public static final Block COMPACT_YELLOW_BLOCK = registerBlock("compact_yellow_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);
	
	public static final Block COMPACT_LIME_BLOCK = registerBlock("compact_lime_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);

	public static final Block COMPACT_PINK_BLOCK = registerBlock("compact_pink_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);
	
	public static final Block COMPACT_GRAY_BLOCK = registerBlock("compact_gray_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);

	public static final Block COMPACT_LIGHT_GRAY_BLOCK = registerBlock("compact_light_gray_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);
	
	public static final Block COMPACT_CYAN_BLOCK = registerBlock("compact_cyan_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);

	public static final Block COMPACT_PURPLE_BLOCK = registerBlock("compact_purple_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);
	
	public static final Block COMPACT_BLUE_BLOCK = registerBlock("compact_blue_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);

	public static final Block COMPACT_BROWN_BLOCK = registerBlock("compact_brown_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);

	public static final Block COMPACT_GREEN_BLOCK = registerBlock("compact_green_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);

	public static final Block COMPACT_RED_BLOCK = registerBlock("compact_red_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);

	public static final Block COMPACT_BLACK_WOOL = registerBlock("compact_black_wool",
			new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(net.minecraft.sound.BlockSoundGroup.WOOL))
			,ModItemGroup.COMPACTBLOCKS);

	
	
	
	
	private static Block registerBlock(String name, Block block,ItemGroup tab) {
		registerBlockItem(name, block, tab);
		return Registry.register(Registry.BLOCK,new Identifier(CompactBlocksMod.MOD_ID,name),block);
	}
	
	private static Item registerBlockItem(String name,Block block,ItemGroup tab) {
		return Registry.register(Registry.ITEM,new Identifier(CompactBlocksMod.MOD_ID,name),
				new BlockItem(block,new FabricItemSettings().group(tab)));
	}
	
	public static void registerModBlocks() {
		CompactBlocksMod.LOGGER.debug("Registering ModBlocks for "+CompactBlocksMod.MOD_ID);
	}

}
