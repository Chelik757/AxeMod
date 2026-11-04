package com.cheloviymode.axe;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = 
            DeferredRegister.createItems(AxeMod.MOD_ID);

    public static final DeferredItem<AxeItem> AXE = ITEMS.registerItem(
            "great_axe",
            props -> new AxeItem(
                    Tiers.IRON,
                    10.0f,
                    -3.2f,
                    new Item.Properties() // <-- ВОТ ТАК ПРАВИЛЬНО ДЛЯ 1.21.1
            )
    );
}
