//package DannysMod.Items.Explosives;
//
//import DannysMod.ModInfo;
//import net.minecraft.block.Block;
//import net.minecraft.client.renderer.texture.IconRegister;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.entity.projectile.EntitySnowball;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.world.World;
//import DannysMod.Items.Explosives.*;

//public class Molotov extends Item
//{
//	public Molotov (int par1)
//	{
//		super(par1);
//	}
//	   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
//	   {
//	       if (!par3EntityPlayer.capabilities.isCreativeMode)
//	       {
//	           --par1ItemStack.stackSize;
//	       }
//	       par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
//	       if (!par2World.isRemote)
//	       {
//	           par2World.spawnEntityInWorld(new EntityMolotov(par2World));
//	       }
//	       return par1ItemStack;
//	   }
//	   
//		public void registerIcons(IconRegister i)
//		{
//		this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "Molotov");
//		}
//	}
