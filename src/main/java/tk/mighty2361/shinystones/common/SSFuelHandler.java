package tk.mighty2361.shinystones.common;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

/**
 * Thanks for this <a href="http://goo.gl/ai9yX3">fuel handler</a>, CBG!
 * 
 * @author CarbonBasedGhost, xbony2
 *
 */
public class SSFuelHandler implements IFuelHandler{
	public static HashMap<Item, Integer> furnaceFuel = new HashMap<Item, Integer>();
	   
    public static void registerFurnaceFuel(Item fuel, Integer burnTime){
        furnaceFuel.put(fuel, burnTime);
    }
    
    @Override
    public int getBurnTime(ItemStack fuel) {
        Item itemInFuelSlot = fuel.getItem();
        Integer burnTime = furnaceFuel.get(itemInFuelSlot);
       
        if (burnTime == null) return 0; else return burnTime;   
    }
    
    public static void addItemFurnaceFuel(Item fuel, Integer burnTime){   
        registerFurnaceFuel(fuel, burnTime);   
    }

    public static void addBlockFurnaceFuel (Block fuel, Integer burnTime){
        registerFurnaceFuel(Item.getItemFromBlock(fuel), burnTime);  
    }
}
