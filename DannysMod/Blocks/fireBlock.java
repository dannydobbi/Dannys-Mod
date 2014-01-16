package DannysMod.Blocks;

import DannysMod.coreFiles;
import DannysMod.TabDannysMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import DannysMod.ModInfo;
import DannysMod.Items.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class fireBlock extends Block {
public fireBlock(int id) {
super(id, Material.rock);
this.setUnlocalizedName(Names.fireBlock_unlocalizedName);
this.setCreativeTab(coreFiles.tab);
this.setHardness(2F);
this.setResistance(15F);
this.setStepSound(Block.soundStoneFootstep);
}

@Override
@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister i)
	{
	this.blockIcon = i.registerIcon(ModInfo.ID + ":" + "fireBlock");
	
}
}