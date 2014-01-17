package DannysMod.Blocks;


import DannysMod.Items.Ids;
import DannysMod.Items.Food.tomatoPlant;
//import DannysMod.Mobs.EntityGhoul;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelCow;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class Blocks {
	public static final Block shadowBlock = new shadowBlock(Ids.shadowBlock_actual).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("ShadowBlock");
	public static final Block fireBlock = new fireBlock(Ids.fireBlock_actual).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("fireBlock");
	public static final Block illuminiteBlock = new illuminiteBlock(Ids.illuminiteBlock_actual).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("illuminiteBlock");
	public static final Block pureBlock = new pureBlock(Ids.pureBlock_actual).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("pureBlock");
	public static final Block demoniteBlock = new demoniteBlock(Ids.demoniteBlock_actual).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("demoniteBlock");
	//ORES
	public static final Block shadowOre = new shadowOre(Ids.shadowOre_actual).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("shadowOre");
	public static final Block fireOre = new fireOre(Ids.fireOre_actual).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("fireOre");
	public static final Block illuminiteOre = new illuminiteOre(Ids.illuminiteOre_actual).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("illuminiteOre");
	public static final Block pureOre = new pureOre(Ids.pureOre_actual).setHardness(4.0F).setResistance(10.0F).setUnlocalizedName("pureOre");
	public static final Block demoniteOre = new demoniteOre(Ids.demoniteOre_actual).setHardness(5.0F).setResistance(10.0F).setUnlocalizedName("demoniteOre");
	public static final Block corruptedshadowOre = new cshadowOre(Ids.cshadowOre_actual).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("Corrupted Shadow Ore");
	public static final Block corruptedfireOre = new cfireOre(Ids.cfireOre_actual).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("Corrupted Fire Ore");
	public static final Block corruptedilluminiteOre = new cilluminiteOre(Ids.cilluminiteOre_actual).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("Corrupted Illuminite Ore");
	public static final Block corruptedpureOre = new cpureOre(Ids.cpureOre_actual).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("Corrupted Pure Ore");
	public static final Block corrupteddemoniteOre = new cdemoniteOre(Ids.cdemoniteOre_actual).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("Corrupted Demonite Ore");
	//GENERAL
	public static final Block Limestone = new Limestone(Ids.Limestone_actual).setHardness(3.5F).setResistance(10.0F).setUnlocalizedName("Limestone");
	public static final Block Limestonebrick = new Limestonebrick(Ids.Limestonebrick_actual).setHardness(3.5F).setResistance(10.0F).setUnlocalizedName("Limestone Brick");
	//FOOD
	//public static final Block tomatoPlant = (new tomatoPlant(Ids.tomatoPlant_actual).setUnlocalizedName("Tomato Plant"));

	public static void addNames() {

		GameRegistry.registerBlock(shadowBlock, "Shadow Block");
		LanguageRegistry.addName(shadowBlock, "Shadow Block");

		GameRegistry.registerBlock(fireBlock, "Fire Block");
		LanguageRegistry.addName(fireBlock, "Fire Block");

		GameRegistry.registerBlock(illuminiteBlock, "Illuminite Block");
		LanguageRegistry.addName(illuminiteBlock, "Illuminite Block");

		GameRegistry.registerBlock(pureBlock, "Pure Block");
		LanguageRegistry.addName(pureBlock, "Pure Block");

		GameRegistry.registerBlock(demoniteBlock, "Demonite Block");
		LanguageRegistry.addName(demoniteBlock, "Demonite Block");
		//ORES

		GameRegistry.registerBlock(shadowOre, "Shadow Ore");
		LanguageRegistry.addName(shadowOre, "Shadow Ore");

		GameRegistry.registerBlock(fireOre, "Fire Ore");
		LanguageRegistry.addName(fireOre, "Fire Ore");

		GameRegistry.registerBlock(illuminiteOre, "Illuminite Ore");
		LanguageRegistry.addName(illuminiteOre, "Illuminite Ore");

		GameRegistry.registerBlock(pureOre, "Pure Ore");
		LanguageRegistry.addName(pureOre, "Pure Ore");

		GameRegistry.registerBlock(demoniteOre, "Demonite Ore");
		LanguageRegistry.addName(demoniteOre, "Demonite Ore");

		GameRegistry.registerBlock(corruptedshadowOre, "Corrupted Shadow Ore");
		LanguageRegistry.addName(corruptedshadowOre, "Corrupted Shadow Ore");

		GameRegistry.registerBlock(corruptedfireOre, "Corrupted Fire Ore");
		LanguageRegistry.addName(corruptedfireOre, "Corrupted Fire Ore");
		//GENERAL
		GameRegistry.registerBlock(Limestone, "Limestone");
		LanguageRegistry.addName(Limestone, "LimeStone");

		GameRegistry.registerBlock(Limestonebrick, "Limestone Brick");
		LanguageRegistry.addName(Limestonebrick, "Limestonebrick");
		//FOOD
		//	GameRegistry.registerBlock(tomatoPlant, "Tomato Plant");
		//	LanguageRegistry.addName(tomatoPlant, "Tomato Plant");

		//EXPLOSIVES

		//GameRegistry.registerBlock(Bomb, "Bomb");
		//LanguageRegistry.addName(Bomb, "Bomb");
		//LIQUID
		//GameRegistry.registerBlock(LiquidplasmaStill, "Plasma Still");
		//LanguageRegistry.addName(LiquidplasmaStill, "Plasma Still");

		//GameRegistry.registerBlock(LiquidplasmaFlowing, "Plasma Flowing");
		//LanguageRegistry.addName(LiquidplasmaFlowing, "Plasma Flowing");

		//MOBS
		//EntityRegistry.registerGlobalEntityID(EntityGhoul.class, "Ghoul", EntityRegistry.findGlobalUniqueEntityId(), 3515848, 12102);
		// EntityRegistry.registerModEntity(EntityGhoul.class, "Ghoul", 2, 80, 3, 0, true);
		// EntityRegistry.addSpawn(EntityGhoul.class, 5, 2, 6, EnumCreatureType.creature, BiomeGenBase.plains);
		// LanguageRegistry.instance().addStringLocalization("entity.instance.Ghoul.name", "Ghoul");
	}


	public static void init() {
	}
}