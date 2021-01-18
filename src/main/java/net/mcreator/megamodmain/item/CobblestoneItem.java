
package net.mcreator.megamodmain.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.megamodmain.MegamodmainModElements;

@MegamodmainModElements.ModElement.Tag
public class CobblestoneItem extends MegamodmainModElements.ModElement {
	@ObjectHolder("megamodmain:cobblestone_helmet")
	public static final Item helmet = null;
	@ObjectHolder("megamodmain:cobblestone_chestplate")
	public static final Item body = null;
	@ObjectHolder("megamodmain:cobblestone_leggings")
	public static final Item legs = null;
	@ObjectHolder("megamodmain:cobblestone_boots")
	public static final Item boots = null;
	public CobblestoneItem(MegamodmainModElements instance) {
		super(instance, 128);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{1, 2, 2, 1}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 1;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall"));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.OAK_PLANKS, (int) (1)), new ItemStack(Blocks.SPRUCE_PLANKS, (int) (1)),
						new ItemStack(Blocks.BIRCH_PLANKS, (int) (1)), new ItemStack(Blocks.JUNGLE_PLANKS, (int) (1)),
						new ItemStack(Blocks.ACACIA_PLANKS, (int) (1)), new ItemStack(Blocks.DARK_OAK_PLANKS, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "cobblestone";
			}

			public float getToughness() {
				return 0.5f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "megamodmain:textures/models/armor/cobble__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("cobblestone_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "megamodmain:textures/models/armor/cobble__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("cobblestone_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "megamodmain:textures/models/armor/cobble__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("cobblestone_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "megamodmain:textures/models/armor/cobble__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("cobblestone_boots"));
	}
}
