package DannysMod;

import net.minecraft.client.gui.GuiHopper;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCow;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.stats.Achievement;
import net.minecraft.world.biome.BiomeGenBase;
import DannysMod.Blocks.Blocks;
import DannysMod.Crafting.Recipes;
import DannysMod.Items.Items;

//import DannysMod.Items.Rifles.EntityplasmaBullet;
//import DannysMod.Liquid.WorldGenplasmaLake;
import DannysMod.Proxies.CommonProxy;
import DannysMod.world.WorldGenOres;
import DannysMod.world.WorldGenPlants;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod ( modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod ( channels = {ModInfo.CHANNEL}, clientSideRequired = true, serverSideRequired = true)

public class coreFiles {

	@Instance(ModInfo.ID)
	public static coreFiles instance;

	@SidedProxy( clientSide = ModInfo.PROXY_LOCATION + ".ClientProxy", serverSide = ModInfo.PROXY_LOCATION + ".CommonProxy")
	public static CommonProxy proxy;

	public static CreativeTabs tab = new TabDannysMod("DannysMod");

	@EventHandler
	public void preInit (FMLPreInitializationEvent event) {
		proxy.init();
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		Blocks.addNames();
		Items.addNames();
		LanguageRegistry.instance().addStringLocalization("itemGroup.DannysMod", "Danny's Mod");
		GameRegistry.registerWorldGenerator(new WorldGenOres());
		Recipes.add();
		//registerEntity(EntityplasmaBullet.class, "Plasma Bullet");
		ConfigHandler.init(event.getSuggestedConfigurationFile());

	}
	@EventHandler
	public static void init ( FMLInitializationEvent event ) {
		GameRegistry.registerWorldGenerator(new WorldGenPlants());
	}

	@EventHandler
	public static void postInit (FMLPostInitializationEvent event) {

	}
	public static void registerEntity(Class entityClass, String entityName)
	{
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, entityID);

	}
	//public static WorldGenplasmaLake worldGen = new WorldGenplasmaLake(3); // This is your world generation file.

	@Init
	public void load(FMLInitializationEvent evt) {

		//      GameRegistry.registerWorldGenerator(worldGen);   // Add this in your @Init method. If you haven't already, import cpw.mods.fml.common.registry.GameRegistry.      
	}
}

