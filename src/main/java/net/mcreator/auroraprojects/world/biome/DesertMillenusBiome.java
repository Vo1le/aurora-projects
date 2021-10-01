
package net.mcreator.auroraprojects.world.biome;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;

import net.mcreator.auroraprojects.block.GrassMillenusBlock;
import net.mcreator.auroraprojects.block.DirtMillenusBlock;
import net.mcreator.auroraprojects.AuroraprojectsModElements;

@AuroraprojectsModElements.ModElement.Tag
public class DesertMillenusBiome extends AuroraprojectsModElements.ModElement {
	public static Biome biome;
	public DesertMillenusBiome(AuroraprojectsModElements instance) {
		super(instance, 35);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}
	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-13434880).setWaterColor(-13282725).setWaterFogColor(-13282725)
						.withSkyColor(-13434880).withFoliageColor(-9803191).withGrassColor(-9803191).build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder()
						.withSurfaceBuilder(SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(GrassMillenusBlock.block.getDefaultState(),
								DirtMillenusBlock.block.getDefaultState(), DirtMillenusBlock.block.getDefaultState())));
				DefaultBiomeFeatures.withCavesAndCanyons(biomeGenerationSettings);
				DefaultBiomeFeatures.withOverworldOres(biomeGenerationSettings);
				DefaultBiomeFeatures.withFrozenTopLayer(biomeGenerationSettings);
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				biome = new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.NONE).depth(0.1f).scale(0.2f).temperature(0.5f)
						.downfall(0.5f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("auroraprojects:desert_millenus"));
			}
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
	}
}
