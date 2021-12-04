package net.mcreator.auroraprojects.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.auroraprojects.particle.PasamiresParticle;
import net.mcreator.auroraprojects.AuroraprojectsMod;

import java.util.Map;

public class SableModdeEntityWalksOnTheBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AuroraprojectsMod.LOGGER.warn("Failed to load dependency x for procedure SableModdeEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AuroraprojectsMod.LOGGER.warn("Failed to load dependency y for procedure SableModdeEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AuroraprojectsMod.LOGGER.warn("Failed to load dependency z for procedure SableModdeEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AuroraprojectsMod.LOGGER.warn("Failed to load dependency world for procedure SableModdeEntityWalksOnTheBlock!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.addParticle(PasamiresParticle.particle, x, y, z, 0, 0, 0);
	}
}
