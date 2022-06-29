// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfins<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fins"), "main");
	private final ModelPart RFIN;
	private final ModelPart LFIN;

	public Modelfins(ModelPart root) {
		this.RFIN = root.getChild("RFIN");
		this.LFIN = root.getChild("LFIN");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RFIN = partdefinition.addOrReplaceChild("RFIN", CubeListBuilder.create().texOffs(0, 9)
				.addBox(-2.0F, 11.0F, -5.99F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LFIN = partdefinition.addOrReplaceChild("LFIN", CubeListBuilder.create().texOffs(0, 0).addBox(
				-2.0F, 11.0F, -5.99F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RFIN.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LFIN.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}