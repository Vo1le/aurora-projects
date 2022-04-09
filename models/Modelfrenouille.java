// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfrenouille extends EntityModel<Entity> {
	private final ModelRenderer venraculaire;
	private final ModelRenderer bone;

	public Modelfrenouille() {
		textureWidth = 16;
		textureHeight = 16;

		venraculaire = new ModelRenderer(this);
		venraculaire.setRotationPoint(-8.0F, 16.0F, 8.0F);
		venraculaire.setTextureOffset(0, 0).addBox(7.0F, 5.0F, -11.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		venraculaire.setTextureOffset(0, 0).addBox(8.0F, 3.0F, -8.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(0.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(0.0F, -5.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(10, 8).addBox(1.0F, -4.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(5, 8).addBox(-2.0F, -4.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		venraculaire.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}