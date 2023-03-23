package net.liron.compactblocksmod.screen;

import com.mojang.blaze3d.systems.RenderSystem;

import net.liron.compactblocksmod.CompactBlocksMod;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
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
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

	@Override
	protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);

        renderProgressArrow(matrices, x, y);		
	}
	
	private void renderProgressArrow(MatrixStack matrices, int x, int y) {
        if(handler.isCrafting()) {
            drawTexture(matrices, x + 81, y + 34, 176, 0, 14, handler.getScaledProgress());
        }
    }
	
	@Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }
}
