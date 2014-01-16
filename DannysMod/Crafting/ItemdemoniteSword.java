package DannysMod.Crafting;

import DannysMod.ModInfo;
import DannysMod.coreFiles;
import DannysMod.TabDannysMod;
import DannysMod.Items.Items;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemdemoniteSword extends ItemSword
{
	public ItemdemoniteSword(int par1, EnumToolMaterial par2EnumToolMaterial) 
	{
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(coreFiles.tab);
	}
    public void registerIcons(IconRegister i)
    {
	if(itemID == Items.demoniteSword.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "demoniteSword");
    }
    
    public boolean hasEffect(ItemStack par1ItemStack) {
    boolean hasEnchant; {
    	
    }
    	return true;
    }
}
