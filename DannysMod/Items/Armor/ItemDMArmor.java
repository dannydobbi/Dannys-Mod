package DannysMod.Items.Armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import DannysMod.ModInfo;
import DannysMod.coreFiles;
import DannysMod.Items.Items;

public class ItemDMArmor extends ItemArmor
{
	public String armorNamePrefix;

	public ItemDMArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String armorName) 
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.armorNamePrefix = armorName;
		this.setCreativeTab(coreFiles.tab);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
	{
		if(stack.toString().contains("Leggings"))
		{
			return ModInfo.ID + ":" + armorNamePrefix + "_2.png";
		}

		return ModInfo.ID + ":" + armorNamePrefix + "_1.png";
	}

	public void registerIcons(IconRegister i)
	{
		if(itemID == Items.fireHelmet.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "fireHelmet");
		if(itemID == Items.fireChestplate.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "fireChestplate");
		if(itemID == Items.fireLeggings.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "fireLeggings");
		if(itemID == Items.fireBoots.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "fireBoots");
		
		if(itemID == Items.shadowHelmet.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "shadowHelmet");
		if(itemID == Items.shadowChestplate.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "shadowChestplate");
		if(itemID == Items.shadowLeggings.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "shadowLeggings");
		if(itemID == Items.shadowBoots.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "shadowBoots");
		
		if(itemID == Items.illuminiteHelmet.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "illuminiteHelmet");
		if(itemID == Items.illuminiteChestplate.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "illuminiteChestplate");
		if(itemID == Items.illuminiteLeggings.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "illuminiteLeggings");
		if(itemID == Items.illuminiteBoots.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "illuminiteBoots");
		
		if(itemID == Items.pureHelmet.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "pureHelmet");
		if(itemID == Items.pureChestplate.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "pureChestplate");
		if(itemID == Items.pureLeggings.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "pureLeggings");
		if(itemID == Items.pureBoots.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "pureBoots");
		
		if(itemID == Items.demoniteHelmet.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "demoniteHelmet");
		if(itemID == Items.demoniteChestplate.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "demoniteChestplate");
		if(itemID == Items.demoniteLeggings.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "demoniteLeggings");
		if(itemID == Items.demoniteBoots.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "demoniteBoots");
	}
}