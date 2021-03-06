package tk.mighty2361.shinystones.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import tk.mighty2361.shinystones.common.ShinyStonesBlocks;
import tk.mighty2361.shinystones.common.ShinyStonesItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class ShapedRecipes {
	private static final String[] HELMET = new String[]{"XXX", "X X"};
	private static final String[] CHESTPLATE = new String[]{"X X", "XXX", "XXX"};
	private static final String[] LEGGINGS = new String[]{"XXX", "X X", "X X"};
	private static final String[] BOOTS = new String[]{"X X", "X X"};
	private static final String[] PICKAXE = new String[]{"XXX", " S ", " S "};
	private static final String[] SWORD = new String[]{" X ", " X ", " S "};
	private static final String[] SHOVEL = new String[]{"X", "S", "S"};
	private static final String[] AXE = new String[]{"XX", "XS", " S"};
	private static final String[] BLOCK = new String[]{"XXX", "XXX", "XXX"};
	private static final String[] M_BLOCK = new String[]{"XXX", "XMX", "XXX"};
	
	public static void addRecipes(){
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinyStonesBlocks.shinyAirStone), new Object[]{
			M_BLOCK, 'M', "glowstone", 'X', "XBONY2_dustAir"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinyStonesBlocks.shinyWaterStone), new Object[]{
			M_BLOCK, 'M', "glowstone", 'X', "XBONY2_dustWater"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinyStonesBlocks.shinyEarthStone), new Object[]{
			M_BLOCK, 'M', "glowstone", 'X', "XBONY2_dustEarth"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinyStonesBlocks.shinyFireStone), new Object[]{
			M_BLOCK, 'M', "glowstone", 'X', "XBONY2_dustFire"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinyStonesItems.elementDust), new Object[]{
			"12", "34", '1', "XBONY2_dustAir", '2', "XBONY2_dustEarth", '3', "XBONY2_dustWater", '4', "XBONY2_dustFire"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinyStonesItems.elementChunk), new Object[]{
			M_BLOCK, 'X', Items.coal, 'M', "XBONY2_ingotElementium"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinyStonesItems.elementFuel), new Object[]{
			BLOCK, 'X', "XBONY2_chunkElement"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinyStonesBlocks.elementFuelBlock), new Object[]{
			BLOCK, 'X', "XBONY2_fuelElement"}));
		
		//I'm too lazy to set up a shapeless recipe class. Don't tell anyone.
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinyStonesItems.elementFuel, 9), new Object[]{
			"X", 'X', "XBONY2_blockElementFuel"}));
	}
}
