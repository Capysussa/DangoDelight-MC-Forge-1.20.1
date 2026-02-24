package net.capysussa.dangodelight.datagen;

import java.util.List;
import java.util.function.Consumer;

import net.capysussa.dangodelight.block.ModBlocks;
import net.capysussa.dangodelight.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private static final List<ItemLike> RICE_DUMPLINGS_LIST = List.of(
        ModItems.WHITE_RICE_DUMPLING.get(),
        ModItems.LIGHT_GRAY_RICE_DUMPLING.get(),
        ModItems.RED_RICE_DUMPLING.get()
    );

    private static final List<ItemLike> RICE_DUMPLING_BLOCKS_LIST = List.of(
        ModBlocks.WHITE_RICE_DUMPLING_BLOCK.get(),
        ModBlocks.LIGHT_GRAY_RICE_DUMPLING_BLOCK.get(),
        ModBlocks.RED_RICE_DUMPLING_BLOCK.get()
    );

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        for (int i = 0; i < RICE_DUMPLINGS_LIST.size(); i++) {
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RICE_DUMPLING_BLOCKS_LIST.get(i))
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', RICE_DUMPLINGS_LIST.get(i))
                .unlockedBy(getHasName(RICE_DUMPLINGS_LIST.get(i)), has(RICE_DUMPLINGS_LIST.get(i)))
                .save(pWriter);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RICE_DUMPLINGS_LIST.get(i), 9)
                .requires(RICE_DUMPLING_BLOCKS_LIST.get(i))
                .unlockedBy((getHasName(RICE_DUMPLING_BLOCKS_LIST.get(i))), has(RICE_DUMPLING_BLOCKS_LIST.get(i)))
                .save(pWriter);
        }


    }


}
