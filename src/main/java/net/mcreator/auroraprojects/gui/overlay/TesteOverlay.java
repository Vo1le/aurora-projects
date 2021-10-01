
package net.mcreator.auroraprojects.gui.overlay;

@Mod.EventBusSubscriber
public class TesteOverlay {

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void eventHandler(GuiScreenEvent.DrawScreenEvent.Post event) {
		if (event.getGui() instanceof ServerListScreen) {
			int w = event.getGui().width;
			int h = event.getGui().height;

			int posX = w / 2;
			int posY = h / 2;

			World _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;

			PlayerEntity entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.world;
				_x = entity.getPosX();
				_y = entity.getPosY();
				_z = entity.getPosZ();
			}

			World world = _world;
			double x = _x;
			double y = _y;
			double z = _z;

			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.disableAlphaTest();

			if (true) {

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("auroraprojects:textures/testeoverlay.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -196, posY + -171, 0, 0, 360, 360, 360, 360);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("auroraprojects:textures/testeoverlay2.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 126, posY + -197, 0, 0, 360, 360, 360, 360);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("auroraprojects:textures/testeoverlay2.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -471, posY + -138, 0, 0, 360, 360, 360, 360);

			}

			RenderSystem.depthMask(true);
			RenderSystem.enableDepthTest();
			RenderSystem.enableAlphaTest();
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}

}
