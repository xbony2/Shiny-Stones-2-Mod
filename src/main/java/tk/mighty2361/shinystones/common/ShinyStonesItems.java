package tk.mighty2361.shinystones.common;

import tk.mighty2361.shinystones.items.SSItem;
import net.minecraft.item.Item;

public class ShinyStonesItems {
	public static Item elementIngot;
	public static Item elementDust;
	public static Item shinyAirDust;
	public static Item shinyWaterDust;
	public static Item shinyEarthDust;
	public static Item shinyFireDust;
	public static Item elementChunk;
	public static Item elementFuel;
	
	/**
	 * Registers blocks
	 * 
	 * @author xbony2
	 */
	public static void registerItems(){
		elementIngot = new SSItem("XBONY2_ingotElementium");
		elementDust = new SSItem("XBONY2_dustElementium");
		shinyAirDust = new SSItem("XBONY2_dustAir");
		shinyWaterDust = new SSItem("XBONY2_dustWater");
		shinyEarthDust = new SSItem("XBONY2_dustEarth");
		shinyFireDust = new SSItem("XBONY2_dustFire");
		elementChunk = new SSItem("XBONY2_chunkElement");
		elementFuel = new SSItem("XBONY2_fuelElement");
	}
}
