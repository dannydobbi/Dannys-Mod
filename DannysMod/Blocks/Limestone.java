package DannysMod.Blocks;

import java.util.Random;

import DannysMod.coreFiles;
import DannysMod.TabDannysMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import DannysMod.ModInfo;
import DannysMod.Items.Items;
import DannysMod.Items.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Limestone extends Block {
public Limestone(int id) {
super(id, Material.rock);
this.setUnlocalizedName(Names.Limestone_unlocalizedName);
this.setCreativeTab(coreFiles.tab);
this.setHardness(2F);
this.setResistance(15F);
this.setStepSound(Block.soundStoneFootstep);
}

@Override
@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister i)
	{
	this.blockIcon = i.registerIcon(ModInfo.ID + ":" + "Limestone");
	
	}
public int idDropped(int par1, Random random, int zero) {
    return Items.Limestonefragment.itemID;
}
}