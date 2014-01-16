package DannysMod.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import DannysMod.ModInfo;
import DannysMod.coreFiles;
import DannysMod.Items.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class fireOre extends Block {
public fireOre(int id) {
super(id, Material.rock);
this.setUnlocalizedName(Names.fireOre_unlocalizedName);
this.setCreativeTab(coreFiles.tab);
this.setHardness(2F);
this.setResistance(15F);
this.setStepSound(Block.soundStoneFootstep);
}
@Override
@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister i)
	{
	this.blockIcon = i.registerIcon(ModInfo.ID + ":" + "fireOre");
	
}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        float f = 0.01F;
        return AxisAlignedBB.getAABBPool().getAABB((double)((float)par2 + f), (double)par3, (double)((float)par4 + f), (double)((float)(par2 + 1) - f), (double)((float)(par3 + 1) - f), (double)((float)(par4 + 1) - f));
    }
        

    @SideOnly(Side.CLIENT)

    /**
     * Returns the bounding box of the wired rectangular prism to render.
     */
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        float f = 0.01F;
        return AxisAlignedBB.getAABBPool().getAABB((double)((float)par2 + f), (double)par3, (double)((float)par4 + f), (double)((float)(par2 + 1) - f), (double)(par3 + 1), (double)((float)(par4 + 1) - f));
    }

public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
{
    par5Entity.attackEntityFrom(DamageSource.onFire, 1.0F);
}
@SideOnly(Side.CLIENT)
public void randomDisplay(World world, int x, int y, int z, Random random) {
	float f1 = (float)x + 0.5F;
	float f2 = (float)y + 1.1F;
	float f3 = (float)z + 0.5F;
	float f4 = random.nextFloat() * 0.6F -0.3F;
	float f5 = random.nextFloat() * -0.6F - -0.3F;
			world.spawnParticle("smoke", (double)(f1+f4), (double)f2, (double)(f3+f5), 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", (double)(f1+f4), (double)f2, (double)(f3+f5), 0.0D, 0.0D, 0.0D);
	}
}
