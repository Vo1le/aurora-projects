package net.mcreator.auroraprojects.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.Property;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.BlockState;

import net.mcreator.auroraprojects.block.CablesStandarBlock;
import net.mcreator.auroraprojects.block.Cablejuste1Block;
import net.mcreator.auroraprojects.AuroraprojectsMod;

import java.util.Map;

public class Added1Procedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AuroraprojectsMod.LOGGER.warn("Failed to load dependency x for procedure Added1!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AuroraprojectsMod.LOGGER.warn("Failed to load dependency y for procedure Added1!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AuroraprojectsMod.LOGGER.warn("Failed to load dependency z for procedure Added1!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AuroraprojectsMod.LOGGER.warn("Failed to load dependency world for procedure Added1!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((CablesStandarBlock.block == (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)))).getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = Cablejuste1Block.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
			try {
				BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
				if (_property != null) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(_property, Direction.SOUTH), 3);
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(
							(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.SOUTH.getAxis()), 3);
				}
			} catch (Exception e) {
			}
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
				BlockState _bs = Cablejuste1Block.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
			try {
				BlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)));
				DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
				if (_property != null) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)), _bs.with(_property, Direction.NORTH), 3);
				} else {
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)), _bs.with(
							(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.NORTH.getAxis()), 3);
				}
			} catch (Exception e) {
			}
		}
	}
}
