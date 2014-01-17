package DannysMod.Crafting;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import DannysMod.Blocks.Blocks;
import DannysMod.Items.Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void add() {
		
		GameRegistry.addRecipe(new ItemStack(Blocks.shadowBlock, 1), "SSS", "SSS", "SSS", Character.valueOf('S'), Items.shadowitem);
		GameRegistry.addRecipe(new ItemStack(Blocks.fireBlock, 1), "FFF", "FFF", "FFF", Character.valueOf('F'), Items.fireitem);
		GameRegistry.addRecipe(new ItemStack(Blocks.illuminiteBlock, 1), "III", "III", "III", Character.valueOf('I'), Items.illuminiteitem);
		GameRegistry.addRecipe(new ItemStack(Blocks.pureBlock, 1), "PPP", "PPP", "PPP", Character.valueOf('P'), Items.pureitem);
		GameRegistry.addRecipe(new ItemStack(Blocks.demoniteBlock, 1), "DDD", "DDD", "DDD", Character.valueOf('D'), Items.demoniteitem);
		GameRegistry.addRecipe(new ItemStack(Items.ironRod, 2), "I", "I", Character.valueOf('I'), Item.ingotIron);
		//GENERAL
		GameRegistry.addShapelessRecipe(new ItemStack(Items.sLimestonefragment, 1), new ItemStack(Items.Limestonefragment), new ItemStack(Item.flint));
		GameRegistry.addRecipe(new ItemStack(Item.arrow, 8), "L", "S", "F", Character.valueOf('L'), Items.sLimestonefragment, Character.valueOf('S'), Item.stick, Character.valueOf('F'), Item.feather);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.Limestone, 2), "LL", "LL", Character.valueOf('L'), Items.Limestonefragment);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.Limestonebrick, 2), "LL", "LL", Character.valueOf('L'), Blocks.Limestone);
		
		//TOOLS
			//SWORDS
		GameRegistry.addRecipe(new ItemStack(Items.shadowSword, 1), " G ", " G ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.shadowitem);
		GameRegistry.addRecipe(new ItemStack(Items.fireSword, 1), " G ", " G ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.fireitem);
		GameRegistry.addRecipe(new ItemStack(Items.illuminiteSword, 1), " G ", " G ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.illuminiteitem);
		GameRegistry.addRecipe(new ItemStack(Items.pureSword, 1), " G ", " G ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.pureitem);
		GameRegistry.addRecipe(new ItemStack(Items.demoniteSword, 1), " G ", " G ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.demoniteitem);
			//PICKAXES	
		GameRegistry.addRecipe(new ItemStack(Items.shadowPickaxe, 1), "GGG", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.shadowitem);
		GameRegistry.addRecipe(new ItemStack(Items.firePickaxe, 1), "GGG", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.fireitem);
		GameRegistry.addRecipe(new ItemStack(Items.illuminitePickaxe, 1), "GGG", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.illuminiteitem);
		GameRegistry.addRecipe(new ItemStack(Items.purePickaxe, 1), "GGG", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.pureitem);
		GameRegistry.addRecipe(new ItemStack(Items.demonitePickaxe, 1), "GGG", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.demoniteitem);
			//AXES
		GameRegistry.addRecipe(new ItemStack(Items.shadowAxe, 1), " GG", " IG", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.shadowitem);
		GameRegistry.addRecipe(new ItemStack(Items.fireAxe, 1), " GG", " IG", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.fireitem);
		GameRegistry.addRecipe(new ItemStack(Items.illuminiteAxe, 1), " GG", " IG", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.illuminiteitem);
		GameRegistry.addRecipe(new ItemStack(Items.pureAxe, 1), " GG", " IG", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.pureitem);
		GameRegistry.addRecipe(new ItemStack(Items.demoniteAxe, 1), " GG", " IG", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.demoniteitem);
			//SHOVELS
		GameRegistry.addRecipe(new ItemStack(Items.shadowShovel, 1), " G ", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.shadowitem);
		GameRegistry.addRecipe(new ItemStack(Items.fireShovel, 1), " G ", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.fireitem);
		GameRegistry.addRecipe(new ItemStack(Items.illuminiteShovel, 1), " G ", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.illuminiteitem);
		GameRegistry.addRecipe(new ItemStack(Items.pureShovel, 1), " G ", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.pureitem);
		GameRegistry.addRecipe(new ItemStack(Items.demoniteShovel, 1), " G ", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.demoniteitem);
			//HOE
		GameRegistry.addRecipe(new ItemStack(Items.shadowHoe, 1), " GG", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.shadowitem);
		GameRegistry.addRecipe(new ItemStack(Items.fireHoe, 1), " GG", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.fireitem);
		GameRegistry.addRecipe(new ItemStack(Items.illuminiteHoe, 1), " GG", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.illuminiteitem);
		GameRegistry.addRecipe(new ItemStack(Items.pureHoe, 1), " GG", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.pureitem);
		GameRegistry.addRecipe(new ItemStack(Items.demoniteHoe, 1), " GG", " I ", " I ", Character.valueOf('I'), Items.ironRod, Character.valueOf('G'), Items.demoniteitem);
			//FOOD
		GameRegistry.addRecipe(new ItemStack(Items.Burger, 1), " T ", " P ", " B ", Character.valueOf('T'), Items.Burgert, Character.valueOf('P'), Item.porkRaw, Character.valueOf('B'), Items.Burgerb);
		GameRegistry.addRecipe(new ItemStack(Items.Burgert, 1), "WWW", " W ", Character.valueOf('W'), Item.wheat);
		GameRegistry.addRecipe(new ItemStack(Items.Burgerb, 1), " W ", "WWW", Character.valueOf('W'), Item.wheat);
		GameRegistry.addRecipe(new ItemStack(Items.Donut, 1), " W ", "S S", " W ", Character.valueOf('W'), Item.wheat, Character.valueOf('S'), Item.sugar);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Sprinkles, 2), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Item.dyePowder, 1, 6), new ItemStack(Item.dyePowder, 1, 10));
		GameRegistry.addRecipe(new ItemStack(Items.potofSprinkles, 1), " P ", "PSP", "PPP", Character.valueOf('P'), Items.Plastic, Character.valueOf('S'), Items.Sprinkles);
		GameRegistry.addRecipe(new ItemStack(Items.Chocolatesauce, 1), " P ", "PCP", "PPP", Character.valueOf('P'), Items.Plastic, Character.valueOf('C'), Items.Chocolate);
		GameRegistry.addRecipe(new ItemStack(Items.potofCaramel, 1), " P ", "PCP", "PPP", Character.valueOf('P'), Items.Plastic, Character.valueOf('C'), Items.caramelItem);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Flake, 2), new ItemStack(Item.dyePowder, 1, 3), new ItemStack(Item.dyePowder, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Carameldonut, 1), new ItemStack(Items.Donut), new ItemStack(Items.potofCaramel));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Chocolatedonut, 1), new ItemStack(Items.Donut), new ItemStack(Items.Chocolatesauce));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Sprinkledonut, 1), new ItemStack(Items.Donut), new ItemStack(Items.potofSprinkles));
		GameRegistry.addRecipe(new ItemStack(Items.Icecreamcone, 2), "W W", " W ", Character.valueOf('W'), Item.wheat);
		GameRegistry.addRecipe(new ItemStack(Items.Chocolate, 2), "C", "C", Character.valueOf('C'), Items.Flake);
		GameRegistry.addRecipe(new ItemStack(Items.Icecream, 1), "S", "C", Character.valueOf('S'), Item.snowball, Character.valueOf('C'), Items.Icecreamcone);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.chocolateIcecream, 1), new ItemStack(Items.Icecream), new ItemStack(Items.Chocolatesauce));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.sprinkleIcecream, 1), new ItemStack(Items.Icecream), new ItemStack(Items.potofSprinkles));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.flakeIcecream, 1), new ItemStack(Items.Icecream), new ItemStack(Items.Flake));
		GameRegistry.addSmelting(Item.sugar.itemID, new ItemStack(Items.caramelItem, 1), 1F);
		GameRegistry.addSmelting(Block.glass.blockID, new ItemStack(Items.Plastic, 2), 2F);	
		GameRegistry.addRecipe(new ItemStack(Items.pizzaBase, 1), "SWS", "WBW", "SWS", Character.valueOf('W'), Item.wheat, Character.valueOf('S'), Item.sugar, Character.valueOf('B'), Item.bucketWater);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.tomatoPizza, 1), new ItemStack(Items.Tomato), new ItemStack(Items.pizzaBase));
		GameRegistry.addSmelting(Item.bucketMilk.itemID, new ItemStack(Items.Cheese, 2), 5F);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.cheesePizza, 1), new ItemStack(Items.Cheese), new ItemStack(Items.tomatoPizza));
		//ARMOR
			//SHADOW
		GameRegistry.addRecipe(new ItemStack(Items.shadowHelmet, 1), "SSS", "S S", Character.valueOf('S'), Items.shadowitem);
		GameRegistry.addRecipe(new ItemStack(Items.shadowChestplate, 1), "S S", "SSS", "SSS", Character.valueOf('S'), Items.shadowitem);
		GameRegistry.addRecipe(new ItemStack(Items.shadowLeggings, 1), "SSS", "S S", "S S", Character.valueOf('S'), Items.shadowitem);
		GameRegistry.addRecipe(new ItemStack(Items.shadowBoots, 1), "S S", "S S", Character.valueOf('S'), Items.shadowitem);
			//FIRE
		GameRegistry.addRecipe(new ItemStack(Items.fireHelmet, 1), "FFF", "F F", Character.valueOf('F'), Items.fireitem);
		GameRegistry.addRecipe(new ItemStack(Items.fireChestplate, 1), "F F", "FFF", "FFF", Character.valueOf('F'), Items.fireitem);
		GameRegistry.addRecipe(new ItemStack(Items.fireLeggings, 1), "FFF", "F F", "F F", Character.valueOf('F'), Items.fireitem);
		GameRegistry.addRecipe(new ItemStack(Items.fireBoots, 1), "F F", "F F", Character.valueOf('F'), Items.fireitem);
			//ILLUMINITE
		GameRegistry.addRecipe(new ItemStack(Items.illuminiteHelmet, 1), "SSS", "S S", Character.valueOf('S'), Items.illuminiteitem);
		GameRegistry.addRecipe(new ItemStack(Items.illuminiteChestplate, 1), "S S", "SSS", "SSS", Character.valueOf('S'), Items.illuminiteitem);
		GameRegistry.addRecipe(new ItemStack(Items.illuminiteLeggings, 1), "SSS", "S S", "S S", Character.valueOf('S'), Items.illuminiteitem);
		GameRegistry.addRecipe(new ItemStack(Items.illuminiteBoots, 1), "S S", "S S", Character.valueOf('S'), Items.illuminiteitem);
			//PURE
		GameRegistry.addRecipe(new ItemStack(Items.pureHelmet, 1), "SSS", "S S", Character.valueOf('S'), Items.pureitem);
		GameRegistry.addRecipe(new ItemStack(Items.pureChestplate, 1), "S S", "SSS", "SSS", Character.valueOf('S'), Items.pureitem);
		GameRegistry.addRecipe(new ItemStack(Items.pureLeggings, 1), "SSS", "S S", "S S", Character.valueOf('S'), Items.pureitem);
		GameRegistry.addRecipe(new ItemStack(Items.pureBoots, 1), "S S", "S S", Character.valueOf('S'), Items.pureitem);
			//DEMONITE
		GameRegistry.addRecipe(new ItemStack(Items.demoniteHelmet, 1), "SSS", "S S", Character.valueOf('S'), Items.demoniteitem);
		GameRegistry.addRecipe(new ItemStack(Items.demoniteChestplate, 1), "S S", "SSS", "SSS", Character.valueOf('S'), Items.demoniteitem);
		GameRegistry.addRecipe(new ItemStack(Items.demoniteLeggings, 1), "SSS", "S S", "S S", Character.valueOf('S'), Items.demoniteitem);
		GameRegistry.addRecipe(new ItemStack(Items.demoniteBoots, 1), "S S", "S S", Character.valueOf('S'), Items.demoniteitem);
			//GEMS
		GameRegistry.addSmelting(Blocks.demoniteOre.blockID, new ItemStack(Items.demoniteitem, 1), 2F);		
		GameRegistry.addSmelting(Blocks.illuminiteOre.blockID, new ItemStack(Items.illuminiteitem, 1), 2F);
		GameRegistry.addSmelting(Blocks.pureOre.blockID, new ItemStack(Items.pureitem, 1), 2F);
		GameRegistry.addSmelting(Blocks.shadowOre.blockID, new ItemStack(Items.shadowitem, 1), 2F);
		GameRegistry.addSmelting(Blocks.fireOre.blockID, new ItemStack(Items.fireitem, 1), 2F);
		
	}

	public static void init() {
	}
}
