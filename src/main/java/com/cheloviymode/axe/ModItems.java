package com.cheloviymode.axe;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = 
            DeferredRegister.createItems(AxeMod.MOD_ID);

    // Материал (железо)
    public static final ToolMaterial AXE_MATERIAL = ToolMaterial.IRON;

    // Регистрация секиры (ID: great_axe)
    public static final DeferredItem<Item> AXE = ITEMS.registerItem(
            "great_axe",
            props -> new Item(
                    props.axe(
                            AXE_MATERIAL, 
                            10.0f,  // Урон
                            -3.2f,  // Скорость атаки
                            new Item.Properties()
                    )
            )
    );
}