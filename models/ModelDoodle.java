// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelDoodle extends EntityModel<Entity> {
	private final ModelRenderer Primary;
	private final ModelRenderer bone7;
	private final ModelRenderer bone6;
	private final ModelRenderer bone5;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer bone8;

	public ModelDoodle() {
		textureWidth = 32;
		textureHeight = 32;

		Primary = new ModelRenderer(this);
		Primary.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(Primary, 1.5708F, 0.0F, 3.1416F);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(3.0F, -13.0F, 18.0F);
		Primary.addChild(bone7);
		bone7.setTextureOffset(11, 0).addBox(-2.0F, 9.0F, -23.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(4, 0).addBox(-2.0F, 9.0F, -22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, -13.0F, 18.0F);
		Primary.addChild(bone6);
		bone6.setTextureOffset(12, 8).addBox(-2.0F, 9.0F, -23.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(12, 10).addBox(-2.0F, 9.0F, -22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -24.0F, 18.0F);
		Primary.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.0F);
		bone5.setTextureOffset(16, 7).addBox(-1.0F, 16.0F, -22.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(16, 16).addBox(0.0F, 16.0F, -23.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(4, 15).addBox(-1.0F, 16.0F, -23.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(12, 12).addBox(0.0F, 16.0F, -22.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-2.0F, -19.0F, 18.0F);
		Primary.addChild(bone4);
		bone4.setTextureOffset(12, 19).addBox(-1.0F, 16.0F, -22.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(6, 21).addBox(-1.0F, 16.0F, -23.0F, 0.0F, 6.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(8, 18).addBox(0.0F, 16.0F, -23.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(17, 0).addBox(0.0F, 16.0F, -22.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.0F, -19.0F, 18.0F);
		Primary.addChild(bone3);
		bone3.setTextureOffset(20, 13).addBox(-1.0F, 16.0F, -22.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(16, 22).addBox(1.0F, 16.0F, -23.0F, 0.0F, 6.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(20, 6).addBox(-1.0F, 16.0F, -23.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(20, 20).addBox(0.0F, 16.0F, -22.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -17.0F, 16.0F);
		Primary.addChild(bone2);
		bone2.setTextureOffset(4, 4).addBox(-1.0F, 14.0F, -22.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(0, 11).addBox(-1.0F, 15.0F, -23.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(8, 8).addBox(0.0F, 15.0F, -23.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(0, 0).addBox(0.0F, 14.0F, -22.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -19.0F, 20.0F);
		Primary.addChild(bone);
		bone.setTextureOffset(0, 21).addBox(-1.0F, 20.0F, -22.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(24, 4).addBox(-1.0F, 19.0F, -23.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(24, 24).addBox(0.0F, 19.0F, -23.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(21, 0).addBox(0.0F, 20.0F, -22.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(11, 3).addBox(-1.0F, 20.0F, -25.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(7, 0).addBox(0.0F, 20.0F, -25.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -1.0F, 0.0F);
		Primary.addChild(bone8);
		bone8.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone8.setTextureOffset(0, 0).addBox(-1.0F, -6.0F, -2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone8.setTextureOffset(0, 0).addBox(-1.0F, -5.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Primary.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}