package tk.mighty2361.shinystones.common;

import tk.mighty2361.shinystones.blocks.ShinyStone;
import net.minecraft.block.Block;

public class ShinyStonesBlocks {
	public static Block shinyAirStone;
	public static Block shinyWaterStone;
	public static Block shinyEarthStone;
	public static Block shinyFireStone;
	
	/**
	 * Registers blocks
	 * 
	 * @author xbony2
	 */
	public static void registerBlocks(){
		shinyAirStone = new ShinyStone("XBONY2_shinyAir");
		shinyWaterStone = new ShinyStone("XBONY2_shinyWater");
		shinyEarthStone = new ShinyStone("XBONY2_shinyEarth");
		shinyFireStone = new ShinyStone("XBONY2_shinyFire");
	}
}
