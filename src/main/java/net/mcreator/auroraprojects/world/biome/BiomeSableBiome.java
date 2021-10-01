
package net.mcreator.auroraprojects.world.biome;

import net.minecraft.block.material.Material;
import java.util.ArrayList;
import java.util.HashMap;

@AuroraprojectsModElements.ModElement.Tag
public class BiomeSableBiome extends AuroraprojectsModElements.ModElement {

	public static Biome biome;

	public BiomeSableBiome(AuroraprojectsModElements instance) {
		super(instance, 14);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}

	private static class BiomeRegisterHandler {

		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-3292541).setWaterColor(4159204).setWaterFogColor(329011)
						.withSkyColor(-3292541).withFoliageColor(10387789).withGrassColor(9470285).build();

				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder()
						.withSurfaceBuilder(SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(SableModdeBlock.block.getDefaultState(),
								SableModdeBlock.block.getDefaultState(), SableModdeBlock.block.getDefaultState())));

				DefaultBiomeFeatures.withFrozenTopLayer(biomeGenerationSettings);

				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();

				biome = new Biome.Builder().precipitation(Biome.RainType.NONE).category(Biome.Category.DESERT).depth(0.1f).scale(0.2f).temperature(2f)
						.downfall(0f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();

				event.getRegistry().register(biome.setRegistryName("auroraprojects:biome_sable"));
			}
		}

	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BiomeManager.addBiome(BiomeManager.BiomeType.DESERT,
				new BiomeManager.BiomeEntry(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, WorldGenRegistries.BIOME.getKey(biome)), 1024));
	}

}
