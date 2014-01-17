package DannysMod;

import java.io.File;

import DannysMod.Items.Ids;
import DannysMod.Items.Names;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	public static void init (File configFile) {
		Configuration config = new Configuration(configFile);

		config.load();
		Ids.shadowBlock_actual = config.getBlock(Names.shadowBlock_name, Ids.shadowBlock_default).getInt();
		Ids.fireBlock_actual = config.getBlock(Names.fireBlock_name, Ids.fireBlock_default).getInt();
		Ids.illuminiteBlock_actual = config.getBlock(Names.illuminiteBlock_name, Ids.illuminiteBlock_default).getInt();
		Ids.pureBlock_actual = config.getBlock(Names.pureBlock_name, Ids.pureBlock_default).getInt();
		Ids.demoniteBlock_actual = config.getBlock(Names.demoniteBlock_name, Ids.demoniteBlock_default).getInt();
		Ids.shadowItem_actual = config.getItem(Names.shadowItem_name, Ids.shadowItem_default).getInt();
		Ids.fireItem_actual = config.getItem(Names.fireItem_name, Ids.fireItem_default).getInt();
		Ids.illuminiteItem_actual = config.getItem(Names.illuminiteItem_name, Ids.illuminiteItem_default).getInt();
		Ids.pureItem_actual = config.getItem(Names.pureItem_name, Ids.pureItem_default).getInt();
		Ids.demoniteItem_actual = config.getItem(Names.demoniteItem_name, Ids.demoniteItem_default).getInt();
		Ids.cshadowItem_actual = config.getItem(Names.cshadowItem_name, Ids.cshadowItem_default).getInt();
		Ids.cfireItem_actual = config.getItem(Names.cfireItem_name, Ids.cfireItem_default).getInt();

		Ids.shadowOre_actual = config.getBlock(Names.shadowOre_name, Ids.shadowOre_default).getInt();
		Ids.fireOre_actual = config.getBlock(Names.fireOre_name, Ids.fireOre_default).getInt();
		Ids.illuminiteOre_actual = config.getBlock(Names.illuminiteOre_name, Ids.illuminiteOre_default).getInt();
		Ids.pureOre_actual = config.getBlock(Names.pureOre_name, Ids.pureOre_default).getInt();
		Ids.demoniteOre_actual = config.getBlock(Names.demoniteOre_name, Ids.demoniteOre_default).getInt();
		Ids.cshadowOre_actual = config.getBlock(Names.cshadowOre_name, Ids.cshadowOre_default).getInt();
		Ids.cfireOre_actual = config.getBlock(Names.cfireOre_name, Ids.cfireOre_default).getInt();
		Ids.cilluminiteOre_actual = config.getBlock(Names.cilluminiteOre_name, Ids.cilluminiteOre_default).getInt();
		Ids.cpureOre_actual = config.getBlock(Names.cpureOre_name, Ids.cpureOre_default).getInt();
		Ids.cdemoniteOre_actual = config.getBlock(Names.cdemoniteOre_name, Ids.cdemoniteOre_default).getInt();

		Ids.shadowHelmet_actual = config.getItem(Names.shadowHelmet_name, Ids.shadowHelmet_default).getInt();
		Ids.shadowChestplate_actual = config.getItem(Names.shadowChestplate_name, Ids.shadowChestplate_default).getInt();
		Ids.shadowLeggings_actual = config.getItem(Names.shadowLeggings_name, Ids.shadowLeggings_default).getInt();
		Ids.shadowBoots_actual = config.getItem(Names.shadowBoots_name, Ids.shadowBoots_default).getInt();

		Ids.fireHelmet_actual = config.getItem(Names.fireHelmet_name, Ids.fireHelmet_default).getInt();
		Ids.fireChestplate_actual = config.getItem(Names.fireChestplate_name, Ids.fireChestplate_default).getInt();
		Ids.fireLeggings_actual = config.getItem(Names.fireLeggings_name, Ids.fireLeggings_default).getInt();
		Ids.fireBoots_actual = config.getItem(Names.fireBoots_name, Ids.fireBoots_default).getInt();

		Ids.illuminiteHelmet_actual = config.getItem(Names.illuminiteHelmet_name, Ids.illuminiteHelmet_default).getInt();
		Ids.illuminiteChestplate_actual = config.getItem(Names.illuminiteChestplate_name, Ids.illuminiteChestplate_default).getInt();
		Ids.illuminiteLeggings_actual = config.getItem(Names.illuminiteLeggings_name, Ids.illuminiteLeggings_default).getInt();
		Ids.illuminiteBoots_actual = config.getItem(Names.illuminiteBoots_name, Ids.illuminiteBoots_default).getInt();

		Ids.pureHelmet_actual = config.getItem(Names.pureHelmet_name, Ids.pureHelmet_default).getInt();
		Ids.pureChestplate_actual = config.getItem(Names.pureChestplate_name, Ids.pureChestplate_default).getInt();
		Ids.pureLeggings_actual = config.getItem(Names.pureLeggings_name, Ids.pureLeggings_default).getInt();
		Ids.pureBoots_actual = config.getItem(Names.pureBoots_name, Ids.pureBoots_default).getInt();

		Ids.demoniteHelmet_actual = config.getItem(Names.demoniteHelmet_name, Ids.demoniteHelmet_default).getInt();
		Ids.demoniteChestplate_actual = config.getItem(Names.demoniteChestplate_name, Ids.demoniteChestplate_default).getInt();
		Ids.demoniteLeggings_actual = config.getItem(Names.demoniteLeggings_name, Ids.demoniteLeggings_default).getInt();
		Ids.demoniteBoots_actual = config.getItem(Names.demoniteBoots_name, Ids.fireBoots_default).getInt();

		Ids.Burger_actual = config.getItem(Names.Burger_name, Ids.Burger_default).getInt();
		Ids.Flake_actual = config.getItem(Names.Flake_name, Ids.Flake_default).getInt();
		Ids.Donut_actual = config.getItem(Names.Donut_name, Ids.Donut_default).getInt();
		Ids.Carameldonut_actual = config.getItem(Names.Carameldonut_name, Ids.Carameldonut_default).getInt();
		Ids.Chocolatedonut_actual = config.getItem(Names.Chocolatedonut_name, Ids.Chocolatedonut_default).getInt();
		Ids.Sprinkledonut_actual = config.getItem(Names.Sprinkledonut_name, Ids.Sprinkledonut_default).getInt();
		Ids.Chocice_actual = config.getItem(Names.Chocice_name, Ids.Chocice_default).getInt();
		Ids.Chocolate_actual = config.getItem(Names.Chocolate_name, Ids.Chocolate_default).getInt();
		Ids.caramelItem_actual = config.getItem(Names.caramelItem_name, Ids.caramelItem_default).getInt();
		Ids.potofCaramel_actual = config.getItem(Names.potofCaramel_name, Ids.potofCaramel_default).getInt();
		Ids.Chocolatesauce_actual = config.getItem(Names.Chocolatesauce_name, Ids.Chocolatesauce_default).getInt();
		Ids.Sprinkles_actual = config.getItem(Names.Sprinkles_name, Ids.Sprinkles_default).getInt();
		Ids.potofSprinkles_actual = config.getItem(Names.potofSprinkles_name, Ids.potofSprinkles_default).getInt();
		Ids.Icecreamcone_actual = config.getItem(Names.Icecreamcone_name, Ids.Icecreamcone_default).getInt();
		Ids.Burgertop_actual = config.getItem(Names.Burgertop_name, Ids.Burgertop_default).getInt();
		Ids.Burgerbottom_actual = config.getItem(Names.Burgerbottom_name, Ids.Burgerbottom_default).getInt();
		Ids.Plastic_actual = config.getItem(Names.Plastic_name, Ids.Plastic_default).getInt();
		Ids.pizzaBase_actual = config.getItem(Names.pizzaBase_name, Ids.pizzaBase_default).getInt();
		Ids.tomatoPizza_actual = config.getItem(Names.tomatoPizza_name, Ids.tomatoPizza_default).getInt();
		Ids.cheesePizza_actual = config.getItem(Names.cheesePizza_name, Ids.cheesePizza_default).getInt();
		//Ids.tomatoPlant_actual = config.getItem(Names.tomatoPlant_name, Ids.tomatoPlant_default).getInt();
		Ids.Cheese_actual = config.getItem(Names.Cheese_name, Ids.Cheese_default).getInt();

		Ids.Bottle_actual = config.getItem(Names.Bottle_name, Ids.Bottle_default).getInt();
		Ids.unlitMolotov_actual = config.getItem(Names.unlitMolotov_name, Ids.unlitMolotov_default).getInt();
		Ids.Molotov_actual = config.getItem(Names.Molotov_name, Ids.Molotov_default).getInt();
		Ids.Bomb_actual = config.getItem(Names.Bomb_name, Ids.Bomb_default).getInt();

		Ids.demonitePickaxe_actual = config.getItem(Names.demonitePickaxe_name, Ids.demonitePickaxe_default).getInt();
		Ids.demoniteShovel_actual = config.getItem(Names.demoniteShovel_name, Ids.demoniteShovel_default).getInt();
		Ids.demoniteAxe_actual = config.getItem(Names.demoniteAxe_name, Ids.demoniteAxe_default).getInt();
		Ids.demoniteHoe_actual = config.getItem(Names.demoniteHoe_name, Ids.demoniteHoe_default).getInt();

		Ids.firePickaxe_actual = config.getItem(Names.firePickaxe_name, Ids.firePickaxe_default).getInt();
		Ids.fireShovel_actual = config.getItem(Names.fireShovel_name, Ids.fireShovel_default).getInt();
		Ids.fireAxe_actual = config.getItem(Names.fireAxe_name, Ids.fireAxe_default).getInt();
		Ids.fireHoe_actual = config.getItem(Names.fireHoe_name, Ids.fireHoe_default).getInt();

		Ids.illuminitePickaxe_actual = config.getItem(Names.illuminitePickaxe_name, Ids.illuminitePickaxe_default).getInt();
		Ids.illuminiteShovel_actual = config.getItem(Names.illuminiteShovel_name, Ids.illuminiteShovel_default).getInt();
		Ids.illuminiteAxe_actual = config.getItem(Names.illuminiteAxe_name, Ids.illuminiteAxe_default).getInt();
		Ids.illuminiteHoe_actual = config.getItem(Names.illuminiteHoe_name, Ids.illuminiteHoe_default).getInt();

		Ids.purePickaxe_actual = config.getItem(Names.purePickaxe_name, Ids.purePickaxe_default).getInt();
		Ids.pureShovel_actual = config.getItem(Names.pureShovel_name, Ids.pureShovel_default).getInt();
		Ids.pureAxe_actual = config.getItem(Names.pureAxe_name, Ids.pureAxe_default).getInt();
		Ids.pureHoe_actual = config.getItem(Names.pureHoe_name, Ids.pureHoe_default).getInt();

		Ids.shadowPickaxe_actual = config.getItem(Names.shadowPickaxe_name, Ids.shadowPickaxe_default).getInt();
		Ids.shadowShovel_actual = config.getItem(Names.shadowShovel_name, Ids.shadowShovel_default).getInt();
		Ids.shadowAxe_actual = config.getItem(Names.shadowAxe_name, Ids.shadowAxe_default).getInt();
		Ids.shadowHoe_actual = config.getItem(Names.shadowHoe_name, Ids.shadowHoe_default).getInt();

		Ids.plasmaRifle_actual = config.getItem(Names.plasmaRifle_name, Ids.plasmaRifle_default).getInt();
		Ids.cellEmpty_actual = config.getItem(Names.cellEmpty_name, Ids.cellEmpty_default).getInt();
		Ids.plasmaAmmo_actual = config.getItem(Names.plasmaAmmo_name, Ids.plasmaAmmo_default).getInt();

		Ids.LiquidplasmaStill_actual = config.getBlock(Names.LiquidplasmaStill_name, Ids.LiquidplasmaStill_default).getInt();
		Ids.LiquidplasmaFlowing_actual = config.getBlock(Names.LiquidplasmaFlowing_name, Ids.LiquidplasmaFlowing_default).getInt();

		Ids.Limestone_actual = config.getBlock(Names.Limestone_name, Ids.Limestone_default).getInt();
		Ids.Limestonebrick_actual = config.getBlock(Names.Limestonebrick_name, Ids.Limestonebrick_default).getInt();
		Ids.Limestonefragment_actual = config.getItem(Names.Limestonefragment_name, Ids.Limestonefragment_default).getInt();
		Ids.sLimestonefragment_actual = config.getItem(Names.sLimestonefragment_name, Ids.sLimestonefragment_default).getInt();

		config.save();

	}
}
