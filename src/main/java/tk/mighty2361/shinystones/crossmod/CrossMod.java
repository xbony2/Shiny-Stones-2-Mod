package tk.mighty2361.shinystones.crossmod;

import tk.mighty2361.shinystones.crossmod.ic2.IC2CrossMod;
import cpw.mods.fml.common.Loader;

public class CrossMod {
	private static boolean ic2;
	
	public static boolean getIC2(){
		return ic2;
	}
	
	public static void preinit(){
		ic2 = Loader.isModLoaded("IC2");
	}
	
	public static void init(){
		if(ic2) IC2CrossMod.init();
	}
}
