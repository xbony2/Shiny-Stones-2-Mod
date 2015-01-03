package tk.mighty2361.shinystones.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import tk.mighty2361.shinystones.ShinyStones2Mod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class SSItem extends Item{
	public SSItem(String unlocalizedName){
		super();
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(ShinyStones2Mod.shinyTab);
		GameRegistry.registerItem(this, unlocalizedName);
		OreDictionary.registerOre(unlocalizedName, this);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register){
		this.itemIcon = register.registerIcon("shinystones:" + this.getUnlocalizedName());
	}
}
