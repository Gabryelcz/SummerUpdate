package net.mcreator.summerupdate.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsnorkels<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("summerupdate", "modelsnorkels"), "main");
	public final ModelPart snorkles;

	public Modelsnorkels(ModelPart root) {
		this.snorkles = root.getChild("snorkles");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition snorkles = partdefinition.addOrReplaceChild("snorkles",
				CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -2.5F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.5F, 0.0F));
		PartDefinition cube_r1 = snorkles.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 2).addBox(-1.87F, -0.8F, -0.51F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, -4.5F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r2 = snorkles.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.8F, 0.35F, 0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7F, -4.35F, -4.5F, 0.0F, -0.0873F, -1.5708F));
		PartDefinition cube_r3 = snorkles.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 4).addBox(-4.0F, -1.9684F, -0.8609F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.55F, -12.4316F, -2.7891F, 0.0F, 0.0F, -1.9199F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		snorkles.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
