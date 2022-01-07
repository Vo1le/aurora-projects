package net.mcreator.auroraprojects.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.auroraprojects.AuroraprojectsMod;

import java.util.Random;
import java.util.Map;

public class BoomProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AuroraprojectsMod.LOGGER.warn("Failed to load dependency world for procedure Boom!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AuroraprojectsMod.LOGGER.warn("Failed to load dependency x for procedure Boom!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AuroraprojectsMod.LOGGER.warn("Failed to load dependency y for procedure Boom!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AuroraprojectsMod.LOGGER.warn("Failed to load dependency z for procedure Boom!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AuroraprojectsMod.LOGGER.warn("Failed to load dependency entity for procedure Boom!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double localnumber = 0;
		localnumber = ((new Random()).nextInt((int) 10 + 1));
		if (localnumber == 3) {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 2, Explosion.Mode.NONE);
			}
		}
		if (localnumber == 5) {
			for (int index0 = 0; index0 < (int) (5); index0++) {
				if (entity instanceof LivingEntity) {
					Entity _ent = entity;
					if (!_ent.world.isRemote()) {
						ArrowEntity entityToSpawn = new ArrowEntity(_ent.world, (LivingEntity) entity);
						entityToSpawn.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, (float) 1, 0);
						entityToSpawn.setDamage((float) 5);
						entityToSpawn.setKnockbackStrength((int) 5);
						_ent.world.addEntity(entityToSpawn);
					}
				}
			}
			for (int index1 = 0; index1 < (int) (10); index1++) {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.SPIT, x, y, z, (int) 50, 5, 10, 5, 0.01);
				}
			}
		}
	}
}
