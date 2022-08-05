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

import net.mcreator.auroraprojects.entity.BzeltEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BzeltRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BzeltEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbzelt(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("auroraprojects:textures/texturebzelt.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelbzelt extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer L_Arm;
		private final ModelRenderer R_Arm;
		private final ModelRenderer Body;
		private final ModelRenderer R_Leg;
		private final ModelRenderer L_Leg;

		public Modelbzelt() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -12.0F, -6.0F);
			Head.setTextureOffset(36, 34).addBox(-6.0F, 8.0F, -7.0F, 12.0F, 4.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(46, 0).addBox(-6.0F, 3.0F, -7.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(46, 0).addBox(4.0F, 3.0F, -7.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(29, 46).addBox(-5.0F, -2.0F, -6.0F, 10.0F, 10.0F, 7.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(5.0F, 0.0F, 6.0F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3927F);
			cube_r1.setTextureOffset(52, 71).addBox(0.0F, 0.0F, -11.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-5.0F, 0.0F, 6.0F);
			Head.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3927F);
			cube_r2.setTextureOffset(52, 71).addBox(-0.9239F, -0.3827F, -11.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);
			L_Arm = new ModelRenderer(this);
			L_Arm.setRotationPoint(9.0F, -18.0F, 0.0F);
			L_Arm.setTextureOffset(32, 63).addBox(0.0F, 5.0F, -3.0F, 5.0F, 11.0F, 5.0F, 0.0F, false);
			L_Arm.setTextureOffset(56, 0).addBox(-1.0F, 16.0F, -4.0F, 7.0F, 10.0F, 7.0F, 0.0F, false);
			L_Arm.setTextureOffset(0, 34).addBox(-2.0F, 26.0F, -5.0F, 9.0F, 10.0F, 9.0F, 0.0F, false);
			L_Arm.setTextureOffset(63, 46).addBox(0.0F, 0.0F, -3.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			L_Arm.setTextureOffset(27, 34).addBox(0.0F, 3.0F, -2.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
			R_Arm = new ModelRenderer(this);
			R_Arm.setRotationPoint(-9.0F, -18.0F, 0.0F);
			R_Arm.setTextureOffset(63, 46).addBox(-5.0F, 0.0F, -3.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			R_Arm.setTextureOffset(27, 34).addBox(-4.0F, 3.0F, -2.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
			R_Arm.setTextureOffset(32, 63).addBox(-5.0F, 5.0F, -3.0F, 5.0F, 11.0F, 5.0F, 0.0F, false);
			R_Arm.setTextureOffset(56, 0).addBox(-6.0F, 16.0F, -4.0F, 7.0F, 10.0F, 7.0F, 0.0F, false);
			R_Arm.setTextureOffset(0, 34).addBox(-7.0F, 26.0F, -5.0F, 9.0F, 10.0F, 9.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(-5.0F, 24.0F, -1.0F);
			Body.setTextureOffset(0, 0).addBox(-4.0F, -42.0F, -4.0F, 18.0F, 24.0F, 10.0F, 0.0F, false);
			Body.setTextureOffset(0, 34).addBox(9.0F, -48.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(0, 53).addBox(5.0F, -47.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(56, 46).addBox(3.0F, -45.0F, -3.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(0, 0).addBox(2.0F, -49.0F, 3.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(54, 0).addBox(-1.0F, -46.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(0, 34).addBox(-3.0F, -48.0F, 2.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			R_Leg = new ModelRenderer(this);
			R_Leg.setRotationPoint(0.0F, 6.0F, 0.0F);
			R_Leg.setTextureOffset(56, 17).addBox(-8.0F, 0.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);
			R_Leg.setTextureOffset(0, 55).addBox(-9.0F, 8.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
			L_Leg = new ModelRenderer(this);
			L_Leg.setRotationPoint(0.0F, 6.0F, 0.0F);
			L_Leg.setTextureOffset(57, 57).addBox(2.0F, 0.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);
			L_Leg.setTextureOffset(0, 55).addBox(1.0F, 8.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			L_Arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			R_Arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			R_Leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			L_Leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.R_Arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.L_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.L_Arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.R_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
