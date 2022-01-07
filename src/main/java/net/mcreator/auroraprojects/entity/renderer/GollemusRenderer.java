package net.mcreator.auroraprojects.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.auroraprojects.entity.GollemusEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GollemusRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GollemusEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("auroraprojects:textures/mob.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer LeftArme;
		private final ModelRenderer RightArme;
		private final ModelRenderer LeftLag;
		private final ModelRenderer RightLeg;
		private final ModelRenderer Head;

		public Modelcustom_model() {
			textureWidth = 128;
			textureHeight = 128;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(Body, 0, 24, -8.0F, -15.0F, -4.0F, 16, 6, 8, 0.0F, false);
			addBoxHelper(Body, 0, 0, -9.0F, -28.0F, -5.0F, 18, 13, 11, 0.0F, false);
			LeftArme = new ModelRenderer(this);
			LeftArme.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(LeftArme, 18, 53, 9.0F, -26.0F, -2.0F, 5, 8, 4, 0.0F, false);
			addBoxHelper(LeftArme, 43, 49, 11.0F, -18.0F, -2.0F, 4, 8, 5, 0.0F, false);
			addBoxHelper(LeftArme, 0, 6, 14.0F, -10.0F, 1.0F, 1, 3, 2, 0.0F, false);
			addBoxHelper(LeftArme, 0, 24, 14.0F, -10.0F, -2.0F, 1, 3, 2, 0.0F, false);
			addBoxHelper(LeftArme, 6, 0, 11.0F, -10.0F, -2.0F, 1, 2, 1, 0.0F, false);
			RightArme = new ModelRenderer(this);
			RightArme.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(RightArme, 0, 53, -14.0F, -26.0F, -2.0F, 5, 8, 4, 0.0F, false);
			addBoxHelper(RightArme, 48, 36, -15.0F, -18.0F, -2.0F, 4, 8, 5, 0.0F, false);
			addBoxHelper(RightArme, 0, 0, -15.0F, -10.0F, 1.0F, 1, 3, 2, 0.0F, false);
			addBoxHelper(RightArme, 4, 3, -15.0F, -10.0F, -2.0F, 1, 3, 2, 0.0F, false);
			addBoxHelper(RightArme, 6, 8, -12.0F, -10.0F, -2.0F, 1, 2, 1, 0.0F, false);
			LeftLag = new ModelRenderer(this);
			LeftLag.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(LeftLag, 24, 38, 4.0F, -9.0F, -3.0F, 6, 9, 6, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(RightLeg, 0, 38, -10.0F, -9.0F, -3.0F, 6, 9, 6, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(Head, 48, 24, -4.0F, -27.0F, -9.0F, 8, 8, 4, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			Body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			LeftArme.render(ms, vb, i1, i2, f1, f2, f3, f4);
			RightArme.render(ms, vb, i1, i2, f1, f2, f3, f4);
			LeftLag.render(ms, vb, i1, i2, f1, f2, f3, f4);
			RightLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			Head.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.LeftLag.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta) {
		addBoxHelper(renderer, texU, texV, x, y, z, dx, dy, dz, delta, renderer.mirror);
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta,
			boolean mirror) {
		renderer.mirror = mirror;
		renderer.addBox("", x, y, z, dx, dy, dz, delta, texU, texV);
	}
}
