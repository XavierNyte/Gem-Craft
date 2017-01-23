package com.xaviernyte.gemCraft.world;

import java.util.Random;

import com.xaviernyte.gemCraft.config.GemCraftConfig;
import com.xaviernyte.gemCraft.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGeneration implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		addOreGen(random, chunkX, chunkZ, world);
	}
	
	int sapphireVein = GemCraftConfig.maxVeinSizeSapphire;
	int rubyVein = GemCraftConfig.maxVeinSizeRuby;
	int amethystVein = GemCraftConfig.maxVeinSizeAmethyst;
	int whiteVein = GemCraftConfig.maxVeinSizeWhite;
	int netherVein = GemCraftConfig.maxVeinSizeNether;
	int endVein = GemCraftConfig.maxVeinSizeEnd;
	
	public void addOreGen(Random random, int chunkX, int chunkZ, World world){
		
		switch (world.provider.getDimension()){
		
			case 0:
				
				generateOre(ModBlocks.sapphire_ore.getDefaultState(), Blocks.STONE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 48, (int)Math.ceil(sapphireVein/2.0) + random.nextInt((int)Math.floor(sapphireVein/2.0)), GemCraftConfig.chancesToSpawnSapphire);
				generateOre(ModBlocks.ruby_ore.getDefaultState(), Blocks.STONE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 32, (int)Math.ceil(rubyVein/2.0) + random.nextInt((int)Math.floor(rubyVein/2.0)), GemCraftConfig.chancesToSpawnRuby);
				generateOre(ModBlocks.amethyst_ore.getDefaultState(), Blocks.STONE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, (int)Math.ceil(amethystVein/2.0) + random.nextInt((int)Math.floor(amethystVein/2.0)), GemCraftConfig.chancesToSpawnAmethyst);
				generateOre(ModBlocks.whitegold_ore.getDefaultState(), Blocks.STONE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, (int)Math.ceil(whiteVein/2.0) + random.nextInt((int)Math.floor(whiteVein/2.0)), GemCraftConfig.chancesToSpawnWhite);
				break;
				
			case 1:
				
				generateEndOre(ModBlocks.end_whitegold_ore.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 20, 80, (int)Math.ceil(endVein/2.0) + random.nextInt((int)Math.floor(endVein/2.0)), GemCraftConfig.chancesToSpawnEnd);
				break;
				
			case -1:
				
				generateNetherOre(ModBlocks.nether_whitegold_ore.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 64, (int)Math.ceil(netherVein/2.0) + random.nextInt((int)Math.floor(netherVein/2.0)), GemCraftConfig.chancesToSpawnNether);
				break;
		}
	}
	
	private void generateOre(IBlockState ore, IBlockState toReplace, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
	
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
			WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(toReplace.getBlock()));
			generator.generate(world, random, pos);
		}
	}
	
	private void generateNetherOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
	
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
			WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(Blocks.NETHERRACK));
			generator.generate(world, random, pos);
		}
	}
	
	private void generateEndOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
	
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
			WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(Blocks.END_STONE));
			generator.generate(world, random, pos);
		}
	}
}