
package net.mcreator.summerupdate.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.summerupdate.entity.CrabEntity;
import net.mcreator.summerupdate.client.model.Modelcrab;

public class CrabRenderer extends MobRenderer<CrabEntity, Modelcrab<CrabEntity>> {
	public CrabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrab(context.bakeLayer(Modelcrab.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrabEntity entity) {
		return new ResourceLocation("summerupdate:textures/crab.png");
	}
}
