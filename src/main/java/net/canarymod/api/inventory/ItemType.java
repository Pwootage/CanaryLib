package net.canarymod.api.inventory;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Item Types
 *
 * @author Chris (damagefilter)
 * @author Jason (darkdiplomat)
 */
public final class ItemType {
    /* Blocks */
    public static final ItemType Air = new ItemType(0, "minecraft:air");
    public static final ItemType Stone = new ItemType(1, true, "minecraft:stone");
    public static final ItemType Grass = new ItemType(2, true, "minecraft:grass");
    public static final ItemType Dirt = new ItemType(3, true, "minecraft:dirt");
    public static final ItemType Cobble = new ItemType(4, true, "minecraft:cobblestone");
    public static final ItemType OakWood = new ItemType(5, 0, true, "minecraft:planks");
    public static final ItemType SpruceWood = new ItemType(5, 1, true, "minecraft:planks");
    public static final ItemType BirchWood = new ItemType(5, 2, true, "minecraft:planks");
    public static final ItemType JungleWood = new ItemType(5, 3, true, "minecraft:planks");
    public static final ItemType OakSapling = new ItemType(6, 0, true, "minecraft:sapling");
    public static final ItemType SpruceSapling = new ItemType(6, 1, true, "minecraft:sapling");
    public static final ItemType BirchSapling = new ItemType(6, 2, true, "minecraft:sapling");
    public static final ItemType JungleSapling = new ItemType(6, 3, true, "minecraft:sapling");
    public static final ItemType Bedrock = new ItemType(7, true, "minecraft:bedrock");
    public static final ItemType Water = new ItemType(8, true, "minecraft:flowing_water");
    public static final ItemType WaterFlowing = new ItemType(9, true, "minecraft:water");
    public static final ItemType Lava = new ItemType(10, true, "minecraft:flowing_lava");
    public static final ItemType LavaFlowing = new ItemType(11, true, "minecraft:lava");
    public static final ItemType Sand = new ItemType(12, true, "minecraft:sand");
    public static final ItemType Gravel = new ItemType(13, true, "minecraft:gravel");
    public static final ItemType GoldOre = new ItemType(14, true, "minecraft:gold_ore");
    public static final ItemType IronOre = new ItemType(15, true, "minecraft:iron_ore");
    public static final ItemType CoalOre = new ItemType(16, true, "minecraft:coal_ore");
    public static final ItemType OakLog = new ItemType(17, 0, true, "minecraft:log");
    public static final ItemType PineLog = new ItemType(17, 1, true, "minecraft:log");
    public static final ItemType BirchLog = new ItemType(17, 2, true, "minecraft:log");
    public static final ItemType JungleLog = new ItemType(17, 3, true, "minecraft:log");
    public static final ItemType OakLeaves = new ItemType(18, 0, true, "minecraft:leaves");
    public static final ItemType PineLeaves = new ItemType(18, 1, true, "minecraft:leaves");
    public static final ItemType BirchLeaves = new ItemType(18, 2, true, "minecraft:leaves");
    public static final ItemType JungleLeaves = new ItemType(18, 3, true, "minecraft:leaves");
    public static final ItemType Sponge = new ItemType(19, true, "Sponge"); // THE SPONGE IS A LIE!
    public static final ItemType Glass = new ItemType(20, true, "minecraft:glass");
    public static final ItemType LapislazuliOre = new ItemType(21, true, "minecraft:lapis_ore");
    public static final ItemType LapisBlock = new ItemType(22, true, "minecraft:lapis_block");
    public static final ItemType Dispenser = new ItemType(23, true, "minecraft:dispenser");
    public static final ItemType Sandstone = new ItemType(24, 0, true, "minecraft:sandstone");
    public static final ItemType SandstoneOrnate = new ItemType(24, 1, true, "minecraft:sandstone");
    public static final ItemType SandstoneBlank = new ItemType(24, 2, true, "minecraft:sandstone");
    public static final ItemType NoteBlock = new ItemType(25, true, "minecraft:noteblock");
    public static final ItemType BedBlock = new ItemType(26, true, "minecraft:bed");
    public static final ItemType PoweredRail = new ItemType(27, true, "minecraft:golden_rail");
    public static final ItemType DetectorRail = new ItemType(28, true, "minecraft:detector_rail");
    public static final ItemType StickyPiston = new ItemType(29, true, "minecraft:sticky_piston");
    public static final ItemType SpiderWeb = new ItemType(30, true, "minecraft:web");
    public static final ItemType Shrub = new ItemType(31, 0, true, "minecraft:tallgrass");
    public static final ItemType TallGrass = new ItemType(31, 1, true, "minecraft:tallgrass");
    public static final ItemType TallFern = new ItemType(31, 2, true, "minecraft:tallgrass");
    // 32 MIA
    public static final ItemType Piston = new ItemType(33, true, "minecraft:piston");
    public static final ItemType PistonExtended = new ItemType(34, true, "minecraft:piston_head");
    public static final ItemType WoolWhite = new ItemType(35, 0, true, "minecraft:wool");
    public static final ItemType WoolOrange = new ItemType(35, 1, true, "minecraft:wool");
    public static final ItemType WoolMagenta = new ItemType(35, 2, true, "minecraft:wool");
    public static final ItemType WoolLightBlue = new ItemType(35, 3, true, "minecraft:wool");
    public static final ItemType WoolYellow = new ItemType(35, 4, true, "minecraft:wool");
    public static final ItemType WoolLightGreen = new ItemType(35, 5, true, "minecraft:wool");
    public static final ItemType WoolPink = new ItemType(35, 6, true, "minecraft:wool");
    public static final ItemType WoolGray = new ItemType(35, 7, true, "minecraft:wool");
    public static final ItemType WoolLightGray = new ItemType(35, 8, true, "minecraft:wool");
    public static final ItemType WoolCyan = new ItemType(35, 9, true, "minecraft:wool");
    public static final ItemType WoolPurple = new ItemType(35, 10, true, "minecraft:wool");
    public static final ItemType WoolBlue = new ItemType(35, 11, true, "minecraft:wool");
    public static final ItemType WoolBrown = new ItemType(35, 12, true, "minecraft:wool");
    public static final ItemType WoolDarkGreen = new ItemType(35, 13, true, "minecraft:wool");
    public static final ItemType WoolRed = new ItemType(35, 14, true, "minecraft:wool");
    public static final ItemType WoolBlack = new ItemType(35, 15, true, "minecraft:wool");
    public static final ItemType PistonBlockFiller = new ItemType(36, true, "minecraft:piston_extension");
    public static final ItemType YellowFlower = new ItemType(37, true, "minecraft:yellow_flower");
    public static final ItemType RedFlower = new ItemType(38, true, "minecraft:red_flower");
    public static final ItemType BrownMushroom = new ItemType(39, true, "minecraft:brown_mushroom");
    public static final ItemType RedMushroom = new ItemType(40, true, "minecraft:red_mushroom");
    public static final ItemType GoldBlock = new ItemType(41, true, "minecraft:gold_block");
    public static final ItemType IronBlock = new ItemType(42, true, "minecraft:iron_block");
    public static final ItemType DoublestepOrnateStone = new ItemType(43, 0, true, "minecraft:double_stone_slab");
    public static final ItemType DoublestepSandStoneTrim = new ItemType(43, 1, true, "minecraft:double_stone_slab");
    public static final ItemType DoublestepWood = new ItemType(43, 2, true, "minecraft:double_stone_slab");
    public static final ItemType DoublestepCobble = new ItemType(43, 3, true, "minecraft:double_stone_slab");
    public static final ItemType DoublestepBrickBlock = new ItemType(43, 4, true, "minecraft:double_stone_slab");
    public static final ItemType DoublestepStoneBricks = new ItemType(43, 5, true, "minecraft:double_stone_slab");
    public static final ItemType DoublestepNetherBrick = new ItemType(43, 6, true, "minecraft:double_stone_slab");
    public static final ItemType DoublestepQuartz = new ItemType(43, 9, true, "minecraft:double_stone_slab");
    public static final ItemType DoublestepStone = new ItemType(43, 8, true, "minecraft:double_stone_slab");
    public static final ItemType DoublestepSandStone = new ItemType(43, 11, true, "minecraft:double_stone_slab");
    public static final ItemType StepOrnateStone = new ItemType(44, 0, true, "minecraft:stone_slab");
    public static final ItemType StepSandStoneTrim = new ItemType(44, 1, true, "minecraft:stone_slab");
    public static final ItemType StepWood = new ItemType(44, 2, true, "minecraft:stone_slab");
    public static final ItemType StepCobble = new ItemType(44, 3, true, "minecraft:stone_slab");
    public static final ItemType StepBrickBlock = new ItemType(44, 4, true, "minecraft:stone_slab");
    public static final ItemType StepStoneBricks = new ItemType(44, 5, true, "minecraft:stone_slab");
    public static final ItemType StepNetherBricks = new ItemType(44, 6, true, "minecraft:stone_slab");
    public static final ItemType StepQuartz = new ItemType(44, 7, true, "minecraft:stone_slab");
    public static final ItemType StepStone = new ItemType(44, 10, true, "minecraft:stone_slab");
    public static final ItemType StepSandStone = new ItemType(44, 11, true, "minecraft:stone_slab");
    public static final ItemType BrickBlock = new ItemType(45, true, "minecraft:brick_block");
    public static final ItemType Tnt = new ItemType(46, true, "minecraft:tnt");
    public static final ItemType Bookshelf = new ItemType(47, true, "minecraft:bookshelf");
    public static final ItemType MossyCobble = new ItemType(48, true, "minecraft:mossy_cobblestone");
    public static final ItemType Obsidian = new ItemType(49, true, "minecraft:obsidian");
    public static final ItemType Torch = new ItemType(50, true, "minecraft:torch");
    public static final ItemType FireBlock = new ItemType(51, true, "minecraft:fire");
    public static final ItemType MobSpawner = new ItemType(52, true, "minecraft:mob_spawner");
    public static final ItemType WoodenStair = new ItemType(53, true, "minecraft:oak_stairs");
    public static final ItemType Chest = new ItemType(54, true, "minecraft:chest");
    public static final ItemType RedstoneWire = new ItemType(55, true, "minecraft:redstone_wire");
    public static final ItemType DiamondOre = new ItemType(56, true, "minecraft:diamond_ore");
    public static final ItemType DiamondBlock = new ItemType(57, true, "minecraft:diamond_block");
    public static final ItemType Workbench = new ItemType(58, true, "minecraft:crafting_table");
    public static final ItemType Crops = new ItemType(59, true, "minecraft:wheat");
    public static final ItemType Soil = new ItemType(60, true, "minecraft:farmland");
    public static final ItemType Furnace = new ItemType(61, true, "minecraft:furnace");
    public static final ItemType BurningFurnace = new ItemType(62, true, "minecraft:lit_furnace");
    public static final ItemType SignPost = new ItemType(63, true, "minecraft:standing_sign");
    public static final ItemType WoodenDoor = new ItemType(64, true, "minecraft:wooden_door");
    public static final ItemType Ladder = new ItemType(65, true, "minecraft:ladder");
    public static final ItemType Rail = new ItemType(66, true, "minecraft:rail");
    public static final ItemType CobbleStair = new ItemType(67, true, "minecraft:stone_stairs");
    public static final ItemType WallSign = new ItemType(68, true, "minecraft:wall_sign");
    public static final ItemType Lever = new ItemType(69, true, "minecraft:lever");
    public static final ItemType StonePlate = new ItemType(70, true, "minecraft:stone_pressure_plate");
    public static final ItemType IronDoorBlock = new ItemType(71, true, "minecraft:iron_door");
    public static final ItemType WoodPlate = new ItemType(72, true, "minecraft:wooden_pressure_plate");
    public static final ItemType RedstoneOre = new ItemType(73, true, "minecraft:redstone_ore");
    public static final ItemType GlowingRedstoneOre = new ItemType(74, true, "minecraft:lit_redstone_ore");
    public static final ItemType RedstoneTorchOff = new ItemType(75, true, "minecraft:unlit_redstone_torch");
    public static final ItemType RedstoneTorchOn = new ItemType(76, true, "minecraft:redstone_torch");
    public static final ItemType StoneButton = new ItemType(77, true, "minecraft:stone_button");
    public static final ItemType Snow = new ItemType(78, true, "minecraft:snow_layer");
    public static final ItemType Ice = new ItemType(79, true, "minecraft:ice");
    public static final ItemType SnowBlock = new ItemType(80, true, "minecraft:snow");
    public static final ItemType Cactus = new ItemType(81, true, "minecraft:cactus");
    public static final ItemType Clay = new ItemType(82, true, "minecraft:clay");
    public static final ItemType ReedBlock = new ItemType(83, true, "minecraft:reeds");
    public static final ItemType Jokebox = new ItemType(84, true, "minecraft:jukebox");
    public static final ItemType Fence = new ItemType(85, true, "minecraft:fence");
    public static final ItemType Pumpkin = new ItemType(86, true, "minecraft:pumpkin");
    public static final ItemType Netherrack = new ItemType(87, true, "minecraft:netherrack");
    public static final ItemType SoulSand = new ItemType(88, true, "minecraft:soul_sand");
    public static final ItemType GlowStone = new ItemType(89, true, "minecraft:glowstone");
    public static final ItemType Portal = new ItemType(90, true, "minecraft:portal");
    public static final ItemType JackOLantern = new ItemType(91, true, "minecraft:lit_pumpkin");
    public static final ItemType CakeBlock = new ItemType(92, true, "minecraft:cake");
    public static final ItemType RedstoneRepeaterOff = new ItemType(93, true, "minecraft:unpowered_repeater");
    public static final ItemType RedstoneRepeaterOn = new ItemType(94, true, "minecraft:powered_repeater");
    public static final ItemType LockedChest = new ItemType(95, true, "minecraft:stained_glass");
    public static final ItemType Trapdoor = new ItemType(96, true, "minecraft:trapdoor");
    public static final ItemType CleanSilverFishBlock = new ItemType(97, 0, true, "minecraft:monster_egg");
    public static final ItemType MossySilverFishBlock = new ItemType(97, 1, true, "minecraft:monster_egg");
    public static final ItemType CrackdSilverFishBlock = new ItemType(97, 2, true, "minecraft:monster_egg");
    public static final ItemType OrnateSilverFishBlock = new ItemType(97, 3, true, "minecraft:monster_egg");
    public static final ItemType StoneBrick = new ItemType(98, 0, true, "minecraft:stonebrick");
    public static final ItemType MossyStoneBrick = new ItemType(98, 1, true, "minecraft:stonebrick");
    public static final ItemType CrackedStoneBrick = new ItemType(98, 2, true, "minecraft:stonebrick");
    public static final ItemType OrnateStoneBrick = new ItemType(98, 3, true, "minecraft:stonebrick");
    public static final ItemType HugeBrownMushroom = new ItemType(99, true, "minecraft:brown_mushroom_block");
    public static final ItemType HugeRedMushroom = new ItemType(100, true, "minecraft:red_mushroom_block");
    public static final ItemType IronBars = new ItemType(101, true, "minecraft:iron_bars");
    public static final ItemType GlassPane = new ItemType(102, true, "minecraft:glass_pane");
    public static final ItemType Melon = new ItemType(103, true, "minecraft:melon_block");
    public static final ItemType PumpkinStem = new ItemType(104, true, "minecraft:pumpkin_stem");
    public static final ItemType MelonStem = new ItemType(105, true, "minecraft:melon_stem");
    public static final ItemType Vines = new ItemType(106, true, "minecraft:vine");
    public static final ItemType FenceGate = new ItemType(107, true, "minecraft:fence_gate");
    public static final ItemType BrickStair = new ItemType(108, true, "minecraft:brick_stairs");
    public static final ItemType StoneBrickStair = new ItemType(109, true, "minecraft:stone_brick_stairs");
    public static final ItemType Mycelium = new ItemType(110, true, "minecraft:mycelium");
    public static final ItemType Lilypad = new ItemType(111, true, "minecraft:waterlily");
    public static final ItemType NetherBrick = new ItemType(112, true, "minecraft:nether_brick");
    public static final ItemType NetherBrickFence = new ItemType(113, true, "minecraft:nether_brick_fence");
    public static final ItemType NetherBrickStair = new ItemType(114, true, "minecraft:nether_brick_stairs");
    public static final ItemType NetherWartBlock = new ItemType(115, true, "minecraft:nether_wart");
    public static final ItemType EnchantmentTable = new ItemType(116, true, "minecraft:enchanting_table");
    public static final ItemType BrewingStandBlock = new ItemType(117, true, "minecraft:brewing_stand");
    public static final ItemType CauldronBlock = new ItemType(118, true, "minecraft:cauldron");
    public static final ItemType EndPortal = new ItemType(119, true, "minecraft:end_portal");
    public static final ItemType EndPortalFrame = new ItemType(120, true, "minecraft:end_portal_frame");
    public static final ItemType EndStone = new ItemType(121, true, "minecraft:end_stone");
    public static final ItemType EnderDragonEgg = new ItemType(122, true, "minecraft:dragon_egg");
    public static final ItemType RedstoneLampOff = new ItemType(123, true, "minecraft:redstone_lamp");
    public static final ItemType RedstoneLampOn = new ItemType(124, true, "minecraft:lit_redstone_lamp");
    public static final ItemType OakWoodDoubleStep = new ItemType(125, 0, true, "minecraft:double_wooden_slab");
    public static final ItemType SpruceWoodDoubleStep = new ItemType(125, 1, true, "minecraft:double_wooden_slab");
    public static final ItemType BirchWoodDoubleStep = new ItemType(125, 2, true, "minecraft:double_wooden_slab");
    public static final ItemType JungleWoodDoubleStep = new ItemType(125, 3, true, "minecraft:double_wooden_slab");
    public static final ItemType OakWoodStep = new ItemType(126, 0, true, "minecraft:wooden_slab");
    public static final ItemType SpruceWoodStep = new ItemType(126, 1, true, "minecraft:wooden_slab");
    public static final ItemType BirchWoodStep = new ItemType(126, 2, true, "minecraft:wooden_slab");
    public static final ItemType JungleWoodStep = new ItemType(126, 3, true, "minecraft:wooden_slab");
    public static final ItemType CocoaPlant = new ItemType(127, true, "minecraft:cocoa");
    public static final ItemType SandstoneStair = new ItemType(128, true, "minecraft:sandstone_stairs");
    public static final ItemType EmeraldOre = new ItemType(129, true, "minecraft:emerald_ore");
    public static final ItemType EnderChest = new ItemType(130, true, "minecraft:ender_chest");
    public static final ItemType TripwireHook = new ItemType(131, true, "minecraft:tripwire_hook");
    public static final ItemType Tripwire = new ItemType(132, true, "minecraft:tripwire");
    public static final ItemType EmeraldBlock = new ItemType(133, true, "minecraft:emerald_block");
    public static final ItemType PineWoodStair = new ItemType(134, true, "minecraft:spruce_stairs");
    public static final ItemType BirchWoodStair = new ItemType(135, true, "minecraft:birch_stairs");
    public static final ItemType JungleWoodStair = new ItemType(136, true, "minecraft:jungle_stairs");
    public static final ItemType CommandBlock = new ItemType(137, true, "minecraft:command_block");
    public static final ItemType Beacon = new ItemType(138, true, "minecraft:beacon");
    public static final ItemType CobblestoneWall = new ItemType(139, true, "minecraft:cobblestone_wall");
    public static final ItemType FlowerpotBlock = new ItemType(140, true, "minecraft:flower_pot");
    public static final ItemType Carrots = new ItemType(141, true, "minecraft:carrots");
    public static final ItemType Potatoes = new ItemType(142, true, "minecraft:potatoes");
    public static final ItemType WoodenButton = new ItemType(143, true, "minecraft:wooden_button");
    public static final ItemType SkeletonHeadBlock = new ItemType(144, 0, true, "minecraft:skull");
    public static final ItemType WitherSkeletonHeadBlock = new ItemType(144, 1, true, "minecraft:skull");
    public static final ItemType ZombieHeadBlock = new ItemType(144, 2, true, "minecraft:skull");
    public static final ItemType HumanHeadBlock = new ItemType(144, 3, true, "minecraft:skull");
    public static final ItemType CreeperHeadBlock = new ItemType(144, 4, true, "minecraft:skull");
    public static final ItemType Anvil = new ItemType(145, true, "minecraft:anvil");
    public static final ItemType TrappedChest = new ItemType(146, true, "minecraft:trapped_chest");
    public static final ItemType LightWeightedPressurePlate = new ItemType(147, true, "minecraft:light_weighted_pressure_plate");
    public static final ItemType HeavyWeightedPressurePlate = new ItemType(148, true, "minecraft:heavy_weighted_pressure_plate");
    public static final ItemType RedstoneComparatorOn = new ItemType(149, true, "minecraft:unpowered_comparator");
    public static final ItemType RedstoneComparatorOff = new ItemType(150, true, "minecraft:powered_comparator");
    public static final ItemType DaylightSensor = new ItemType(151, true, "minecraft:daylight_detector");
    public static final ItemType RedstoneBlock = new ItemType(152, true, "minecraft:redstone_block");
    public static final ItemType NetherQuartzOre = new ItemType(153, true, "minecraft:quartz_ore");
    public static final ItemType Hopper = new ItemType(154, true, "minecraft:hopper");
    public static final ItemType QuartzBlock = new ItemType(155, 0, true, "minecraft:quartz_block");
    public static final ItemType OrnateQuartzBlock = new ItemType(155, 1, true, "minecraft:quartz_block");
    public static final ItemType QuartzPillarVertical = new ItemType(155, 2, true, "minecraft:quartz_block");
    public static final ItemType QuartzPillarHorizontal = new ItemType(155, 3, true, "minecraft:quartz_block");
    public static final ItemType QuartzPillarCap = new ItemType(155, 4, true, "minecraft:quartz_block");
    public static final ItemType QuartzStairs = new ItemType(156, true, "minecraft:quartz_stairs");
    public static final ItemType ActivatorRail = new ItemType(157, true, "minecraft:activator_rail");
    public static final ItemType Dropper = new ItemType(158, true, "minecraft:dropper");
    public static final ItemType WhiteStainedClay = new ItemType(159, 0, true, "minecraft:stained_hardened_clay");
    public static final ItemType OrangeStainedClay = new ItemType(159, 1, true, "minecraft:stained_hardened_clay");
    public static final ItemType MagentaStainedClay = new ItemType(159, 2, true, "minecraft:stained_hardened_clay");
    public static final ItemType LightBlueStainedClay = new ItemType(159, 3, true, "minecraft:stained_hardened_clay");
    public static final ItemType YellowStainedClay = new ItemType(159, 4, true, "minecraft:stained_hardened_clay");
    public static final ItemType LimeStainedClay = new ItemType(159, 5, true, "minecraft:stained_hardened_clay");
    public static final ItemType PinkStainedClay = new ItemType(159, 6, true, "minecraft:stained_hardened_clay");
    public static final ItemType GrayStainedClay = new ItemType(159, 7, true, "minecraft:stained_hardened_clay");
    public static final ItemType LightGrayStainedClay = new ItemType(159, 8, true, "minecraft:stained_hardened_clay");
    public static final ItemType CyanStainedClay = new ItemType(159, 9, true, "minecraft:stained_hardened_clay");
    public static final ItemType PurpleStainedClay = new ItemType(159, 10, true, "minecraft:stained_hardened_clay");
    public static final ItemType BlueStainedClay = new ItemType(159, 11, true, "minecraft:stained_hardened_clay");
    public static final ItemType BrownStainedClay = new ItemType(159, 12, true, "minecraft:stained_hardened_clay");
    public static final ItemType GreenStainedClay = new ItemType(159, 13, true, "minecraft:stained_hardened_clay");
    public static final ItemType RedStainedClay = new ItemType(159, 14, true, "minecraft:stained_hardened_clay");
    public static final ItemType BlackStainedClay = new ItemType(159, 15, true, "minecraft:stained_hardened_clay");
    // 160 - 169 MIA
    public static final ItemType HayBale = new ItemType(170, 0, true, "minecraft:hay_block");
    public static final ItemType WhiteCarpet = new ItemType(171, 0, true, "minecraft:carpet");
    public static final ItemType OrangeCarpet = new ItemType(171, 1, true, "minecraft:carpet");
    public static final ItemType MagentaCarpet = new ItemType(171, 2, true, "minecraft:carpet");
    public static final ItemType LightBlueCarpet = new ItemType(171, 3, true, "minecraft:carpet");
    public static final ItemType YellowCarpet = new ItemType(171, 4, true, "minecraft:carpet");
    public static final ItemType LimeCarpet = new ItemType(171, 5, true, "minecraft:carpet");
    public static final ItemType PinkCarpet = new ItemType(171, 6, true, "minecraft:carpet");
    public static final ItemType GrayCarpet = new ItemType(171, 7, true, "minecraft:carpet");
    public static final ItemType LightGrayCarpet = new ItemType(171, 8, true, "minecraft:carpet");
    public static final ItemType CyanCarpet = new ItemType(171, 9, true, "minecraft:carpet");
    public static final ItemType PurpleCarpet = new ItemType(171, 10, true, "minecraft:carpet");
    public static final ItemType BlueCarpet = new ItemType(171, 11, true, "minecraft:carpet");
    public static final ItemType BrownCarpet = new ItemType(171, 12, true, "minecraft:carpet");
    public static final ItemType GreenCarpet = new ItemType(171, 13, true, "minecraft:carpet");
    public static final ItemType RedCarpet = new ItemType(171, 14, true, "minecraft:carpet");
    public static final ItemType BlackCarpet = new ItemType(171, 15, true, "minecraft:carpet");
    public static final ItemType HardenedClay = new ItemType(172, 0, true, "minecraft:hardened_clay");
    public static final ItemType CoalBlock = new ItemType(173, 0, true, "minecraft:coal_block");
    /* Items */
    public static final ItemType IronSpade = new ItemType(256, "minecraft:iron_shovel");
    public static final ItemType IronPickaxe = new ItemType(257, "minecraft:iron_pickaxe");
    public static final ItemType IronAxe = new ItemType(258, "minecraft:iron_axe");
    public static final ItemType FlintAndSteel = new ItemType(259, "minecraft:flint_and_steel");
    public static final ItemType Apple = new ItemType(260, "minecraft:apple");
    public static final ItemType Bow = new ItemType(261, "minecraft:bow");
    public static final ItemType Arrow = new ItemType(262, "minecraft:arrow");
    public static final ItemType Coal = new ItemType(263, "minecraft:coal");
    public static final ItemType Charcoal = new ItemType(263, 1, "minecraft:coal");
    public static final ItemType Diamond = new ItemType(264, "minecraft:diamond");
    public static final ItemType IronIngot = new ItemType(265, "minecraft:iron_ingot");
    public static final ItemType GoldIngot = new ItemType(266, "minecraft:gold_ingot");
    public static final ItemType IronSword = new ItemType(267, "minecraft:iron_sword");
    public static final ItemType WoodSword = new ItemType(268, "minecraft:wooden_sword");
    public static final ItemType WoodSpade = new ItemType(269, "minecraft:wooden_shovel");
    public static final ItemType WoodPickaxe = new ItemType(270, "minecraft:wooden_pickaxe");
    public static final ItemType WoodAxe = new ItemType(271, "minecraft:wooden_axe");
    public static final ItemType StoneSword = new ItemType(272, "minecraft:stone_sword");
    public static final ItemType StoneSpade = new ItemType(273, "minecraft:stone_shovel");
    public static final ItemType StonePickaxe = new ItemType(274, "minecraft:stone_pickaxe");
    public static final ItemType StoneAxe = new ItemType(275, "minecraft:stone_axe");
    public static final ItemType DiamondSword = new ItemType(276, "minecraft:diamond_sword");
    public static final ItemType DiamondSpade = new ItemType(277, "minecraft:diamond_shovel");
    public static final ItemType DiamondPickaxe = new ItemType(278, "minecraft:diamond_pickaxe");
    public static final ItemType DiamondAxe = new ItemType(279, "minecraft:diamond_axe");
    public static final ItemType Stick = new ItemType(280, "minecraft:stick");
    public static final ItemType Bowl = new ItemType(281, "minecraft:bowl");
    public static final ItemType MushroomSoup = new ItemType(282, "minecraft:mushroom_stew");
    public static final ItemType GoldSword = new ItemType(283, "minecraft:golden_sword");
    public static final ItemType GoldSpade = new ItemType(284, "minecraft:golden_shovel");
    public static final ItemType GoldPickaxe = new ItemType(285, "minecraft:golden_pickaxe");
    public static final ItemType GoldAxe = new ItemType(286, "minecraft:golden_axe");
    public static final ItemType String = new ItemType(287, "minecraft:string");
    public static final ItemType Feather = new ItemType(288, "minecraft:feather");
    public static final ItemType Gunpowder = new ItemType(289, "minecraft:gunpowder");
    public static final ItemType WoodHoe = new ItemType(290, "minecraft:wooden_hoe");
    public static final ItemType StoneHoe = new ItemType(291, "minecraft:stone_hoe");
    public static final ItemType IronHoe = new ItemType(292, "minecraft:iron_hoe");
    public static final ItemType DiamondHoe = new ItemType(293, "minecraft:diamond_hoe");
    public static final ItemType GoldHoe = new ItemType(294, "minecraft:golden_hoe");
    public static final ItemType Seeds = new ItemType(295, "minecraft:wheat_seeds");
    public static final ItemType Wheat = new ItemType(296, "minecraft:wheat");
    public static final ItemType Bread = new ItemType(297, "minecraft:bread");
    public static final ItemType LeatherHelmet = new ItemType(298, "minecraft:leather_helmet");
    public static final ItemType LeatherChestplate = new ItemType(299, "minecraft:leather_chestplate");
    public static final ItemType LeatherLeggings = new ItemType(300, "minecraft:leather_leggings");
    public static final ItemType LeatherBoots = new ItemType(301, "minecraft:leather_boots");
    public static final ItemType ChainmailHelmet = new ItemType(302, "minecraft:chainmail_helmet");
    public static final ItemType ChainmailChestplate = new ItemType(303, "minecraft:chainmail_chestplate");
    public static final ItemType ChainmailLeggings = new ItemType(304, "minecraft:chainmail_leggings");
    public static final ItemType ChainmailBoots = new ItemType(305, "minecraft:chainmail_boots");
    public static final ItemType IronHelmet = new ItemType(306, "minecraft:iron_helmet");
    public static final ItemType IronChestplate = new ItemType(307, "minecraft:iron_chestplate");
    public static final ItemType IronLeggings = new ItemType(308, "minecraft:iron_leggings");
    public static final ItemType IronBoots = new ItemType(309, "minecraft:iron_boots");
    public static final ItemType DiamondHelmet = new ItemType(310, "minecraft:diamond_helmet");
    public static final ItemType DiamondChestplate = new ItemType(311, "minecraft:diamond_chestplate");
    public static final ItemType DiamondLeggings = new ItemType(312, "minecraft:diamond_leggings");
    public static final ItemType DiamondBoots = new ItemType(313, "minecraft:diamond_boots");
    public static final ItemType GoldHelmet = new ItemType(314, "minecraft:golden_helmet");
    public static final ItemType GoldChestplate = new ItemType(315, "minecraft:golden_chestplate");
    public static final ItemType GoldLeggings = new ItemType(316, "minecraft:golden_leggings");
    public static final ItemType GoldBoots = new ItemType(317, "minecraft:golden_boots");
    public static final ItemType Flint = new ItemType(318, "minecraft:flint");
    public static final ItemType Pork = new ItemType(319, "minecraft:porkchop");
    public static final ItemType GrilledPork = new ItemType(320, "minecraft:cooked_porkchop");
    public static final ItemType Painting = new ItemType(321, "minecraft:painting");
    public static final ItemType GoldenApple = new ItemType(322, "minecraft:golden_apple");
    public static final ItemType Sign = new ItemType(323, true, "minecraft:sign");
    public static final ItemType WoodDoor = new ItemType(324, true, "minecraft:wooden_door");
    public static final ItemType Bucket = new ItemType(325, "minecraft:bucket");
    public static final ItemType WaterBucket = new ItemType(326, true, "minecraft:water_bucket");
    public static final ItemType LavaBucket = new ItemType(327, true, "minecraft:lava_bucket");
    public static final ItemType Minecart = new ItemType(328, "minecraft:minecart");
    public static final ItemType Saddle = new ItemType(329, "minecraft:saddle");
    public static final ItemType IronDoor = new ItemType(330, true, "minecraft:iron_door");
    public static final ItemType RedStone = new ItemType(331, true, "minecraft:redstone");
    public static final ItemType SnowBall = new ItemType(332, "minecraft:snowball");
    public static final ItemType Boat = new ItemType(333, "minecraft:boat");
    public static final ItemType Leather = new ItemType(334, "minecraft:leather");
    public static final ItemType MilkBucket = new ItemType(335, "minecraft:milk_bucket");
    public static final ItemType ClayBrick = new ItemType(336, "minecraft:brick");
    public static final ItemType ClayBall = new ItemType(337, "minecraft:clay_ball");
    public static final ItemType Reed = new ItemType(338, true, "minecraft:reeds");
    public static final ItemType Paper = new ItemType(339, "minecraft:paper");
    public static final ItemType Book = new ItemType(340, "minecraft:book");
    public static final ItemType SlimeBall = new ItemType(341, "minecraft:slime_ball");
    public static final ItemType StorageMinecart = new ItemType(342, "minecraft:chest_minecart");
    public static final ItemType PoweredMinecart = new ItemType(343, "minecraft:furnace_minecart");
    public static final ItemType Egg = new ItemType(344, "minecraft:egg");
    public static final ItemType Compass = new ItemType(345, "minecraft:compass");
    public static final ItemType FishingRod = new ItemType(346, "minecraft:fishing_rod");
    public static final ItemType Watch = new ItemType(347, "minecraft:clock");
    public static final ItemType GlowstoneDust = new ItemType(348, "minecraft:glowstone_dust");
    public static final ItemType RawFish = new ItemType(349, "minecraft:fish");
    public static final ItemType CookedFish = new ItemType(350, "minecraft:cooked_fished");
    public static final ItemType InkSack = new ItemType(351, 0, "minecraft:dye");
    public static final ItemType RoseRed = new ItemType(351, 1, "minecraft:dye");
    public static final ItemType CactusGreen = new ItemType(351, 2, "minecraft:dye");
    public static final ItemType CocoaBeans = new ItemType(351, 3, "minecraft:dye");
    public static final ItemType LapisLazuli = new ItemType(351, 4, "minecraft:dye");
    public static final ItemType PurpleDye = new ItemType(351, 5, "minecraft:dye");
    public static final ItemType CyanDye = new ItemType(351, 6, "minecraft:dye");
    public static final ItemType LightGrayDye = new ItemType(351, 7, "minecraft:dye");
    public static final ItemType GrayDye = new ItemType(351, 8, "minecraft:dye");
    public static final ItemType PinkDye = new ItemType(351, 9, "minecraft:dye");
    public static final ItemType LimeDye = new ItemType(351, 10, "minecraft:dye");
    public static final ItemType DandelionYellow = new ItemType(351, 11, "minecraft:dye");
    public static final ItemType LightBlueDye = new ItemType(351, 12, "minecraft:dye");
    public static final ItemType MagentaDye = new ItemType(351, 13, "minecraft:dye");
    public static final ItemType OrangeDye = new ItemType(351, 14, "minecraft:dye");
    public static final ItemType Bonemeal = new ItemType(351, 15, "minecraft:dye");
    public static final ItemType Bone = new ItemType(352, "minecraft:bone");
    public static final ItemType Sugar = new ItemType(353, "minecraft:sugar");
    public static final ItemType Cake = new ItemType(354, "minecraft:cake");
    public static final ItemType Bed = new ItemType(355, true, "minecraft:bed");
    public static final ItemType RedstoneRepeater = new ItemType(356, true, "minecraft:repeater");
    public static final ItemType Cookie = new ItemType(357, "minecraft:cookie");
    public static final ItemType Map = new ItemType(358, "minecraft:filled_map");
    public static final ItemType Shears = new ItemType(359, "minecraft:shears");
    public static final ItemType MelonSlice = new ItemType(360, "minecraft:melon");
    public static final ItemType PumpkinSeeds = new ItemType(361, "minecraft:pumpkin_seeds");
    public static final ItemType MelonSeeds = new ItemType(362, "minecraft:melon_seeds");
    public static final ItemType RawBeef = new ItemType(363, "minecraft:beef");
    public static final ItemType Steak = new ItemType(364, "minecraft:cooked_beef");
    public static final ItemType RawChicken = new ItemType(365, "minecraft:chicken");
    public static final ItemType CookedChicken = new ItemType(366, "minecraft:cooked_chicken");
    public static final ItemType RottenFlesh = new ItemType(367, "minecraft:rotten_flesh");
    public static final ItemType EnderPearl = new ItemType(368, "minecraft:ender_pearl");
    public static final ItemType BlazeRod = new ItemType(369, "minecraft:blaze_rod");
    public static final ItemType GhastTear = new ItemType(370, "minecraft:ghast_tear");
    public static final ItemType GoldNugget = new ItemType(371, "minecraft:gold_nugget");
    public static final ItemType NetherWart = new ItemType(372, "minecraft:nether_wart");
    public static final ItemType Potion = new ItemType(373, "minecraft:potion");
    public static final ItemType GlassBottle = new ItemType(374, "minecraft:glass_bottle");
    public static final ItemType SpiderEye = new ItemType(375, "minecraft:spider_eye");
    public static final ItemType FermentedSpiderEye = new ItemType(376, "minecraft:fermented_spider_eye");
    public static final ItemType BlazePowder = new ItemType(377, "minecraft:blaze_powder");
    public static final ItemType MagmaCream = new ItemType(378, "minecraft:magma_cream");
    public static final ItemType BrewingStand = new ItemType(379, true, "minecraft:brewing_stand");
    public static final ItemType Cauldron = new ItemType(380, true, "minecraft:cauldron");
    public static final ItemType EyeofEnder = new ItemType(381, "minecraft:ender_eye");
    public static final ItemType GlisteringMelon = new ItemType(382, "minecraft:speckled_melon");
    public static final ItemType SpawnEgg = new ItemType(383, "minecraft:spawn_egg");
    public static final ItemType BottleOEnchanting = new ItemType(384, "minecraft:experience_bottle");
    public static final ItemType FireCharge = new ItemType(385, "minecraft:fire_charge");
    public static final ItemType BookAndQuill = new ItemType(386, "minecraft:writable_book");
    public static final ItemType WrittenBook = new ItemType(387, "minecraft:written_book");
    public static final ItemType Emerald = new ItemType(388, "minecraft:emerald");
    public static final ItemType ItemFrame = new ItemType(389, "minecraft:item_frame");
    public static final ItemType FlowerPot = new ItemType(390, true, "minecraft:flower_pot");
    public static final ItemType Carrot = new ItemType(391, "minecraft:carrot");
    public static final ItemType Potato = new ItemType(392, "minecraft:potato");
    public static final ItemType BakedPotato = new ItemType(393, "minecraft:baked_potato");
    public static final ItemType PoisonousPotato = new ItemType(394, "minecraft:poisonous_potato");
    public static final ItemType EmptyMap = new ItemType(395, "minecraft:map");
    public static final ItemType GoldenCarrot = new ItemType(396, "minecraft:golden_carrot");
    public static final ItemType SkeletonHead = new ItemType(397, 0, true, "minecraft:skull");
    public static final ItemType WitherSkeletonHead = new ItemType(397, 1, true, "minecraft:skull");
    public static final ItemType ZombieHead = new ItemType(397, 2, true, "minecraft:skull");
    public static final ItemType HumanHead = new ItemType(397, 3, true, "minecraft:skull");
    public static final ItemType CreeperHead = new ItemType(397, 4, true, "minecraft:skull");
    public static final ItemType CarrotOnAStick = new ItemType(398, "minecraft:carrot_on_a_stick");
    public static final ItemType NetherStar = new ItemType(399, "minecraft:nether_star");
    public static final ItemType PumpkinPie = new ItemType(400, "minecraft:pumpkin_pie");
    public static final ItemType FireworkRocket = new ItemType(401, "minecraft:fireworks");
    public static final ItemType FireworkStar = new ItemType(402, "minecraft:firework_charge");
    public static final ItemType EnchantedBook = new ItemType(403, "minecraft:enchanted_book");
    public static final ItemType RedstoneComparator = new ItemType(404, true, "minecraft:comparator");
    public static final ItemType NetherBricks = new ItemType(405, "minecraft:netherbrick");
    public static final ItemType NetherQuartz = new ItemType(406, "minecraft:quartz");
    public static final ItemType MinecartTNT = new ItemType(407, "minecraft:tnt_minecart");
    public static final ItemType MinecartHopper = new ItemType(408, "minecraft:hopper_minecart");
    public static final ItemType IronHorseArmor = new ItemType(417, "minecraft:iron_horse_armor");
    public static final ItemType GoldHorseArmor = new ItemType(418, "minecraft:golden_horse_armor");
    public static final ItemType DiamondHorseArmor = new ItemType(419, "minecraft:diamond_horse_armor");
    public static final ItemType Lead = new ItemType(420, "minecraft:lead");
    public static final ItemType NameTag = new ItemType(421, "minecraft:name_tag");
    /* Records */
    public static final ItemType GoldRecord = new ItemType(2256, "minecraft:record_13");
    public static final ItemType GreenRecord = new ItemType(2257, "minecraft:record_cat");
    public static final ItemType BlocksRecord = new ItemType(2258, "minecraft:record_blocks");
    public static final ItemType ChirpRecord = new ItemType(2259, "minecraft:record_chirp");
    public static final ItemType FarRecord = new ItemType(2260, "minecraft:record_far");
    public static final ItemType MallRecord = new ItemType(2261, "minecraft:record_mall");
    public static final ItemType MellohiRecord = new ItemType(2262, "minecraft:record_mellohi");
    public static final ItemType StalRecord = new ItemType(2263, "minecraft:record_stal");
    public static final ItemType StradRecord = new ItemType(2264, "minecraft:record_strad");
    public static final ItemType WardRecord = new ItemType(2265, "minecraft:record_ward");
    public static final ItemType ElevenRecord = new ItemType(2266, "minecraft:record_11");
    public static final ItemType WaitRecord = new ItemType(2267, "minecraft:record_wait");

    private final int id;
    private final int data;
    private final boolean blockCreating;
    private final String machineName;
    private static HashMap<Entry<String, Integer>, ItemType> itemTypes;

    public ItemType(int id) {
        this(id, 0, false, "unnamed_item_" + id + "_0");
    }

    public ItemType(int id, int data) {
        this(id, data, false, "unnamed_item_" + id + "_" + data);
    }

    public ItemType(int id, String name) {
        this(id, 0, false, name);
    }

    public ItemType(int id, boolean isBlockCreating) {
        this(id, 0, isBlockCreating, "unnamed_item_" + id + "_0");
    }

    public ItemType(int id, int data, String name) {
        this(id, data, false, name);
    }

    public ItemType(int id, boolean isBlockCreating, String machineName) {
        this(id, 0, isBlockCreating, machineName);
    }

    public ItemType(int id, int data, boolean isBlockCreating, String machineName) {
        if (itemTypes == null) {
            itemTypes = new HashMap<Entry<String, Integer>, ItemType>();
        }
        if (machineName == null) {
            throw new ItemTypeException("ItemType name cannot be null");
        }

        Entry<String, Integer> uniqueType = new SimpleImmutableEntry<String, Integer>(machineName, data);
        if (itemTypes.containsKey(uniqueType)) {
            throw new ItemTypeException("ItemType '" + machineName + ":" + data + "' is already is registered!");
        }
        this.id = id;
        this.data = data;
        this.blockCreating = isBlockCreating;
        this.machineName = machineName;

        @SuppressWarnings("LeakingThisInConstructor")
        ItemType ignored = itemTypes.put(uniqueType, this);
    }

    /**
     * Get the ID of this ItemType
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Get the data of the ItemType
     *
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * Get a custom ItemType.
     *
     * @param name
     *         the machine name or the display name of the block type in question
     *
     * @return the ItemType if found; {@code null} if the requested ItemType does not exist.
     */
    public static ItemType getCustomItemType(String name) {
        return ItemType.getCustomItemType(name, 0);
    }

    /**
     * Get a custom ItemType.
     *
     * @param name
     *         the machine name of the block type in question
     * @param data
     *         the data of the block type in question
     *
     * @return the ItemType if found; {@code null} if the requested ItemType does not exist.
     */
    public static ItemType getCustomItemType(String name, int data) {
        Entry<String, Integer> custom = new SimpleImmutableEntry<String, Integer>(name, data);
        if (itemTypes.containsKey(custom)) {
            return itemTypes.get(custom);
        }

        for (ItemType t : itemTypes.values()) {
            if (t.data == data && t.machineName.equalsIgnoreCase(name)) {
                return t;
            }
        }
        return null;
    }

    /**
     * Returns an ItemType according to its name.
     * This returns null if there is no ItemType with this name.
     *
     * @param name
     *         The machine name or the display name
     *
     * @return the ItemType if found; {@code null} if not
     */
    public static ItemType fromString(String name) {
        for (ItemType t : itemTypes.values()) {
            if (t.machineName.equalsIgnoreCase(name)) {
                return t;
            }
        }
        return null;
    }

    /**
     * Get the ItemType according to the given ID.
     * This will return null if there is no ItemType with this id.
     *
     * @param id
     *         the id to get type from
     *
     * @return the ItemType if found; {@code null} if not
     */
    public static ItemType fromId(int id) {
        for (ItemType type : itemTypes.values()) {
            if (type.id == id) {
                return type;
            }
        }
        return null;
    }

    /**
     * Gets an ItemType according to the given ID and Data values.
     * This will return null if there is no ItemType with this id.
     *
     * @param id
     *         the id to get type from
     * @param data
     *         the data (damage) to get type from
     *
     * @return the ItemType if found; {@code null} if not
     */
    public static ItemType fromIdAndData(int id, int data) {
        for (ItemType type : itemTypes.values()) {
            if (type.id == id && type.data == data) {
                return type;
            }
        }
        return fromId(id);
    }

    /**
     * Gets an ItemType according to the given machine name and data value.
     * This will return null if there is no ItemType with this id.
     *
     * @param machineName
     *         the machine name to get type from
     * @param data
     *         the data (damage) to get type from
     *
     * @return the ItemType if found; {@code null} if not
     */
    public static ItemType fromStringAndData(String machineName, int data) {
        Entry<String, Integer> needle = new SimpleImmutableEntry<String, Integer>(machineName, data);
        if (itemTypes.containsKey(needle)) {
            return itemTypes.get(needle);
        }

        for (ItemType type : itemTypes.values()) {
            if (type.data == data && type.machineName.equalsIgnoreCase(machineName)) {
                return type;
            }
        }
        return fromString(machineName);
    }

    /**
     * Returns a "machine readable" name.
     * That is: a representation of the Item Type name
     * in lowercase letters without whitespaces.
     *
     * @return the machine name
     */
    public String getMachineName() {
        return machineName;
    }

    /**
     * Checks the Item ID if it is an Item that creates a Block
     *
     * @param itemId
     *         the Item ID to check
     *
     * @return {@code true} if creates blocks; {@code false} if not
     */
    public static boolean isBlockCreating(int itemId) {
        return fromId(itemId).blockCreating;
    }

    public boolean isBlockCreating() {
        return blockCreating;
    }

    /**
     * Gets an array of all ItemTypes
     *
     * @return all ItemTypes
     */
    public static ItemType[] values() {
        return itemTypes.values().toArray(new ItemType[itemTypes.size()]);
    }
}
