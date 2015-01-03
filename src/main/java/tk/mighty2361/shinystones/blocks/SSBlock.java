package tk.mighty2361.shinystones.blocks;

import tk.mighty2361.shinystones.ShinyStones2Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraftforge.oredict.OreDictionary;

public class SSBlock extends Block{

	public SSBlock(Material material, String unlocalizedName) {
		super(material);
		
		this.setBlockName(unlocalizedName);
		this.setCreativeTab(ShinyStones2Mod.shinyTab);
		this.setHardness(3.0F);
		this.setResistance(10.0F);
		this.setBlockTextureName(unlocalizedName);
		
		GameRegistry.registerBlock(this, unlocalizedName);
		OreDictionary.registerOre(unlocalizedName, this);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register){
		this.blockIcon = register.registerIcon("shinystones:" + this.getUnlocalizedName());
	}
}
