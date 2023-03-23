package net.liron.compactblocksmod.screen;

import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandlers {
	public static ScreenHandlerType<CompactorScreenHandler> COMPACTOR_SCREEN_HANDLER;
	
	public static void registerAllScreenhandlers() {
		COMPACTOR_SCREEN_HANDLER = new ScreenHandlerType<>(CompactorScreenHandler::new);
	}
}
