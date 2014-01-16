package DannysMod.Crafting;

import DannysMod.ModInfo;
import DannysMod.coreFiles;
import DannysMod.TabDannysMod;
import DannysMod.Items.Items;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItempureSword extends ItemSword
{
	public ItempureSword(int par1, EnumToolMaterial par2EnumToolMaterial) 
	{
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(coreFiles.tab);
	}
    public void registerIcons(IconRegister i)
    {
	if(itemID == Items.pureSword.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "pureSword");
    }
}
