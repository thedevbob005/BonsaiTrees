package com.davenonymous.bonsaitrees2.setup;

import com.davenonymous.bonsaitrees2.loot.function.CopyColor;
import com.davenonymous.bonsaitrees2.network.Networking;
import net.minecraft.world.storage.loot.functions.LootFunctionManager;
import net.minecraftforge.common.MinecraftForge;

public class ModSetup {
    public void init() {
        this.registerLootFunctions();
        MinecraftForge.EVENT_BUS.register(new ForgeEventHandlers());
        Networking.registerMessages();
    }

    private void registerLootFunctions() {
        LootFunctionManager.registerFunction(new CopyColor.Serializer());
    }
}
