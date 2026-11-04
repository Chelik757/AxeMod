package com.cheloviymode.axe;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = 
            DeferredRegister.createItems(AxeMod.MOD_ID);

    public static final DeferredItem<AxeItem> AXE = ITEMS.registerItem(
            "great_axe",
            props -> new AxeItem(
                    Tiers.IRON, // Материал
                    10.0f,      // Базовый урон (будет добавлен к урону материала)
                    -3.2f,      // Скорость атаки
                    new Item.Properties() // Дополнительные свойства
            )
    );
}
