package tk.mighty2361.shinystones.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

public class SSBlock extends Block{

	public SSBlock(Material material, String unlocalizedName) {
		super(material);
		
		this.setBlockName(unlocalizedName);
		this.setCreativeTab(null);
		this.setHardness(3.0F);
		this.setResistance(10.0F);
		
		GameRegistry.registerBlock(this, unlocalizedName);
		OreDictionary.registerOre(unlocalizedName, this);
	}

}
