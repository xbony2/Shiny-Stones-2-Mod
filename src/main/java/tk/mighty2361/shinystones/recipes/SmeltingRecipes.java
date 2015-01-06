package tk.mighty2361.shinystones.recipes;

import net.minecraft.item.ItemStack;
import tk.mighty2361.shinystones.common.SSFuelHandler;
import tk.mighty2361.shinystones.common.ShinyStonesBlocks;
import tk.mighty2361.shinystones.common.ShinyStonesItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	/**
	 * Also included adding fuel values
	 * 
	 * @author xbony2, mighty
	 */
	public static void addRecipes(){
		SSFuelHandler.addItemFurnaceFuel(ShinyStonesItems.elementFuel, 3000);
		SSFuelHandler.addBlockFurnaceFuel(ShinyStonesBlocks.elementFuelBlock, 28000);
		
		GameRegistry.addSmelting(ShinyStonesBlocks.shinyAirStone, new ItemStack(ShinyStonesItems.shinyAirDust, 6), 0.2F);
		GameRegistry.addSmelting(ShinyStonesBlocks.shinyWaterStone, new ItemStack(ShinyStonesItems.shinyWaterDust, 6), 0.2F);
		GameRegistry.addSmelting(ShinyStonesBlocks.shinyEarthStone, new ItemStack(ShinyStonesItems.shinyEarthDust, 6), 0.2F);
		GameRegistry.addSmelting(ShinyStonesBlocks.shinyFireStone, new ItemStack(ShinyStonesItems.shinyFireDust, 6), 0.2F);
		GameRegistry.addSmelting(ShinyStonesItems.elementDust, new ItemStack(ShinyStonesItems.elementIngot), 0.2F);
	}
}
