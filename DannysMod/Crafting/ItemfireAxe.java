package DannysMod.Crafting;

import DannysMod.ModInfo;
import DannysMod.Items.Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemfireAxe extends ItemAxe
{
    public static final Block[] blocksEffectiveAgainst = new Block[] {Block.leaves,Block.wood,Block.woodDoubleSlab,Block.woodenButton,Block.woodSingleSlab,Block.workbench,Block.woodSingleSlab,Block.chest,Block.chestTrapped};

    public ItemfireAxe(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
    }

    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return par2Block != null && (par2Block.blockMaterial == Material.iron || par2Block.blockMaterial == Material.anvil || par2Block.blockMaterial == Material.rock) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(par1ItemStack, par2Block);
    }
    public void registerIcons(IconRegister i)
    {
	if(itemID == Items.fireAxe.itemID) this.itemIcon = i.registerIcon(ModInfo.ID + ":" + "fireAxe");
    }
}