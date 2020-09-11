package net.mcreator.megamodmain.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.megamodmain.MegamodmainModElements;

import java.util.Map;
import java.util.Collection;

@MegamodmainModElements.ModElement.Tag
public class HeartFlowerMobplayerCollidesWithPlantProcedure extends MegamodmainModElements.ModElement {
	public HeartFlowerMobplayerCollidesWithPlantProcedure(MegamodmainModElements instance) {
		super(instance, 63);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HeartFlowerMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!(new Object() {
			boolean check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.REGENERATION)
							return true;
					}
				}
				return false;
			}
		}.check((LivingEntity) entity)))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 60, (int) 2, (false), (true)));
		}
	}
}
