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
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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