package net.liron.compactblocksmod;

import net.fabricmc.api.ClientModInitializer;
import net.liron.compactblocksmod.screen.CompactorScreen;
import net.liron.compactblocksmod.screen.ModScreenHandlers;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class CompactBlocksModClient implements ClientModInitializer{

	@Override
	public void onInitializeClient() {
		
		HandledScreens.register(ModScreenHandlers.COMPACTOR_SCREEN_HANDLER, CompactorScreen::new);
	}

}
