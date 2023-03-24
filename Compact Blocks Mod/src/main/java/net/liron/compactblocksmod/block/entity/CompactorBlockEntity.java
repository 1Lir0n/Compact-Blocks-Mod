package net.liron.compactblocksmod.block.entity;


import com.mojang.brigadier.CommandDispatcher;

import net.liron.compactblocksmod.block.ModBlocks;
import net.liron.compactblocksmod.screen.CompactorScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.command.TellRawCommand;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class CompactorBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory{

	private final DefaultedList<ItemStack> inventory = 
			DefaultedList.ofSize(2, ItemStack.EMPTY);
	
    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 18;
		
	
	public CompactorBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlockEntities.COMPACTOR_BLOCK, pos, state);
		 this.propertyDelegate = new PropertyDelegate() {
	            public int get(int index) {
	                switch (index) {
	                    case 0: return CompactorBlockEntity.this.progress;
	                    case 1: return CompactorBlockEntity.this.maxProgress;
	                    default: return 0;
	                }
	            }

	            public void set(int index, int value) {
	                switch(index) {
	                    case 0: CompactorBlockEntity.this.progress = value; break;
	                    case 1: CompactorBlockEntity.this.maxProgress = value; break;
	                }
	            }

	            public int size() {
	                return 2;
	            }
	        };
	}

	@Override
	public ScreenHandler createMenu(int arg0, PlayerInventory arg1, PlayerEntity arg2) {
		// TODO Auto-generated method stub
		return new CompactorScreenHandler(arg0, arg1,this,this.propertyDelegate);
	}

	@Override
	public DefaultedList<ItemStack> getItems() {
		// TODO Auto-generated method stub
		return this.inventory;
	}

	@Override
	public Text getDisplayName() {
		// TODO Auto-generated method stub
		return  Text.literal("Compactor");
	}
	
	@Override
	protected void writeNbt(NbtCompound nbt) {
		// TODO Auto-generated method stub
		super.writeNbt(nbt);
		Inventories.writeNbt(nbt, inventory);
		nbt.putInt("compactor_block.progress", progress);
	}
	@Override
	public void readNbt(NbtCompound nbt) {
		// TODO Auto-generated method stub
		Inventories.readNbt(nbt, inventory);
		super.readNbt(nbt);
		progress= nbt.getInt("compactor_block.progress");
	}
	
    private void resetProgress() {
        this.progress = 0;
    }
	
	
	public static void tick(World world,BlockPos blockPos,BlockState blockState, CompactorBlockEntity entity) {
		if(world.isClient()) {
		return;	
		}
		if(hasRecipe(entity)) {
			entity.progress++;
			markDirty(world, blockPos, blockState);
			if(entity.progress>=entity.maxProgress) {
				craftItem(entity);
			}
		} else {
			entity.resetProgress();
			markDirty(world, blockPos, blockState);
			
		}
	}
	
	public static void output(CompactorBlockEntity entity,Item item) {
		switch (item.toString()) {
			case "compact_white_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_WHITE_WOOL,
	                    entity.getStack(1).getCount() + 1));
				
			}
			case "compact_orange_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_ORANGE_BLOCK,
	                    entity.getStack(1).getCount() + 1));
				
			}
			case "compact_magenta_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_MAGENTA_BLOCK,
	                    entity.getStack(1).getCount() + 1));
				
			}
			case "compact_light_blue_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_LIGHT_BLUE_BLOCK,
	                    entity.getStack(1).getCount() + 1));
				
			}
			case "compact_yellow_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_YELLOW_BLOCK,
	                    entity.getStack(1).getCount() + 1));
				
			}
			case "compact_lime_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_LIME_BLOCK,
	                    entity.getStack(1).getCount() + 1));
				
			}
			case "compact_pink_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_PINK_BLOCK,
	                    entity.getStack(1).getCount() + 1));
				
			}
			case "compact_gray_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_GRAY_BLOCK,
	                    entity.getStack(1).getCount() + 1));
				
			}
			case "compact_light_gray_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_LIGHT_GRAY_BLOCK,
	                    entity.getStack(1).getCount() + 1));
				
			}
			case "compact_cyan_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_CYAN_BLOCK,
	                    entity.getStack(1).getCount() + 1));
				
			}
			case "compact_purple_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_PURPLE_BLOCK,
	                    entity.getStack(1).getCount() + 1));
				break;
			}
			case "compact_blue_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_BLUE_BLOCK,
	                    entity.getStack(1).getCount() + 1));
				
			}
			case "compact_brown_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_BROWN_BLOCK,
	                    entity.getStack(1).getCount() + 1));
				
			}
			case "compact_green_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_GREEN_BLOCK,
	                    entity.getStack(1).getCount() + 1));
				
			}
			case "compact_red_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_RED_BLOCK,
	                    entity.getStack(1).getCount() + 1));
				
			}
			case "compact_black_wool": {
				
				entity.setStack(1, new ItemStack(ModBlocks.COMPACT_BLACK_WOOL,
	                    entity.getStack(1).getCount() + 1));
				
			}
        }
	}
	 private static void craftItem(CompactorBlockEntity entity) {
	        SimpleInventory inventory = new SimpleInventory(entity.size());
	        for (int i = 0; i < entity.size(); i++) {
	            inventory.setStack(i, entity.getStack(i));
	        }

	        if(hasRecipe(entity)) {
	            entity.removeStack(0, 9);
	            output(entity, item);

	            entity.resetProgress();
	        }
	    }
	static Item[] items = {Registry.ITEM.get(new Identifier("white_wool"))
			,Registry.ITEM.get(new Identifier("orange_wool"))
			,Registry.ITEM.get(new Identifier("magenta_wool"))
			,Registry.ITEM.get(new Identifier("light_blue_wool"))
			,Registry.ITEM.get(new Identifier("yellow_wool"))
			,Registry.ITEM.get(new Identifier("lime_wool"))
			,Registry.ITEM.get(new Identifier("pink_wool"))
			,Registry.ITEM.get(new Identifier("gray_wool"))
			,Registry.ITEM.get(new Identifier("light_gray_wool"))
			,Registry.ITEM.get(new Identifier("cyan_wool"))
			,Registry.ITEM.get(new Identifier("purple_wool"))
			,Registry.ITEM.get(new Identifier("blue_wool"))
			,Registry.ITEM.get(new Identifier("brown_wool"))
			,Registry.ITEM.get(new Identifier("green_wool"))
			,Registry.ITEM.get(new Identifier("red_wool"))
			,Registry.ITEM.get(new Identifier("black_wool"))};
	static Item item = Registry.ITEM.get(new Identifier("compact_"));

	private static boolean hasRecipe(CompactorBlockEntity entity) {
		SimpleInventory inventory = new SimpleInventory(entity.size());
		for(int i =0 ; i< entity.size();i++) {
			inventory.setStack(i, entity.getStack(i));
		}
		boolean hasItemInFirstSlot = false;
		String blockString = "compact_";
		for (Item item : items) {
			if(!hasItemInFirstSlot)
				hasItemInFirstSlot = entity.getStack(0).getItem() == item;
			
			if(hasItemInFirstSlot) {
				System.out.println(item.toString());
				blockString+=Item.getRawId(item);
				break;
			}
		}
		item = Registry.ITEM.get(new Identifier(blockString));
		boolean hasEnoughItems = entity.getStack(0).getCount() >= 9;
		return hasItemInFirstSlot && hasEnoughItems && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, item);
	}
	
	private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(1).getItem() == output || inventory.getStack(1).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(1).getMaxCount() > inventory.getStack(1).getCount();
    }

}
