package tk.mighty2361.shinystones.recipes;

import net.minecraft.item.ItemStack;
import tk.mighty2361.shinystones.common.ShinyStonesBlocks;
import tk.mighty2361.shinystones.common.ShinyStonesItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	public static void addRecipes(){
		GameRegistry.addSmelting(ShinyStonesBlocks.shinyAirStone, new ItemStack(ShinyStonesItems.shinyAirDust, 6), 0.2F);
		GameRegistry.addSmelting(ShinyStonesBlocks.shinyWaterStone, new ItemStack(ShinyStonesItems.shinyWaterDust, 6), 0.2F);
		GameRegistry.addSmelting(ShinyStonesBlocks.shinyEarthStone, new ItemStack(ShinyStonesItems.shinyEarthDust, 6), 0.2F);
		GameRegistry.addSmelting(ShinyStonesBlocks.shinyFireStone, new ItemStack(ShinyStonesItems.shinyFireDust, 6), 0.2F);
	}
}
