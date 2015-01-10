package tk.mighty2361.shinystones.crossmod.ic2;

import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;
import tk.mighty2361.shinystones.common.ShinyStonesBlocks;
import tk.mighty2361.shinystones.common.ShinyStonesItems;

public class IC2CrossMod {
	public static void init(){
		IC2RecipeInput input1 = new IC2RecipeInput(new ItemStack(ShinyStonesBlocks.shinyAirStone));
		Recipes.macerator.addRecipe(input1, null, new ItemStack(ShinyStonesItems.shinyAirDust, 8));
		
		IC2RecipeInput input2 = new IC2RecipeInput(new ItemStack(ShinyStonesBlocks.shinyEarthStone));
		Recipes.macerator.addRecipe(input2, null, new ItemStack(ShinyStonesItems.shinyEarthDust, 8));
		
		IC2RecipeInput input3 = new IC2RecipeInput(new ItemStack(ShinyStonesBlocks.shinyFireStone));
		Recipes.macerator.addRecipe(input3, null, new ItemStack(ShinyStonesItems.shinyFireDust, 8));
		
		IC2RecipeInput input4 = new IC2RecipeInput(new ItemStack(ShinyStonesBlocks.shinyWaterStone));
		Recipes.macerator.addRecipe(input4, null, new ItemStack(ShinyStonesItems.shinyWaterDust, 8));
	}
}
