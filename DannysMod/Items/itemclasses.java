package DannysMod.Items;

import DannysMod.coreFiles;
import DannysMod.TabDannysMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import DannysMod.ModInfo;

public class itemclasses extends Item {
	public itemclasses(int id) {
		super(id);
	this.setCreativeTab(coreFiles.tab);
	
	this.setUnlocalizedName(Names.cshadowItem_unlocalizedName);
	}
		public void registerIcons(IconRegister i)
		{
			if(itemID == Items.cshadowitem.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "cshadowitem");
			if(itemID == Items.cfireitem.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "cfireitem");
			if(itemID == Items.Limestonefragment.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "limestonefragment");
			if(itemID == Items.sLimestonefragment.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "sharpenedlimestonefragment");
		
		}
	}
