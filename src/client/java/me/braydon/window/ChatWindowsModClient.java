package me.braydon.window;

import me.braydon.window.chat.*;
import net.fabricmc.api.ClientModInitializer;

public class ChatWindowsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ChatWindowManager.get().init();
        ChatWindowsHud.register();
        ChatWindowsScreenHooks.register();
        ChatWindowsTick.register();
        ChatWindowsCommands.register();
    }
}
