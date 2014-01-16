package DannysMod.Crafting;

import DannysMod.coreFiles;
import DannysMod.TabDannysMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import DannysMod.ModInfo;
import DannysMod.Items.Names;

public class Plastic extends Item {
	public Plastic(int id) {
		super(id);
	this.setCreativeTab(coreFiles.tab);
	
	this.setUnlocalizedName(Names.Plastic_unlocalizedName);
}
	public void registerIcons(IconRegister i)
	{
	this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "Plastic");
	}
}
