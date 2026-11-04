package com.cheloviymode.axe;

import net.minecraft.world.entity.ai.attributes.Attributes;
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
                    new Item.Properties().attributes(
                            AxeItem.createAttributes(Tiers.IRON, 10.0f, -3.2f)
                    )
            )
    );
}
