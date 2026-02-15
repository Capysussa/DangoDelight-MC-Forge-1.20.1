package net.capysussa.dangodelight.item;

import net.capysussa.dangodelight.DangoDelight;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DangoDelight.MOD_ID);

    public static final RegistryObject<Item> RED_RICE_DUMPLING = ITEMS.register("red_rice_dumpling",
     () -> new Item(new Item.Properties().food(ModFoods.RICE_DUMPLING)));

    public static final RegistryObject<Item> WHITE_RICE_DUMPLING = ITEMS.register("white_rice_dumpling",
     () -> new Item(new Item.Properties().food(ModFoods.RICE_DUMPLING)));

    public static final RegistryObject<Item> LIGHT_GRAY_RICE_DUMPLING = ITEMS.register("light_gray_rice_dumpling",
     () -> new Item(new Item.Properties().food(ModFoods.RICE_DUMPLING)));

    public static final RegistryObject<Item> DANGO = ITEMS.register("dango",
     () -> new Item(new Item.Properties().food(ModFoods.DANGO)));



    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}