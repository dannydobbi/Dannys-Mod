package DannysMod.Blocks;

import java.util.Random;

import DannysMod.coreFiles;
import DannysMod.TabDannysMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import DannysMod.ModInfo;
import DannysMod.Items.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class cshadowOre extends Block {
public cshadowOre(int id) {
super(id, Material.rock);
this.setUnlocalizedName(Names.shadowOre_unlocalizedName);
this.setCreativeTab(coreFiles.tab);
this.setHardness(2F);
this.setResistance(15F);
this.setStepSound(Block.soundStoneFootstep);
}

@Override
@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister i)
	{
	this.blockIcon = i.registerIcon(ModInfo.ID + ":" + "cshadowOre");
	
}

@SideOnly(Side.CLIENT)
public void randomDisplay(World world, int x, int y, int z, Random random) {
	float f1 = (float)x + 0.5F;
	float f2 = (float)y + 1.1F;
	float f3 = (float)z + 0.5F;
	float f4 = random.nextFloat() * 0.6F -0.3F;
	float f5 = random.nextFloat() * -0.6F - -0.3F;
			world.spawnParticle("smoke", (double)(f1+f4), (double)f2, (double)(f3+f5), 0.0D, 0.0D, 0.0D);
	}
}