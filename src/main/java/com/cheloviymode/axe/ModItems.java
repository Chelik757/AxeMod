package com.cheloviymode.axe;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers; // <-- Используем Tiers для 1.21.1
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = 
            DeferredRegister.createItems(AxeMod.MOD_ID);

    // В 1.21.1 материал инструмента — это Tiers (enum), а не ToolMaterial
    public static final Tiers AXE_MATERIAL = Tiers.IRON;

    public static final DeferredItem<Item> AXE = ITEMS.registerItem(
            "great_axe",
            props -> new Item(
                    props.axe(
                            AXE_MATERIAL, 
                            10.0f,  
                            -3.2f,  
                            new Item.Properties()
                    )
            )
    );
}
