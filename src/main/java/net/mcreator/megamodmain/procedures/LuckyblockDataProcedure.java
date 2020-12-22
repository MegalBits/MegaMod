package net.mcreator.megamodmain.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;

import net.mcreator.megamodmain.MegamodmainModElements;

import java.util.Map;

@MegamodmainModElements.ModElement.Tag
public class LuckyblockDataProcedure extends MegamodmainModElements.ModElement {
	public LuckyblockDataProcedure(MegamodmainModElements instance) {
		super(instance, 75);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure LuckyblockData!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure LuckyblockData!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure LuckyblockData!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure LuckyblockData!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure LuckyblockData!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() == 0)) {
			if ((Math.random() == 0)) {
				if ((Math.random() == 0)) {
					if ((Math.random() == 0)) {
						if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "scarecrowimproved"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							} else if ((Math.random() == 1)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "scarecrowimproved"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							}
						} else if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "scarecrowimproved"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							} else if ((Math.random() == 0)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "scarecrowimproved"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z),
												new PlacementSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
														.setChunk(null).setIgnoreEntities(false));
									}
								}
							}
						}
					} else if ((Math.random() == 1)) {
						if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "trap"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							} else if ((Math.random() == 0)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "trap"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							}
						} else if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "trap"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							} else if ((Math.random() == 1)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "trap"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z),
												new PlacementSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
														.setChunk(null).setIgnoreEntities(false));
									}
								}
							}
						}
					}
				} else if ((Math.random() == 1)) {
					if ((Math.random() == 1)) {
						if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "firework"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							} else if ((Math.random() == 1)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "firework"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							}
						} else if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "firework"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							} else if ((Math.random() == 0)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "trap"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							}
						}
					} else if ((Math.random() == 0)) {
						if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "lavatrap"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							} else if ((Math.random() == 0)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "lavatrap"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							}
						} else if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "lavatrap"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							} else if ((Math.random() == 1)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "lavatrap"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z),
												new PlacementSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
														.setChunk(null).setIgnoreEntities(false));
									}
								}
							}
						}
					}
				}
			} else if ((Math.random() == 1)) {
				if ((Math.random() == 1)) {
					if ((Math.random() == 1)) {
						if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								for (int index0 = 0; index0 < (int) (25); index0++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon pig");
										}
									}
								}
							} else if ((Math.random() == 1)) {
								for (int index1 = 0; index1 < (int) (25); index1++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
													"/summon minecraft:silverfish");
										}
									}
								}
							}
						} else if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								for (int index2 = 0; index2 < (int) (25); index2++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
													"/summon minecraft:silverfish");
										}
									}
								}
							} else if ((Math.random() == 0)) {
								for (int index3 = 0; index3 < (int) (25); index3++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon zombie");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "time set night");
										}
									}
								}
							}
						}
					} else if ((Math.random() == 0)) {
						if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								for (int index4 = 0; index4 < (int) (25); index4++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon zombie");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "time set night");
										}
									}
								}
							} else if ((Math.random() == 0)) {
								for (int index5 = 0; index5 < (int) (25); index5++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon zombie");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "time set night");
										}
									}
								}
							}
						} else if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								for (int index6 = 0; index6 < (int) (25); index6++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon zombie");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "time set night");
										}
									}
								}
							} else if ((Math.random() == 1)) {
								for (int index7 = 0; index7 < (int) (1); index7++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon Luckyblockitems");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
													"kill @e[type=Luckyblockitems]");
										}
									}
								}
							}
						}
					}
				} else if ((Math.random() == 0)) {
					if ((Math.random() == 0)) {
						if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								for (int index8 = 0; index8 < (int) (1); index8++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon Luckblockitems2");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
													"kill @e[type=Luckblockitems2]");
										}
									}
								}
							} else if ((Math.random() == 1)) {
								for (int index9 = 0; index9 < (int) (1); index9++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon Luckblockitems2");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
													"kill @e[type=Luckblockitems2]");
										}
									}
								}
							}
						} else if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								for (int index10 = 0; index10 < (int) (1); index10++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon Luckblockitems2");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
													"kill @e[type=Luckblockitems2]");
										}
									}
								}
							} else if ((Math.random() == 0)) {
								for (int index11 = 0; index11 < (int) (1); index11++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon Luckyblockitems");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
													"kill @e[type=Luckyblockitems]");
										}
									}
								}
							}
						}
					} else if ((Math.random() == 1)) {
						if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								for (int index12 = 0; index12 < (int) (1); index12++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon Luckyblockitems");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
													"kill @e[type=Luckyblockitems]");
										}
									}
								}
							} else if ((Math.random() == 0)) {
								for (int index13 = 0; index13 < (int) (1); index13++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon Luckyblockitems");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
													"kill @e[type=Luckyblockitems]");
										}
									}
								}
							}
						} else if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								for (int index14 = 0; index14 < (int) (1); index14++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon Luckblock");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "kill @e[type=Luckblock]");
										}
									}
								}
							} else if ((Math.random() == 1)) {
								for (int index15 = 0; index15 < (int) (1); index15++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon Luckblock");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "kill @e[type=Luckblock]");
										}
									}
								}
							}
						}
					}
				}
			}
		} else if ((Math.random() == 1)) {
			if ((Math.random() == 0)) {
				if ((Math.random() == 0)) {
					if ((Math.random() == 0)) {
						if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								for (int index16 = 0; index16 < (int) (1); index16++) {
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon Luckblock");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.world.isRemote && _ent.world.getServer() != null) {
											_ent.world.getServer().getCommandManager().handleCommand(
													_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "kill @e[type=Luckblock]");
										}
									}
								}
							} else if ((Math.random() == 1)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "deadbush1000"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							}
						} else if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "deadbush1000"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							} else if ((Math.random() == 0)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "deadbush1000"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							}
						}
					} else if ((Math.random() == 1)) {
						if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "deadbush1000"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							} else if ((Math.random() == 0)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "deadbush1000"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							}
						} else if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "plant_wither"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
							} else if ((Math.random() == 1)) {
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "setblock diamond_ore");
									}
								}
							}
						}
					}
				} else if ((Math.random() == 1)) {
					if ((Math.random() == 1)) {
						if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "setblock iron_ore");
									}
								}
							} else if ((Math.random() == 1)) {
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "setblock iron_ore");
									}
								}
							}
						} else if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "setblock iron_ore");
									}
								}
							} else if ((Math.random() == 0)) {
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "setblock bedrock");
									}
								}
							}
						}
					} else if ((Math.random() == 0)) {
						if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "setblock bedrock");
									}
								}
							} else if ((Math.random() == 0)) {
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "setblock bedrock");
									}
								}
							}
						} else if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "setblock bedrock");
									}
								}
							} else if ((Math.random() == 1)) {
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "setblock bedrock");
									}
								}
							}
						}
					}
				}
			} else if ((Math.random() == 1)) {
				if ((Math.random() == 1)) {
					if ((Math.random() == 1)) {
						if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "anviltrap"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
								if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
									world.getWorld().getServer().getCommandManager().handleCommand(
											new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
													new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
											"tp @p ~ ~ ~");
								}
								if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
									world.getWorld().getServer().getCommandManager().handleCommand(
											new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
													new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
											"setblock ~ ~4 ~ lava");
								}
							} else if ((Math.random() == 0)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "anviltrap"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
								if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
									world.getWorld().getServer().getCommandManager().handleCommand(
											new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
													new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
											"tp @p ~ ~ ~");
								}
								if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
									world.getWorld().getServer().getCommandManager().handleCommand(
											new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
													new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
											"setblock ~ ~4 ~ lava");
								}
							}
						} else if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "anviltrap"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
								if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
									world.getWorld().getServer().getCommandManager().handleCommand(
											new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
													new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
											"tp @p ~ ~ ~");
								}
								if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
									world.getWorld().getServer().getCommandManager().handleCommand(
											new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
													new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
											"setblock ~ ~4 ~ lava");
								}
							} else if ((Math.random() == 1)) {
								if (!world.getWorld().isRemote) {
									Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("megamodmain", "anviltrap"));
									if (template != null) {
										template.addBlocksToWorld(world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false));
									}
								}
								if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
									world.getWorld().getServer().getCommandManager().handleCommand(
											new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
													new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
											"tp @p ~ ~ ~");
								}
								if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
									world.getWorld().getServer().getCommandManager().handleCommand(
											new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
													new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
											"setblock ~ ~4 ~ lava");
								}
							}
						}
					} else if ((Math.random() == 0)) {
						if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.TNT.getDefaultState(), 3);
							} else if ((Math.random() == 1)) {
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.TNT.getDefaultState(), 3);
							}
						} else if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.SPAWNER.getDefaultState(), 3);
							} else if ((Math.random() == 0)) {
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.SPAWNER.getDefaultState(), 3);
							}
						}
					}
				} else if ((Math.random() == 0)) {
					if ((Math.random() == 0)) {
						if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.SPAWNER.getDefaultState(), 3);
							} else if ((Math.random() == 0)) {
								if (world instanceof World)
									world.getWorld().setDayTime((int) 1);
								if (world instanceof World)
									world.getWorld().setDayTime((int) 2);
								if (world instanceof World)
									world.getWorld().setDayTime((int) 3);
							}
						} else if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								if (world instanceof World)
									world.getWorld().setDayTime((int) 1);
								if (world instanceof World)
									world.getWorld().setDayTime((int) 2);
								if (world instanceof World)
									world.getWorld().setDayTime((int) 3);
							} else if ((Math.random() == 1)) {
								if (world instanceof World)
									world.getWorld().setDayTime((int) 1);
								if (world instanceof World)
									world.getWorld().setDayTime((int) 2);
								if (world instanceof World)
									world.getWorld().setDayTime((int) 3);
							}
						}
					} else if ((Math.random() == 1)) {
						if ((Math.random() == 0)) {
							if ((Math.random() == 0)) {
								if (world instanceof World && !world.getWorld().isRemote) {
									world.getWorld().createExplosion(null, (int) x, (int) y, (int) z, (float) 10, Explosion.Mode.BREAK);
								}
							} else if ((Math.random() == 1)) {
								if (world instanceof World && !world.getWorld().isRemote) {
									world.getWorld().createExplosion(null, (int) x, (int) y, (int) z, (float) 8, Explosion.Mode.BREAK);
								}
							}
						} else if ((Math.random() == 1)) {
							if ((Math.random() == 1)) {
								if (world instanceof World && !world.getWorld().isRemote) {
									world.getWorld().createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
								}
							} else if ((Math.random() == 0)) {
								if (world instanceof World && !world.getWorld().isRemote) {
									world.getWorld().createExplosion(null, (int) x, (int) y, (int) z, (float) 2, Explosion.Mode.BREAK);
								}
							}
						}
					}
				}
			}
		}
	}
}
