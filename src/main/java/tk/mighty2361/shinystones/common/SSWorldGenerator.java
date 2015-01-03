package tk.mighty2361.shinystones.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

/**
 * I copied most of the code from <a href="https://github.com/ModForgery/Tesla/blob/master/src/main/java/me/modforgery/tesla/worldgen/WorldGenerator.java">here</a>
 *
 * @author xbony2, ModForgery
 */
public class SSWorldGenerator implements IWorldGenerator{
	@Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
        switch(world.provider.dimensionId){
            case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
    }
	
	private void generateSurface(World world, Random random, int x, int z){
		this.addOreSpawn(ShinyStonesBlocks.shinyEarthStone, world, random, x, z, 16, 16, 6, 7, 5, 120);
		this.addOreSpawn(ShinyStonesBlocks.shinyWaterStone, world, random, x, z, 16, 16, 6, 7, 5, 120);
    }
	
	private void generateNether(World world, Random random, int x, int z){
		this.addNetherOreSpawn(ShinyStonesBlocks.shinyFireStone, world, random, x, z, 16, 16, 6, 7, 5, 120);
    }

	private void generateEnd(World world, Random random, int x, int z){
		this.addEndOreSpawn(ShinyStonesBlocks.shinyAirStone, world, random, x, z, 16, 16, 6, 7, 5, 120);
    }
	
	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for(int x = 0; x < chancesToSpawn; x++){
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize, Blocks.stone)).generate(world, random, posX, posY, posZ);
        }
    }

    public void addEndOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for(int x = 0; x < chancesToSpawn; x++){
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize, Blocks.end_stone)).generate(world, random, posX, posY, posZ);
        }
    }

    public void addNetherOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for(int x = 0; x < chancesToSpawn; x++){
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize, Blocks.netherrack)).generate(world, random, posX, posY, posZ);
        }
    }
    public void addCustomOreSpawn(Block block, Block custom, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for(int x = 0; x < chancesToSpawn; x++){
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize, custom)).generate(world, random, posX, posY, posZ);
        }
    }
}
