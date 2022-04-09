// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeleyeee extends EntityModel<Entity> {
	private final ModelRenderer Eye;

	public Modeleyeee() {
		textureWidth = 16;
		textureHeight = 16;

		Eye = new ModelRenderer(this);
		Eye.setRotationPoint(0.0F, 24.0F, 0.0F);
		Eye.setTextureOffset(0, 0).addBox(-6.0F, -7.0F, -1.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Eye.setTextureOffset(0, 0).addBox(-2.0F, -6.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Eye.setTextureOffset(0, 0).addBox(2.0F, -9.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Eye.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Eye.setTextureOffset(0, 0).addBox(2.0F, -2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Eye.setTextureOffset(0, 14).addBox(0.0F, -2.0F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		Eye.setTextureOffset(0, 0).addBox(-4.0F, -3.0F, -1.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		Eye.setTextureOffset(0, 0).addBox(-5.0F, -3.0F, -1.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Eye.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Eye.setTextureOffset(0, 0).addBox(-6.0F, -3.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Eye.setTextureOffset(14, 15).addBox(3.0F, -5.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Eye.setTextureOffset(0, 0).addBox(3.0F, -5.0F, 4.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		Eye.setTextureOffset(0, 0).addBox(6.0F, -5.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Eye.setTextureOffset(0, 0).addBox(6.0F, -5.0F, 3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Eye.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}