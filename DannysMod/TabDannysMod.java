package DannysMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import DannysMod.Items.Items;

public class TabDannysMod extends CreativeTabs {

	public TabDannysMod(String label) {
		super(label);
	}
	public ItemStack getIconItemStack()
	{
	return new ItemStack(Items.shadowitem);
	}
}
