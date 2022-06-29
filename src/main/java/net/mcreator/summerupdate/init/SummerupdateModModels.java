
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.summerupdate.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.summerupdate.client.model.Modelsnorkels;
import net.mcreator.summerupdate.client.model.Modelfins;
import net.mcreator.summerupdate.client.model.Modelcrab;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SummerupdateModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelfins.LAYER_LOCATION, Modelfins::createBodyLayer);
		event.registerLayerDefinition(Modelsnorkels.LAYER_LOCATION, Modelsnorkels::createBodyLayer);
		event.registerLayerDefinition(Modelcrab.LAYER_LOCATION, Modelcrab::createBodyLayer);
	}
}
