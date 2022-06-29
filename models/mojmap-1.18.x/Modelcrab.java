// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcrab<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "crab"), "main");
	private final ModelPart Head;
	private final ModelPart Head2;
	private final ModelPart Body;
	private final ModelPart Right_arm;
	private final ModelPart Left_arm;
	private final ModelPart Right_hand;
	private final ModelPart Left_hand;
	private final ModelPart Right_1leg;
	private final ModelPart Right_2leg;
	private final ModelPart Right_3leg;
	private final ModelPart Left_1leg;
	private final ModelPart Left_2leg;
	private final ModelPart Left_3leg;

	public Modelcrab(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Head2 = root.getChild("Head2");
		this.Body = root.getChild("Body");
		this.Right_arm = root.getChild("Right_arm");
		this.Left_arm = root.getChild("Left_arm");
		this.Right_hand = root.getChild("Right_hand");
		this.Left_hand = root.getChild("Left_hand");
		this.Right_1leg = root.getChild("Right_1leg");
		this.Right_2leg = root.getChild("Right_2leg");
		this.Right_3leg = root.getChild("Right_3leg");
		this.Left_1leg = root.getChild("Left_1leg");
		this.Left_2leg = root.getChild("Left_2leg");
		this.Left_3leg = root.getChild("Left_3leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 18.0F, -4.3F));

		PartDefinition Right_eye_r1 = Head
				.addOrReplaceChild("Right_eye_r1",
						CubeListBuilder.create().texOffs(0, 20).addBox(-1.8F, -8.5F, -4.8F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 6.0F, 4.3F, 0.0F, 0.0F, -0.1309F));

		PartDefinition Head2 = partdefinition.addOrReplaceChild("Head2", CubeListBuilder.create(),
				PartPose.offset(2.0F, 18.0F, -4.3F));

		PartDefinition Left_eye_r1 = Head2
				.addOrReplaceChild("Left_eye_r1",
						CubeListBuilder.create().texOffs(0, 13).addBox(0.8F, -8.5F, -4.8F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-2.0F, 6.0F, 4.3F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -2.0F, -4.5F, 8.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, -0.5F));

		PartDefinition Right_arm = partdefinition.addOrReplaceChild("Right_arm", CubeListBuilder.create().texOffs(9, 20)
				.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.2F, 20.2F, -5.5F));

		PartDefinition Left_arm = partdefinition.addOrReplaceChild("Left_arm", CubeListBuilder.create().texOffs(9, 13)
				.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.2F, 20.2F, -5.5F));

		PartDefinition Right_hand = partdefinition.addOrReplaceChild("Right_hand", CubeListBuilder.create(),
				PartPose.offset(-4.6F, 20.6F, -6.2F));

		PartDefinition Right_downerhand_r1 = Right_hand.addOrReplaceChild("Right_downerhand_r1",
				CubeListBuilder.create().texOffs(14, 13).addBox(-8.81F, -3.5F, -3.1F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6F, 3.4F, 6.2F, 0.2182F, -1.0036F, 0.1745F));

		PartDefinition Right_upperhand_r1 = Right_hand.addOrReplaceChild("Right_upperhand_r1",
				CubeListBuilder.create().texOffs(0, 20).addBox(-8.8F, -4.5F, -3.8F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6F, 3.4F, 6.2F, 0.0F, -1.0036F, 0.1745F));

		PartDefinition Left_hand = partdefinition.addOrReplaceChild("Left_hand", CubeListBuilder.create(),
				PartPose.offset(5.0F, 20.0F, -6.5F));

		PartDefinition Left_upperhand_r1 = Left_hand.addOrReplaceChild(
				"Left_upperhand_r1", CubeListBuilder.create().texOffs(14, 20).addBox(6.2F, -5.5F, -6.2F, 2.0F, 2.0F,
						5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 4.0F, 6.5F, 0.0F, 0.7418F, 0.0F));

		PartDefinition Left_downerhand_r1 = Left_hand.addOrReplaceChild("Left_downerhand_r1",
				CubeListBuilder.create().texOffs(0, 13).addBox(6.21F, -4.5F, -6.0F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 4.0F, 6.5F, 0.0436F, 0.7418F, 0.0F));

		PartDefinition Right_1leg = partdefinition.addOrReplaceChild("Right_1leg", CubeListBuilder.create(),
				PartPose.offset(-4.5F, 21.1F, -2.8F));

		PartDefinition Right_1leg_r1 = Right_1leg.addOrReplaceChild("Right_1leg_r1",
				CubeListBuilder.create().texOffs(25, 0).addBox(-6.0F, -3.0F, -3.5F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 2.9F, 2.8F, -0.2182F, -0.1309F, 0.0873F));

		PartDefinition Right_2leg = partdefinition.addOrReplaceChild("Right_2leg", CubeListBuilder.create(),
				PartPose.offset(-4.8F, 21.0F, 0.0F));

		PartDefinition Right_2leg_r1 = Right_2leg
				.addOrReplaceChild("Right_2leg_r1",
						CubeListBuilder.create().texOffs(26, 25).addBox(-6.0F, -3.5F, -1.0F, 2.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(4.8F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition Right_3leg = partdefinition.addOrReplaceChild("Right_3leg", CubeListBuilder.create(),
				PartPose.offset(-5.2F, 21.0F, 3.2F));

		PartDefinition Right_3leg_r1 = Right_3leg.addOrReplaceChild("Right_3leg_r1",
				CubeListBuilder.create().texOffs(8, 27).addBox(-5.0F, -2.5F, 4.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2F, 3.0F, -3.2F, 0.3054F, -0.3054F, 0.0F));

		PartDefinition Left_1leg = partdefinition.addOrReplaceChild("Left_1leg", CubeListBuilder.create(),
				PartPose.offset(4.5F, 21.0F, -3.0F));

		PartDefinition Left_1leg_r1 = Left_1leg.addOrReplaceChild("Left_1leg_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.9831F, -0.9184F, -0.8579F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.1309F, -0.0873F));

		PartDefinition Left_2leg = partdefinition.addOrReplaceChild("Left_2leg", CubeListBuilder.create(),
				PartPose.offset(4.9F, 21.0F, 0.0F));

		PartDefinition Left_2leg_r1 = Left_2leg.addOrReplaceChild("Left_2leg_r1",
				CubeListBuilder.create().texOffs(26, 18).addBox(-0.9498F, -0.9301F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Left_3leg = partdefinition.addOrReplaceChild("Left_3leg", CubeListBuilder.create(),
				PartPose.offset(5.2F, 21.0F, 3.2F));

		PartDefinition Left_3leg_r1 = Left_3leg.addOrReplaceChild("Left_3leg_r1",
				CubeListBuilder.create().texOffs(0, 27).addBox(3.0F, -2.5F, 4.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2F, 3.0F, -3.2F, 0.3054F, 0.3054F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right_hand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left_hand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right_1leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right_2leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right_3leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left_1leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left_2leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left_3leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Right_3leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Right_2leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Head2.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head2.xRot = headPitch / (180F / (float) Math.PI);
		this.Left_3leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Left_2leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Right_1leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Left_1leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}