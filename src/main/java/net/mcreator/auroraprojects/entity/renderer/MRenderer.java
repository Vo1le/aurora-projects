package net.mcreator.auroraprojects.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.auroraprojects.entity.MEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("auroraprojects:textures/texture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer cotarrire;
		private final ModelRenderer cube_r1;
		private final ModelRenderer aile;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer bone;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cotarrire2;
		private final ModelRenderer cube_r7;
		private final ModelRenderer aile2;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer bone2;
		private final ModelRenderer cube_r12;
		private final ModelRenderer bone3;
		private final ModelRenderer cube_r13;
		private final ModelRenderer bone4;
		private final ModelRenderer cube_r14;
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer cube_r19;
		private final ModelRenderer cube_r20;
		private final ModelRenderer cube_r21;
		private final ModelRenderer cube_r22;
		private final ModelRenderer cube_r23;
		private final ModelRenderer cube_r24;
		public Modelcustom_model() {
			textureWidth = 256;
			textureHeight = 256;
			cotarrire = new ModelRenderer(this);
			cotarrire.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			cotarrire.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5272F);
			cube_r1.setTextureOffset(22, 62).addBox(-9.0F, -10.0F, 28.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 62).addBox(-11.0F, -10.0F, 27.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 42).addBox(-13.0F, -10.0F, 26.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 25).addBox(-15.0F, -10.0F, 25.0F, 9.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(60, 46).addBox(-17.0F, -10.0F, 24.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(72, 2).addBox(-19.0F, -10.0F, 23.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(72, 42).addBox(-22.0F, -10.0F, 22.0F, 17.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(72, 38).addBox(-24.0F, -10.0F, 21.0F, 20.0F, 1.0F, 1.0F, 0.0F, false);
			aile = new ModelRenderer(this);
			aile.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			aile.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -3.1416F);
			cube_r2.setTextureOffset(147, 24).addBox(-18.0F, 0.0F, -1.0F, 10.0F, 1.0F, 22.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			aile.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, 2.7489F);
			cube_r3.setTextureOffset(0, 166).addBox(-22.0F, -7.0F, -1.0F, 6.0F, 1.0F, 22.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			aile.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, 1.2217F);
			cube_r4.setTextureOffset(164, 128).addBox(-1.0F, -23.0F, -1.0F, 7.0F, 1.0F, 22.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			aile.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, 0.3927F);
			cube_r5.setTextureOffset(90, 154).addBox(8.0F, -16.0F, -1.0F, 8.0F, 1.0F, 22.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, 1.5272F);
			cube_r6.setTextureOffset(10, 62).addBox(-3.0F, -23.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(60, 51).addBox(-6.0F, -22.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(0, 38).addBox(-7.0F, -21.0F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(0, 15).addBox(-8.0F, -20.0F, -1.0F, 8.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(24, 51).addBox(-9.0F, -18.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(0, 53).addBox(-11.0F, -15.0F, -1.0F, 11.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(14, 35).addBox(-14.0F, -14.0F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(60, 53).addBox(-17.0F, -13.0F, -1.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(13, 43).addBox(-19.0F, -12.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(60, 48).addBox(-22.0F, -11.0F, -1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			cotarrire2 = new ModelRenderer(this);
			cotarrire2.setRotationPoint(-17.0F, 24.0F, 0.0F);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			cotarrire2.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, 1.5272F);
			cube_r7.setTextureOffset(16, 62).addBox(-9.0F, -10.0F, 28.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(60, 60).addBox(-11.0F, -10.0F, 27.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(0, 40).addBox(-13.0F, -10.0F, 26.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(0, 23).addBox(-15.0F, -10.0F, 25.0F, 9.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(0, 60).addBox(-17.0F, -10.0F, 24.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(72, 0).addBox(-19.0F, -10.0F, 23.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(72, 40).addBox(-22.0F, -10.0F, 22.0F, 17.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(72, 36).addBox(-24.0F, -10.0F, 21.0F, 20.0F, 1.0F, 1.0F, 0.0F, false);
			aile2 = new ModelRenderer(this);
			aile2.setRotationPoint(0.0F, 24.0F, 20.0F);
			setRotationAngle(aile2, -3.1416F, 0.0F, 3.1416F);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			aile2.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, -3.1416F);
			cube_r8.setTextureOffset(142, 105).addBox(-18.0F, 0.0F, -1.0F, 10.0F, 1.0F, 22.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			aile2.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, 2.7489F);
			cube_r9.setTextureOffset(165, 0).addBox(-22.0F, -7.0F, -1.0F, 6.0F, 1.0F, 22.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			aile2.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.0F, 0.0F, 1.2217F);
			cube_r10.setTextureOffset(150, 154).addBox(-1.0F, -23.0F, -1.0F, 7.0F, 1.0F, 22.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
			aile2.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.0F, 0.0F, 0.3927F);
			cube_r11.setTextureOffset(52, 153).addBox(8.0F, -16.0F, -1.0F, 8.0F, 1.0F, 22.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(1.0F, 24.0F, 0.0F);
			setRotationAngle(bone2, -3.1416F, 0.0436F, 3.1416F);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone2.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.0F, 0.0F, 1.5272F);
			cube_r12.setTextureOffset(13, 41).addBox(-3.0F, -23.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r12.setTextureOffset(0, 35).addBox(-7.0F, -23.0F, -1.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r12.setTextureOffset(0, 33).addBox(-8.0F, -21.0F, -1.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r12.setTextureOffset(0, 9).addBox(-9.0F, -20.0F, -1.0F, 9.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r12.setTextureOffset(16, 30).addBox(-10.0F, -18.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r12.setTextureOffset(0, 46).addBox(-11.0F, -15.0F, -1.0F, 11.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r12.setTextureOffset(0, 0).addBox(-14.0F, -15.0F, -1.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r12.setTextureOffset(14, 0).addBox(-17.0F, -14.0F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r12.setTextureOffset(14, 6).addBox(-20.0F, -13.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r12.setTextureOffset(60, 58).addBox(-21.0F, -12.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r12.setTextureOffset(0, 30).addBox(-24.0F, -11.0F, -1.0F, 7.0F, 2.0F, 1.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(1.0F, 24.0F, 21.0F);
			setRotationAngle(bone3, -3.1416F, 0.0436F, 3.1416F);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone3.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.0F, 0.0F, 1.5272F);
			cube_r13.setTextureOffset(13, 41).addBox(-3.0F, -23.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r13.setTextureOffset(0, 35).addBox(-7.0F, -23.0F, -1.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r13.setTextureOffset(0, 33).addBox(-8.0F, -21.0F, -1.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r13.setTextureOffset(0, 9).addBox(-9.0F, -20.0F, -1.0F, 9.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r13.setTextureOffset(16, 30).addBox(-10.0F, -18.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r13.setTextureOffset(0, 46).addBox(-11.0F, -15.0F, -1.0F, 11.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r13.setTextureOffset(0, 0).addBox(-14.0F, -15.0F, -1.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r13.setTextureOffset(14, 0).addBox(-17.0F, -14.0F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r13.setTextureOffset(14, 6).addBox(-20.0F, -13.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r13.setTextureOffset(60, 58).addBox(-21.0F, -12.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r13.setTextureOffset(0, 30).addBox(-24.0F, -11.0F, -1.0F, 7.0F, 2.0F, 1.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, 24.0F, 21.0F);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone4.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.0F, 0.0F, 1.5272F);
			cube_r14.setTextureOffset(10, 62).addBox(-3.0F, -23.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r14.setTextureOffset(60, 51).addBox(-6.0F, -22.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r14.setTextureOffset(0, 38).addBox(-7.0F, -21.0F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r14.setTextureOffset(0, 15).addBox(-8.0F, -20.0F, -1.0F, 8.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r14.setTextureOffset(24, 51).addBox(-9.0F, -18.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r14.setTextureOffset(0, 53).addBox(-11.0F, -15.0F, -1.0F, 11.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r14.setTextureOffset(14, 35).addBox(-14.0F, -14.0F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r14.setTextureOffset(60, 53).addBox(-17.0F, -13.0F, -1.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r14.setTextureOffset(13, 43).addBox(-19.0F, -12.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r14.setTextureOffset(60, 48).addBox(-22.0F, -11.0F, -1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 118).addBox(-8.0F, -1.0F, -14.0F, 16.0F, 1.0F, 23.0F, 0.0F, false);
			bb_main.setTextureOffset(87, 106).addBox(-8.0F, -1.0F, -14.0F, 16.0F, 1.0F, 23.0F, 0.0F, false);
			bb_main.setTextureOffset(137, 82).addBox(-8.0F, -26.0F, -1.0F, 16.0F, 1.0F, 22.0F, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r15);
			setRotationAngle(cube_r15, 0.0F, 0.0F, 1.5272F);
			cube_r15.setTextureOffset(54, 46).addBox(-5.0F, 16.0F, -13.0F, 2.0F, 2.0F, 34.0F, 0.0F, false);
			cube_r15.setTextureOffset(72, 0).addBox(-8.0F, 16.0F, -13.0F, 2.0F, 2.0F, 34.0F, 0.0F, false);
			cube_r15.setTextureOffset(0, 75).addBox(-8.0F, -17.0F, -13.0F, 2.0F, 2.0F, 34.0F, 0.0F, false);
			cube_r15.setTextureOffset(38, 82).addBox(-5.0F, -17.0F, -13.0F, 2.0F, 2.0F, 34.0F, 0.0F, false);
			cube_r15.setTextureOffset(0, 23).addBox(-25.0F, -10.0F, -1.0F, 25.0F, 1.0F, 22.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r16);
			setRotationAngle(cube_r16, 0.0F, 0.0F, 1.5708F);
			cube_r16.setTextureOffset(0, 0).addBox(-25.0F, 7.0F, -1.0F, 25.0F, 1.0F, 22.0F, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r17);
			setRotationAngle(cube_r17, 0.3054F, 0.0F, 0.0F);
			cube_r17.setTextureOffset(18, 15).addBox(-5.0F, -16.0F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r17.setTextureOffset(0, 27).addBox(-4.0F, -15.0F, -6.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r17.setTextureOffset(24, 46).addBox(3.0F, -16.0F, -6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r17.setTextureOffset(0, 0).addBox(-2.0F, -15.0F, -13.0F, 3.0F, 1.0F, 8.0F, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r18);
			setRotationAngle(cube_r18, -0.2618F, 0.0F, 0.0F);
			cube_r18.setTextureOffset(92, 71).addBox(-8.0F, -8.0F, -24.0F, 16.0F, 1.0F, 8.0F, 0.0F, false);
			cube_r18.setTextureOffset(110, 24).addBox(-8.0F, -7.0F, -24.0F, 16.0F, 1.0F, 8.0F, 0.0F, false);
			cube_r18.setTextureOffset(92, 60).addBox(-8.0F, -6.0F, -26.0F, 16.0F, 1.0F, 10.0F, 0.0F, false);
			cube_r18.setTextureOffset(55, 118).addBox(-8.0F, 0.0F, -37.0F, 16.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r18.setTextureOffset(147, 47).addBox(-8.0F, 1.0F, -39.0F, 16.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r18.setTextureOffset(128, 154).addBox(-8.0F, -4.0F, -30.0F, 16.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r18.setTextureOffset(128, 161).addBox(-8.0F, -3.0F, -32.0F, 16.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r18.setTextureOffset(128, 168).addBox(-8.0F, -2.0F, -34.0F, 16.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r18.setTextureOffset(43, 176).addBox(-8.0F, -5.0F, -28.0F, 16.0F, 4.0F, 13.0F, 0.0F, false);
			cube_r18.setTextureOffset(0, 142).addBox(-8.0F, -1.0F, -35.0F, 16.0F, 3.0F, 21.0F, 0.0F, false);
			cube_r18.setTextureOffset(0, 46).addBox(-8.0F, 2.0F, -41.0F, 16.0F, 1.0F, 28.0F, 0.0F, false);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r19);
			setRotationAngle(cube_r19, 0.0F, 0.0F, -1.1781F);
			cube_r19.setTextureOffset(56, 130).addBox(5.0F, -18.0F, -1.0F, 16.0F, 1.0F, 22.0F, 0.0F, false);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r20);
			setRotationAngle(cube_r20, 0.0F, 0.0F, 1.1781F);
			cube_r20.setTextureOffset(110, 131).addBox(-21.0F, -18.0F, -1.0F, 16.0F, 1.0F, 22.0F, 0.0F, false);
			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r21);
			setRotationAngle(cube_r21, -2.7925F, 0.0F, 0.0F);
			cube_r21.setTextureOffset(76, 82).addBox(-9.0F, -3.0F, -30.0F, 19.0F, 1.0F, 23.0F, 0.0F, false);
			cube_r22 = new ModelRenderer(this);
			cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r22);
			setRotationAngle(cube_r22, -1.1345F, 0.0F, 0.0F);
			cube_r22.setTextureOffset(126, 60).addBox(-9.0F, -30.0F, -15.0F, 18.0F, 1.0F, 21.0F, 0.0F, false);
			cube_r23 = new ModelRenderer(this);
			cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r23);
			setRotationAngle(cube_r23, 0.5236F, 0.0F, 0.0F);
			cube_r23.setTextureOffset(92, 36).addBox(-8.0F, -23.0F, -11.0F, 16.0F, 1.0F, 23.0F, 0.0F, false);
			cube_r24 = new ModelRenderer(this);
			cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r24);
			setRotationAngle(cube_r24, 0.2618F, 0.0F, 0.0F);
			cube_r24.setTextureOffset(110, 0).addBox(-8.0F, -19.0F, -37.0F, 16.0F, 1.0F, 23.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			cotarrire.render(matrixStack, buffer, packedLight, packedOverlay);
			aile.render(matrixStack, buffer, packedLight, packedOverlay);
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
			cotarrire2.render(matrixStack, buffer, packedLight, packedOverlay);
			aile2.render(matrixStack, buffer, packedLight, packedOverlay);
			bone2.render(matrixStack, buffer, packedLight, packedOverlay);
			bone3.render(matrixStack, buffer, packedLight, packedOverlay);
			bone4.render(matrixStack, buffer, packedLight, packedOverlay);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
