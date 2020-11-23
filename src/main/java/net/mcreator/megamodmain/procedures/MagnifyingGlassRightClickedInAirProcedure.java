package net.mcreator.megamodmain.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.megamodmain.MegamodmainModElements;

import java.util.Map;

@MegamodmainModElements.ModElement.Tag
public class MagnifyingGlassRightClickedInAirProcedure extends MegamodmainModElements.ModElement {
	public MagnifyingGlassRightClickedInAirProcedure(MegamodmainModElements instance) {
		super(instance, 45);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure MagnifyingGlassRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 5, (int) 9, (false), (false)));
	}
}
