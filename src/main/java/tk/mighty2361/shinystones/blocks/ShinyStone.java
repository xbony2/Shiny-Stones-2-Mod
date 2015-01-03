package tk.mighty2361.shinystones.blocks;

import net.minecraft.block.material.Material;

public class ShinyStone extends SSBlock{

	public ShinyStone(String unlocalizedName) {
		super(Material.glass, unlocalizedName);
		this.setStepSound(this.soundTypeGlass);
		this.setLightLevel(1.0F);
	}

}
