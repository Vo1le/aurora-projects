
package net.mcreator.auroraprojects.gui;

import net.mcreator.auroraprojects.AuroraprojectsMod;

@OnlyIn(Dist.CLIENT)
public class TeleporteurMillenusGUIGuiWindow extends ContainerScreen<TeleporteurMillenusGUIGui.GuiContainerMod> {

	private World world;
	private int x, y, z;
	private PlayerEntity entity;

	private final static HashMap guistate = TeleporteurMillenusGUIGui.guistate;

	public TeleporteurMillenusGUIGuiWindow(TeleporteurMillenusGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("auroraprojects:textures/teleporteur_millenus_gui.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);

	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("auroraprojects:textures/pppppp-convertimage_1.png"));
		this.blit(ms, this.guiLeft + -5, this.guiTop + 0, 0, 0, 204, 20, 204, 20);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Mill\u00E8nus", 0, 3, -16776961);
		this.font.drawString(ms, "Se teleporter vers Mill\u00E8nus", 5, 21, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);

		this.addButton(new Button(this.guiLeft + 48, this.guiTop + 42, 75, 20, new StringTextComponent("Teleporter"), e -> {
			if (true) {
				AuroraprojectsMod.PACKET_HANDLER.sendToServer(new TeleporteurMillenusGUIGui.ButtonPressedMessage(0, x, y, z));
				TeleporteurMillenusGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}

}
