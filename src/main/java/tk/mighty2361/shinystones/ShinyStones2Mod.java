package tk.mighty2361.shinystones;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tk.mighty2361.shinystones.common.SSWorldGenerator;
import tk.mighty2361.shinystones.common.ShinyStonesBlocks;
import tk.mighty2361.shinystones.common.ShinyStonesItems;
import tk.mighty2361.shinystones.recipes.ShapedRecipes;
import tk.mighty2361.shinystones.recipes.SmeltingRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "ShinyStonesMod", name = "Shiny Stones 2", version = "@VERSION@")
public class ShinyStones2Mod {
	
	public static CreativeTabs shinyTab;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		shinyTab = new CreativeTabs("shinyTab"){
			@Override 
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return Item.getItemFromBlock(ShinyStonesBlocks.shinyEarthStone); 
			}
		};
		
		ShinyStonesBlocks.registerBlocks();
		
		ShinyStonesItems.registerItems();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		GameRegistry.registerWorldGenerator(new SSWorldGenerator(), 1);
		
		ShapedRecipes.addRecipes();
		
		SmeltingRecipes.addRecipes();
	}
}
