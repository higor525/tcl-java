package com.higor525.client;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "higorclient", name = "Higor Client", version = "1.0")
public class HigorClient {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("[HigorClient] Carregado com sucesso!");
    }
}
