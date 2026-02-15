package net.capysussa.dangodelight.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RICE_DUMPLING = new FoodProperties.Builder()
    .nutrition(2)
    .saturationMod(0.2f)
    .build();

    public static final FoodProperties DANGO = new FoodProperties.Builder()
    .nutrition(6)
    .saturationMod(0.3f)
    .build();
}
