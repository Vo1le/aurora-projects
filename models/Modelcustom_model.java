// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends ModelBase {
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
		Body.cubeList.add(new ModelBox(Body, 0, 24, -8.0F, -15.0F, -4.0F, 16, 6, 8, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -9.0F, -28.0F, -5.0F, 18, 13, 11, 0.0F, false));

		LeftArme = new ModelRenderer(this);
		LeftArme.setRotationPoint(0.0F, 24.0F, 0.0F);
		LeftArme.cubeList.add(new ModelBox(LeftArme, 18, 53, 9.0F, -26.0F, -2.0F, 5, 8, 4, 0.0F, false));
		LeftArme.cubeList.add(new ModelBox(LeftArme, 43, 49, 11.0F, -18.0F, -2.0F, 4, 8, 5, 0.0F, false));
		LeftArme.cubeList.add(new ModelBox(LeftArme, 0, 6, 14.0F, -10.0F, 1.0F, 1, 3, 2, 0.0F, false));
		LeftArme.cubeList.add(new ModelBox(LeftArme, 0, 24, 14.0F, -10.0F, -2.0F, 1, 3, 2, 0.0F, false));
		LeftArme.cubeList.add(new ModelBox(LeftArme, 6, 0, 11.0F, -10.0F, -2.0F, 1, 2, 1, 0.0F, false));

		RightArme = new ModelRenderer(this);
		RightArme.setRotationPoint(0.0F, 24.0F, 0.0F);
		RightArme.cubeList.add(new ModelBox(RightArme, 0, 53, -14.0F, -26.0F, -2.0F, 5, 8, 4, 0.0F, false));
		RightArme.cubeList.add(new ModelBox(RightArme, 48, 36, -15.0F, -18.0F, -2.0F, 4, 8, 5, 0.0F, false));
		RightArme.cubeList.add(new ModelBox(RightArme, 0, 0, -15.0F, -10.0F, 1.0F, 1, 3, 2, 0.0F, false));
		RightArme.cubeList.add(new ModelBox(RightArme, 4, 3, -15.0F, -10.0F, -2.0F, 1, 3, 2, 0.0F, false));
		RightArme.cubeList.add(new ModelBox(RightArme, 6, 8, -12.0F, -10.0F, -2.0F, 1, 2, 1, 0.0F, false));

		LeftLag = new ModelRenderer(this);
		LeftLag.setRotationPoint(0.0F, 24.0F, 0.0F);
		LeftLag.cubeList.add(new ModelBox(LeftLag, 24, 38, 4.0F, -9.0F, -3.0F, 6, 9, 6, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 38, -10.0F, -9.0F, -3.0F, 6, 9, 6, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 48, 24, -4.0F, -27.0F, -9.0F, 8, 8, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		LeftArme.render(f5);
		RightArme.render(f5);
		LeftLag.render(f5);
		RightLeg.render(f5);
		Head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.LeftLag.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}