package DannysMod.Items;


import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.EnumHelper;
import DannysMod.coreFiles;
import DannysMod.Crafting.ItemdemoniteAxe;
import DannysMod.Crafting.ItemdemoniteHoe;
import DannysMod.Crafting.ItemdemonitePickaxe;
import DannysMod.Crafting.ItemdemoniteShovel;
import DannysMod.Crafting.ItemdemoniteSword;
import DannysMod.Crafting.ItemfireAxe;
import DannysMod.Crafting.ItemfireHoe;
import DannysMod.Crafting.ItemfirePickaxe;
import DannysMod.Crafting.ItemfireShovel;
import DannysMod.Crafting.ItemfireSword;
import DannysMod.Crafting.ItemilluminiteAxe;
import DannysMod.Crafting.ItemilluminiteHoe;
import DannysMod.Crafting.ItemilluminitePickaxe;
import DannysMod.Crafting.ItemilluminiteShovel;
import DannysMod.Crafting.ItemilluminiteSword;
import DannysMod.Crafting.ItempureAxe;
import DannysMod.Crafting.ItempureHoe;
import DannysMod.Crafting.ItempurePickaxe;
import DannysMod.Crafting.ItempureShovel;
import DannysMod.Crafting.ItempureSword;
import DannysMod.Crafting.ItemshadowAxe;
import DannysMod.Crafting.ItemshadowHoe;
import DannysMod.Crafting.ItemshadowPickaxe;
import DannysMod.Crafting.ItemshadowShovel;
import DannysMod.Crafting.ItemshadowSword;
import DannysMod.Items.Armor.ItemDMArmor;
import DannysMod.Items.Explosives.*;
import DannysMod.Items.Food.*;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
//import DannysMod.Mobs.*;
//import DannysMod.Items.Rifles.*;

public class Items {

	public static EnumArmorMaterial shadowA = EnumHelper.addArmorMaterial("shadowA", 5, new int[]{ 2, 4, 5, 2 }, 15);	
	public static EnumArmorMaterial fireA = EnumHelper.addArmorMaterial("fireA", 8, new int[]{ 2, 5, 5, 2 }, 16);
	public static EnumArmorMaterial illuminiteA = EnumHelper.addArmorMaterial("illuminiteA", 15, new int[]{ 3, 6, 5, 3 }, 18);
	public static EnumArmorMaterial pureA = EnumHelper.addArmorMaterial("pureA", 28, new int[]{ 4, 7, 7, 5 }, 23);	
	public static EnumArmorMaterial demoniteA = EnumHelper.addArmorMaterial("demoniteA", 32, new int[]{ 7, 9, 9, 7 }, 27);	


	public static EnumToolMaterial shadow = EnumHelper.addToolMaterial("shadow", 2, 250, 3.0F, 1, 10);
	public static EnumToolMaterial fire = EnumHelper.addToolMaterial("fire", 2, 375, 3.0F, 1, 10);
	public static EnumToolMaterial illuminite = EnumHelper.addToolMaterial("illuminite", 3, 600, 3.5F, 2, 15);
	public static EnumToolMaterial pure = EnumHelper.addToolMaterial("pure", 3, 800, 4.0F, 2, 17);
	public static EnumToolMaterial demonite = EnumHelper.addToolMaterial("demonite", 3, 1200, 4.0F, 3, 17);
	private static int render;

	public static final Item shadowitem = (new shadowItem(Ids.shadowItem_actual).setUnlocalizedName("Shadow Gem"));
	public static final Item fireitem = (new fireItem(Ids.fireItem_actual).setUnlocalizedName("Fire Gem"));
	public static final Item illuminiteitem = (new illuminiteItem(Ids.illuminiteItem_actual).setUnlocalizedName("Illuminite Gem"));
	public static final Item pureitem = (new pureItem(Ids.pureItem_actual).setUnlocalizedName("Pure Gem"));
	public static final Item demoniteitem = (new demoniteItem(Ids.demoniteItem_actual).setCreativeTab(coreFiles.tab).setUnlocalizedName("Demonite Gem"));
	public static final Item ironRod = (new ironRod(Ids.ironRod_actual).setCreativeTab(coreFiles.tab).setUnlocalizedName("Iron Rod"));
	public static final Item cshadowitem = (new itemclasses(Ids.cshadowItem_actual).setUnlocalizedName("Corrupted Shadow Gem"));
	public static final Item cfireitem = (new itemclasses(Ids.cfireItem_actual).setUnlocalizedName("Corrupted Fire Gem"));
	//public static final Item cilluminiteitem = (new itemclasses(Ids.cilluminiteItem_actual).setUnlocalizedName("Corrupted Illuminite Gem"));
	//public static final Item cpureitem =  (new itemclasses(Ids.cpureItem_actual).setUnlocalizedName("Corrupted Pure Gem"));
	//public static final Item cdemoniteitem = (new itemclasses(Ids.cdemoniteItem_actual).setUnlocalizedName("Corrupted Demonite Gem"));

	//GENERAL
	public static final Item Limestonefragment = (new itemclasses(Ids.Limestonefragment_actual).setUnlocalizedName("Limestone Fragment"));
	public static final Item sLimestonefragment = (new itemclasses(Ids.sLimestonefragment_actual).setUnlocalizedName("Sharpened Limestone Fragment"));
	//TOOLS
	public static final Item shadowPickaxe = (new dmpickaxes(14500, shadow).setCreativeTab(coreFiles.tab).setUnlocalizedName("shadowPickaxe"));
	public static final Item firePickaxe = (new dmpickaxes(14501, fire).setCreativeTab(coreFiles.tab).setUnlocalizedName("firePickaxe"));
	public static final Item illuminitePickaxe = (new dmpickaxes(14502, illuminite).setCreativeTab(coreFiles.tab).setUnlocalizedName("illuminitePickaxe"));
	public static final Item purePickaxe = (new dmpickaxes(14503, pure).setCreativeTab(coreFiles.tab).setUnlocalizedName("purePickaxe"));
	public static final Item demonitePickaxe = (new dmpickaxes(14504, demonite).setCreativeTab(coreFiles.tab).setUnlocalizedName("demonitePickaxe"));
	//SWORDS
	public static final Item shadowSword = (new ItemshadowSword(14495, shadow).setCreativeTab(coreFiles.tab).setUnlocalizedName("shadowSword"));
	public static final Item fireSword = (new ItemfireSword(14496, fire).setCreativeTab(coreFiles.tab).setUnlocalizedName("fireSword"));
	public static final Item illuminiteSword = (new ItemilluminiteSword(4497, illuminite).setCreativeTab(coreFiles.tab).setUnlocalizedName("illuminiteSword"));
	public static final Item pureSword = (new ItempureSword(4498, pure).setCreativeTab(coreFiles.tab).setUnlocalizedName("pureSword"));
	public static final Item demoniteSword = (new ItemdemoniteSword(4499, demonite).setCreativeTab(coreFiles.tab).setUnlocalizedName("demoniteSword"));
	//AXES
	public static final Item shadowAxe = (new ItemshadowAxe(14505, shadow).setCreativeTab(coreFiles.tab).setUnlocalizedName("ShadowAxe"));
	public static final Item fireAxe = (new ItemfireAxe(14506, fire).setCreativeTab(coreFiles.tab).setUnlocalizedName("fireAxe"));
	public static final Item illuminiteAxe = (new ItemilluminiteAxe(14507, illuminite).setCreativeTab(coreFiles.tab).setUnlocalizedName("illuminiteAxe"));
	public static final Item pureAxe = (new ItempureAxe(14508, pure).setCreativeTab(coreFiles.tab).setUnlocalizedName("pureAxe"));
	public static final Item demoniteAxe = (new ItemdemoniteAxe(14509, demonite).setCreativeTab(coreFiles.tab).setUnlocalizedName("demoniteAxe"));
	//SHOVEL
	public static final Item shadowShovel = (new ItemshadowShovel(14510, shadow).setCreativeTab(coreFiles.tab).setUnlocalizedName("ShadowShovel"));
	public static final Item fireShovel = (new ItemfireShovel(14511, fire).setCreativeTab(coreFiles.tab).setUnlocalizedName("fireShovel"));
	public static final Item illuminiteShovel = (new ItemilluminiteShovel(14512, illuminite).setCreativeTab(coreFiles.tab).setUnlocalizedName("illuminiteShovel"));
	public static final Item pureShovel = (new ItempureShovel(14513, pure).setCreativeTab(coreFiles.tab).setUnlocalizedName("pureShovel"));
	public static final Item demoniteShovel = (new ItemdemoniteShovel(14514, demonite).setCreativeTab(coreFiles.tab).setUnlocalizedName("demoniteShovel"));
	//HOE
	public static final Item shadowHoe = (new ItemshadowHoe(14515, shadow).setCreativeTab(coreFiles.tab).setUnlocalizedName("ShadowHoe"));
	public static final Item fireHoe = (new ItemfireHoe(14516, fire).setCreativeTab(coreFiles.tab).setUnlocalizedName("FireHoe"));
	public static final Item illuminiteHoe = (new ItemilluminiteHoe(14517, illuminite).setCreativeTab(coreFiles.tab).setUnlocalizedName("IlluminiteHoe"));
	public static final Item pureHoe = (new ItempureHoe(14518, pure).setCreativeTab(coreFiles.tab).setUnlocalizedName("PureHoe"));
	public static final Item demoniteHoe = (new ItemdemoniteHoe(14519, demonite).setCreativeTab(coreFiles.tab).setUnlocalizedName("DemoniteHoe"));
	//CORRUPT TOOLS
	public static final Item cshadowPickaxe = (new ItemshadowPickaxe(14500, shadow).setCreativeTab(coreFiles.tab).setUnlocalizedName("cshadowPickaxe"));
	public static final Item cfirePickaxe = (new ItemfirePickaxe(14501, fire).setCreativeTab(coreFiles.tab).setUnlocalizedName("cfirePickaxe"));
	public static final Item cilluminitePickaxe = (new ItemilluminitePickaxe(14502, illuminite).setCreativeTab(coreFiles.tab).setUnlocalizedName("cilluminitePickaxe"));
	public static final Item cpurePickaxe = (new ItempurePickaxe(14503, pure).setCreativeTab(coreFiles.tab).setUnlocalizedName("purePickaxe"));
	public static final Item cdemonitePickaxe = (new ItemdemonitePickaxe(14504, demonite).setCreativeTab(coreFiles.tab).setUnlocalizedName("cdemonitePickaxe"));
	//SWORDS
	public static final Item cshadowSword = (new ItemshadowSword(14495, shadow).setCreativeTab(coreFiles.tab).setUnlocalizedName("cshadowSword"));
	public static final Item cfireSword = (new ItemfireSword(14496, fire).setCreativeTab(coreFiles.tab).setUnlocalizedName("cfireSword"));
	public static final Item cilluminiteSword = (new ItemilluminiteSword(4497, illuminite).setCreativeTab(coreFiles.tab).setUnlocalizedName("cilluminiteSword"));
	public static final Item cpureSword = (new ItempureSword(4498, pure).setCreativeTab(coreFiles.tab).setUnlocalizedName("cpureSword"));
	public static final Item cdemoniteSword = (new ItemdemoniteSword(4499, demonite).setCreativeTab(coreFiles.tab).setUnlocalizedName("cdemoniteSword"));
	//AXES
	public static final Item cshadowAxe = (new ItemshadowAxe(14505, shadow).setCreativeTab(coreFiles.tab).setUnlocalizedName("cShadowAxe"));
	public static final Item cfireAxe = (new ItemfireAxe(14506, fire).setCreativeTab(coreFiles.tab).setUnlocalizedName("cfireAxe"));
	public static final Item cilluminiteAxe = (new ItemilluminiteAxe(14507, illuminite).setCreativeTab(coreFiles.tab).setUnlocalizedName("cilluminiteAxe"));
	public static final Item cpureAxe = (new ItempureAxe(14508, pure).setCreativeTab(coreFiles.tab).setUnlocalizedName("cpureAxe"));
	public static final Item cdemoniteAxe = (new ItemdemoniteAxe(14509, demonite).setCreativeTab(coreFiles.tab).setUnlocalizedName("cdemoniteAxe"));
	//SHOVEL
	public static final Item cshadowShovel = (new ItemshadowShovel(14510, shadow).setCreativeTab(coreFiles.tab).setUnlocalizedName("cShadowShovel"));
	public static final Item cfireShovel = (new ItemfireShovel(14511, fire).setCreativeTab(coreFiles.tab).setUnlocalizedName("cfireShovel"));
	public static final Item cilluminiteShovel = (new ItemilluminiteShovel(14512, illuminite).setCreativeTab(coreFiles.tab).setUnlocalizedName("cilluminiteShovel"));
	public static final Item cpureShovel = (new ItempureShovel(14513, pure).setCreativeTab(coreFiles.tab).setUnlocalizedName("cpureShovel"));
	public static final Item cdemoniteShovel = (new ItemdemoniteShovel(14514, demonite).setCreativeTab(coreFiles.tab).setUnlocalizedName("cdemoniteShovel"));
	//HOE
	public static final Item cshadowHoe = (new ItemshadowHoe(14515, shadow).setCreativeTab(coreFiles.tab).setUnlocalizedName("cShadowHoe"));
	public static final Item cfireHoe = (new ItemfireHoe(14516, fire).setCreativeTab(coreFiles.tab).setUnlocalizedName("cFireHoe"));
	public static final Item cilluminiteHoe = (new ItemilluminiteHoe(14517, illuminite).setCreativeTab(coreFiles.tab).setUnlocalizedName("cIlluminiteHoe"));
	public static final Item cpureHoe = (new ItempureHoe(14518, pure).setCreativeTab(coreFiles.tab).setUnlocalizedName("cPureHoe"));
	public static final Item cdemoniteHoe = (new ItemdemoniteHoe(14519, demonite).setCreativeTab(coreFiles.tab).setUnlocalizedName("cDemoniteHoe"));
	//FOOD
	public static final Item Burger = (new ItemFoods (4050, 3, false).setUnlocalizedName("Burger").setCreativeTab(coreFiles.tab));
	public static final Item Flake = (new ItemFoods (4051, 1, false).setUnlocalizedName("Flake").setCreativeTab(coreFiles.tab));
	public static final Item Icecream = (new ItemFoods (4052, 2, false).setUnlocalizedName("Ice Cream").setCreativeTab(coreFiles.tab));
	public static final Item sprinkleIcecream = (new ItemFoods (4053, 2, false).setUnlocalizedName("Sprinkle Ice Cream").setCreativeTab(coreFiles.tab));
	public static final Item chocolateIcecream = (new ItemFoods (4054, 2, false).setUnlocalizedName("Chocolate Ice Cream").setCreativeTab(coreFiles.tab));
	public static final Item flakeIcecream = (new ItemFoods (4062, 2, false).setUnlocalizedName("Flake Ice Cream").setCreativeTab(coreFiles.tab));
	public static final Item Donut = (new ItemFoods (4055, 3, false).setUnlocalizedName("Donut").setCreativeTab(coreFiles.tab));
	public static final Item Carameldonut = (new ItemFoods (4056, 3, false).setUnlocalizedName("Caramel Donut").setCreativeTab(coreFiles.tab));
	public static final Item Chocolatedonut = (new ItemFoods (4057, 3, false).setUnlocalizedName("Chocolate Donut").setCreativeTab(coreFiles.tab));
	public static final Item Sprinkledonut = (new ItemFoods (4059, 3, false).setUnlocalizedName("Sprinke Donut").setCreativeTab(coreFiles.tab));
	public static final Item Chocice = (new ItemFoods (4060, 2, false).setUnlocalizedName("Choc ice").setCreativeTab(coreFiles.tab));
	public static final Item Chocolate = (new ItemFoods (4061, 2, false).setUnlocalizedName("Chocolate").setCreativeTab(coreFiles.tab));
	//FOODITEMS
	public static final Item caramelItem = (new caramelItem(Ids.caramelItem_actual).setCreativeTab(coreFiles.tab).setUnlocalizedName("Caramel"));
	public static final Item potofCaramel = (new potofCaramel(Ids.potofCaramel_actual).setCreativeTab(coreFiles.tab).setUnlocalizedName("Pot of Caramel"));
	public static final Item Chocolatesauce = (new Chocolatesauce(Ids.Chocolatesauce_actual).setCreativeTab(coreFiles.tab).setUnlocalizedName("Chocolate Sauce"));
	public static final Item Sprinkles = (new Sprinkles(Ids.Sprinkles_actual).setCreativeTab(coreFiles.tab).setUnlocalizedName("Sprinkles"));
	public static final Item potofSprinkles = (new potofSprinkles(Ids.potofSprinkles_actual).setCreativeTab(coreFiles.tab).setUnlocalizedName("Pot of Sprinkles"));
	public static final Item Icecreamcone = (new Icecreamcone(Ids.Icecreamcone_actual).setCreativeTab(coreFiles.tab).setUnlocalizedName("Ice Cream cone"));
	public static final Item Burgert = (new Burgertop(Ids.Burgertop_actual).setCreativeTab(coreFiles.tab).setUnlocalizedName("Burger Top"));
	public static final Item Burgerb = (new Burgerbottom(Ids.Burgerbottom_actual).setCreativeTab(coreFiles.tab).setUnlocalizedName("Burger Bottom"));
	public static final Item Plastic = (new DannysMod.Crafting.Plastic(Ids.Plastic_actual).setCreativeTab(coreFiles.tab).setUnlocalizedName("Plastic"));
	public static final Item pizzaBase = (new ItemFoods (4062, 1, false).setCreativeTab(coreFiles.tab).setUnlocalizedName("Pizza Base"));
	public static final Item tomatoPizza = (new ItemFoods (4063, 3, false).setCreativeTab(coreFiles.tab).setUnlocalizedName("Tomato Pizza"));
	public static final Item cheesePizza = (new ItemFoods (4064, 3, false).setCreativeTab(coreFiles.tab).setUnlocalizedName("Cheese Pizza"));
	public static final Item Tomato = (new ItemFoods(4065, 2, false).setCreativeTab(coreFiles.tab).setUnlocalizedName("Tomato"));
	public static final Item Cheese = (new ItemFoods(4066, 2, false).setCreativeTab(coreFiles.tab).setUnlocalizedName("Cheese"));
	//SPAWNEGG
	//public static final Item cbunnyegg = (new cbunnyegg(Ids.cbunnyegg_actual).setUnlocalizedName("Chocolate Bunny Spawn Egg"));

	//BOMBS
	//public static final Item Bottle = (new Bottle(Ids.Bottle_actual).setCreativeTab(coreFiles.tab).setUnlocalizedName("Bottle"));
	//public static final Item unlitMolotov = (new unlitMolotov(Ids.Bottle_actual).setCreativeTab(coreFiles.tab).setUnlocalizedName("Unlit Molotov"));
	//public static final Item Molotov = (new Molotov(Ids.Molotov_actual).setCreativeTab(coreFiles.tab).setUnlocalizedName("Molotov"));
	//PLASMARIFLES
	//public static final Item plasmaRifle = (new plasmaRifle(Ids.plasmaRifle_actual).setCreativeTab(coreFiles.tab).setMaxStackSize(1).setUnlocalizedName("Plasma Rifle"));
	//public static final Item plasmaAmmo = (new plasmaAmmo(Ids.plasmaAmmo_actual, render).setCreativeTab(coreFiles.tab).setMaxStackSize(16).setUnlocalizedName("Plasma Cell"));
	//public static final Item cellEmpty = (new cellEmpty(Ids.cellEmpty_actual, render).setCreativeTab(coreFiles.tab).setMaxStackSize(16).setUnlocalizedName("Empty Cell"));


	//ARMOR
	//SHADOW
	public static final Item shadowHelmet = (new ItemDMArmor(14520, shadowA, render, 0, "shadow").setUnlocalizedName("shadowHelmet"));	
	public static final Item shadowChestplate = (new ItemDMArmor(14521, shadowA, render, 1, "shadow").setUnlocalizedName("shadowChestplate"));	
	public static final Item shadowLeggings = (new ItemDMArmor(14522, shadowA, render, 2, "shadow").setUnlocalizedName("shadowLeggings"));
	public static final Item shadowBoots = (new ItemDMArmor(14523, shadowA, render, 3, "shadow").setUnlocalizedName("shadowBoots"));
	//FIRE
	public static final Item fireHelmet = (new ItemDMArmor(14524, fireA, render, 0, "fire").setUnlocalizedName("fireHelmet"));	
	public static final Item fireChestplate = (new ItemDMArmor(14525, fireA, render, 1, "fire").setUnlocalizedName("fireChestplate"));	
	public static final Item fireLeggings = (new ItemDMArmor(14526, fireA, render, 2, "fire").setUnlocalizedName("fireLeggings"));
	public static final Item fireBoots = (new ItemDMArmor(14527, fireA, render, 3, "fire").setUnlocalizedName("fireBoots"));
	//ILLUMINITE
	public static final Item illuminiteHelmet = (new ItemDMArmor(14528, illuminiteA, render, 0, "illuminite").setUnlocalizedName("illuminiteHelmet"));	
	public static final Item illuminiteChestplate = (new ItemDMArmor(14529, illuminiteA, render, 1, "illuminite").setUnlocalizedName("illuminiteChestplate"));	
	public static final Item illuminiteLeggings = (new ItemDMArmor(14530, illuminiteA, render, 2, "illuminite").setUnlocalizedName("illuminitLeggings"));
	public static final Item illuminiteBoots = (new ItemDMArmor(14531, illuminiteA, render, 3, "illuminite").setUnlocalizedName("illuminiteBoots"));
	//PURE
	public static final Item pureHelmet = (new ItemDMArmor(14532, pureA, render, 0, "pure").setUnlocalizedName("pureHelmet"));	
	public static final Item pureChestplate = (new ItemDMArmor(14533, pureA, render, 1, "pure").setUnlocalizedName("pureChestplate"));	
	public static final Item pureLeggings = (new ItemDMArmor(14534, pureA, render, 2, "pure").setUnlocalizedName("pureLeggings"));
	public static final Item pureBoots = (new ItemDMArmor(14535, pureA, render, 3, "pure").setUnlocalizedName("pureBoots"));
	//DEMONITE
	public static final Item demoniteHelmet = (new ItemDMArmor(14536, demoniteA, render, 0, "demonite").setUnlocalizedName("demoniteHelmet"));	
	public static final Item demoniteChestplate = (new ItemDMArmor(14537, demoniteA, render, 1, "demonite").setUnlocalizedName("demoniteChestplate"));	
	public static final Item demoniteLeggings = (new ItemDMArmor(14538, demoniteA, render, 2, "demonite").setUnlocalizedName("demoniteLeggings"));
	public static final Item demoniteBoots = (new ItemDMArmor(14539, demoniteA, render, 3, "demonite").setUnlocalizedName("demoniteBoots"));

	public static void addNames() {	
		//ITEMS
		LanguageRegistry.addName(shadowitem, Names.shadowItem_name);
		LanguageRegistry.addName(fireitem, Names.fireItem_name);
		LanguageRegistry.addName(illuminiteitem, Names.illuminiteItem_name);
		LanguageRegistry.addName(pureitem, Names.pureItem_name);
		LanguageRegistry.addName(demoniteitem, Names.demoniteItem_name);
		LanguageRegistry.addName(ironRod, Names.ironRod_name);
		LanguageRegistry.addName(cshadowitem, Names.cshadowItem_name);
		LanguageRegistry.addName(cfireitem, Names.cfireItem_name);
		//TOOLS
		LanguageRegistry.addName(shadowPickaxe, Names.shadowPickaxe_name);
		LanguageRegistry.addName(firePickaxe, Names.firePickaxe_name);
		LanguageRegistry.addName(illuminitePickaxe, Names.illuminitePickaxe_name);
		LanguageRegistry.addName(purePickaxe, Names.purePickaxe_name);
		LanguageRegistry.addName(demonitePickaxe, Names.demonitePickaxe_name);
		//SWORDS
		LanguageRegistry.addName(shadowSword, Names.shadowSword_name);
		LanguageRegistry.addName(fireSword, Names.fireSword_name);
		LanguageRegistry.addName(illuminiteSword, Names.illuminiteSword_name);
		LanguageRegistry.addName(pureSword, Names.pureSword_name);
		LanguageRegistry.addName(demoniteSword, Names.demoniteSword_name);
		//AXES
		LanguageRegistry.addName(shadowAxe, Names.shadowAxe_name);
		LanguageRegistry.addName(fireAxe, Names.fireAxe_name);
		LanguageRegistry.addName(illuminiteAxe, Names.illuminiteAxe_name);
		LanguageRegistry.addName(pureAxe, Names.pureAxe_name);
		LanguageRegistry.addName(demoniteAxe, Names.demoniteAxe_name);
		//SHOVEL
		LanguageRegistry.addName(shadowShovel, Names.shadowShovel_name);
		LanguageRegistry.addName(fireShovel, Names.fireShovel_name);
		LanguageRegistry.addName(illuminiteShovel, Names.illuminiteShovel_name);
		LanguageRegistry.addName(pureShovel, Names.pureShovel_name);
		LanguageRegistry.addName(demoniteShovel, Names.demoniteShovel_name);
		//HOES
		LanguageRegistry.addName(shadowHoe, Names.shadowHoe_name);
		LanguageRegistry.addName(fireHoe, Names.fireHoe_name);
		LanguageRegistry.addName(illuminiteHoe, Names.illuminiteHoe_name);
		LanguageRegistry.addName(pureHoe, Names.pureHoe_name);
		LanguageRegistry.addName(demoniteHoe, Names.demoniteHoe_name);
		//FOOD
		LanguageRegistry.addName(Burger, Names.Burger_name);
		LanguageRegistry.addName(Flake, Names.Flake_name);
		LanguageRegistry.addName(Icecream, Names.Icecream_name);
		LanguageRegistry.addName(sprinkleIcecream, Names.sprinkleIcecream_name);
		LanguageRegistry.addName(chocolateIcecream, Names.chocolateIcecream_name);
		LanguageRegistry.addName(Donut, Names.Donut_name);
		LanguageRegistry.addName(Carameldonut, Names.Carameldonut_name);
		LanguageRegistry.addName(Chocolatedonut, Names.Chocolatedonut_name);
		LanguageRegistry.addName(Sprinkledonut, Names.Sprinkledonut_name);
		LanguageRegistry.addName(Chocice, Names.Chocice_name);
		LanguageRegistry.addName(Chocolate, Names.Chocolate_name);
		LanguageRegistry.addName(caramelItem, Names.caramelItem_name);
		LanguageRegistry.addName(potofCaramel, Names.potofCaramel_name);
		LanguageRegistry.addName(Chocolatesauce, Names.Chocolatesauce_name);
		LanguageRegistry.addName(Sprinkles, Names.Sprinkles_name);
		LanguageRegistry.addName(potofSprinkles, Names.potofSprinkles_name);
		LanguageRegistry.addName(Icecreamcone, Names.Icecreamcone_name);
		LanguageRegistry.addName(Burgert, Names.Burgertop_name);
		LanguageRegistry.addName(Burgerb, Names.Burgerbottom_name);
		LanguageRegistry.addName(Plastic, Names.Plastic_name);
		LanguageRegistry.addName(flakeIcecream, Names.flakeIcecream_name);
		LanguageRegistry.addName(pizzaBase, Names.pizzaBase_name);
		LanguageRegistry.addName(tomatoPizza, Names.tomatoPizza_name);
		LanguageRegistry.addName(cheesePizza, Names.cheesePizza_name);
		LanguageRegistry.addName(Tomato, "Tomato");
		LanguageRegistry.addName(Cheese, "Cheese");
		//BOMBS
		//LanguageRegistry.addName(Bottle, Names.Bottle_name);
		//LanguageRegistry.addName(unlitMolotov, Names.unlitMolotov_name);
		//LanguageRegistry.addName(Molotov, Names.Molotov_name);

		//ARMOR
		//SHADOW
		LanguageRegistry.addName(shadowHelmet, Names.shadowHelmet_name);
		LanguageRegistry.addName(shadowChestplate, Names.shadowChestplate_name);
		LanguageRegistry.addName(shadowLeggings, Names.shadowLeggings_name);
		LanguageRegistry.addName(shadowBoots, Names.shadowBoots_name);
		//FIRE
		LanguageRegistry.addName(fireHelmet, Names.fireHelmet_name);
		LanguageRegistry.addName(fireChestplate, Names.fireChestplate_name);
		LanguageRegistry.addName(fireLeggings, Names.fireLeggings_name);
		LanguageRegistry.addName(fireBoots, Names.fireBoots_name);
		//ILLUMINITE
		LanguageRegistry.addName(illuminiteHelmet, Names.illuminiteHelmet_name);
		LanguageRegistry.addName(illuminiteChestplate, Names.illuminiteChestplate_name);
		LanguageRegistry.addName(illuminiteLeggings, Names.illuminiteLeggings_name);
		LanguageRegistry.addName(illuminiteBoots, Names.illuminiteBoots_name);
		//PURE
		LanguageRegistry.addName(pureHelmet, Names.pureHelmet_name);
		LanguageRegistry.addName(pureChestplate, Names.pureChestplate_name);
		LanguageRegistry.addName(pureLeggings, Names.pureLeggings_name);
		LanguageRegistry.addName(pureBoots, Names.pureBoots_name);
		//DEMONITE
		LanguageRegistry.addName(demoniteHelmet, Names.demoniteHelmet_name);
		LanguageRegistry.addName(demoniteChestplate, Names.demoniteChestplate_name);
		LanguageRegistry.addName(demoniteLeggings, Names.demoniteLeggings_name);
		LanguageRegistry.addName(demoniteBoots, Names.demoniteBoots_name);
		//GENERAL
		LanguageRegistry.addName(Limestonefragment, Names.Limestonefragment_name);
		LanguageRegistry.addName(sLimestonefragment, Names.sLimestonefragment_name);
		//RIFLS
		//LanguageRegistry.addName(plasmaRifle, Names.plasmaRifle_name);
		//LanguageRegistry.addName(plasmaAmmo, Names.plasmaAmmo_name);
		//LanguageRegistry.addName(cellEmpty, Names.cellEmpty_name);
	}
	public static void init() {	
	}	

}