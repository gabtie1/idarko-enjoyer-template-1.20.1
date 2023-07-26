package com.idarkoenjoyer;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;

public class ExampleModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		MinecraftClient client = MinecraftClient.getInstance();

		client.keyboard.onKey();
	}
}