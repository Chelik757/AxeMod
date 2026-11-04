package com.cheloviymode.axe;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(AxeMod.MOD_ID)
public class AxeMod {
    // ID мода (строго как в gradle.properties и на сайте NeoForge)
    public static final String MOD_ID = "cheloviymode"; 

    public AxeMod(IEventBus modEventBus) {
        // Регистрируем предметы
        ModItems.ITEMS.register(modEventBus);
        // Добавляем в креативную вкладку
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // Добавляем секиру во вкладку "Инструменты и утилиты"
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.AXE);
        }
    }
}