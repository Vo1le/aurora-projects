package net.mcreator.auroraprojects.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.auroraprojects.entity.BlueEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BlueRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BlueEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelblue(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("auroraprojects:textures/texturemob.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("auroraprojects:textures/texturemob.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.1.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelblue extends EntityModel<Entity> {
		private final ModelRenderer body2;
		private final ModelRenderer head2;
		private final ModelRenderer leftleg4;
		private final ModelRenderer leftleg3;
		private final ModelRenderer rightleg4;
		private final ModelRenderer cube_r1;
		private final ModelRenderer rightleg3;

		public Modelblue() {
			textureWidth = 64;
			textureHeight = 64;
			body2 = new ModelRenderer(this);
			body2.setRotationPoint(0.0F, 20.0F, 0.0F);
			body2.setTextureOffset(32, 25).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);
			head2 = new ModelRenderer(this);
			head2.setRotationPoint(0.0F, 15.0F, 0.0F);
			head2.setTextureOffset(0, 25).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
			head2.setTextureOffset(0, 0).addBox(-6.0F, -18.0F, -6.0F, 12.0F, 13.0F, 12.0F, 0.0F, false);
			leftleg4 = new ModelRenderer(this);
			leftleg4.setRotationPoint(3.0F, 19.0F, -3.0F);
			leftleg4.setTextureOffset(28, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			leftleg3 = new ModelRenderer(this);
			leftleg3.setRotationPoint(3.0F, 19.0F, 3.0F);
			leftleg3.setTextureOffset(28, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			rightleg4 = new ModelRenderer(this);
			rightleg4.setRotationPoint(-3.0F, 19.0F, -3.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			rightleg4.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
			cube_r1.setTextureOffset(28, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			rightleg3 = new ModelRenderer(this);
			rightleg3.setRotationPoint(-3.0F, 19.0F, 3.0F);
			rightleg3.setTextureOffset(28, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body2.render(matrixStack, buffer, packedLight, packedOverlay);
			head2.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg4.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg3.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg4.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg3.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}
