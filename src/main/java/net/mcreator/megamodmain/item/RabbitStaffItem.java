
package net.mcreator.megamodmain.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.mcreator.megamodmain.procedures.RabbitStaffRightClickedInAirProcedure;
import net.mcreator.megamodmain.itemgroup.SpecialItemGroup;
import net.mcreator.megamodmain.MegamodmainModElements;

import java.util.Map;
import java.util.HashMap;

@MegamodmainModElements.ModElement.Tag
public class RabbitStaffItem extends MegamodmainModElements.ModElement {
	@ObjectHolder("megamodmain:rabbit_staff")
	public static final Item block = null;
	public RabbitStaffItem(MegamodmainModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SpecialItemGroup.tab).maxDamage(28).rarity(Rarity.EPIC));
			setRegistryName("rabbit_staff");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("itemstack", itemstack);
				RabbitStaffRightClickedInAirProcedure.executeProcedure($_dependencies);
			}
			return ar;
		}
	}
}
