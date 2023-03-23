package net.liron.compactblocksmod.screen;

import net.liron.compactblocksmod.CompactBlocksMod;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.Identifier;
import net.minecraft.text.Text;

public class CompactorScreen extends HandledScreen<CompactorScreenHandler>{

	private static final Identifier TEXTURE =
            new Identifier(CompactBlocksMod.MOD_ID, "textures/gui/compactor_block_gui.png");

	
	public CompactorScreen(CompactorScreenHandler handler, PlayerInventory inventory, Text title) {
		super(handler, inventory, title);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
		// TODO Auto-generated method stub
		
	}

}
