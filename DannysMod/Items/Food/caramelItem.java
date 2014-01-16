package DannysMod.Items.Food;

import DannysMod.coreFiles;
import DannysMod.TabDannysMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import DannysMod.ModInfo;
import DannysMod.Items.Names;

public class caramelItem extends Item {
	public caramelItem(int id) {
		super(id);
	this.setCreativeTab(coreFiles.tab);
	
	this.setUnlocalizedName(Names.caramelItem_unlocalizedName);
}
	public void registerIcons(IconRegister i)
	{
	this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "Caramel");
	}
}
