package DannysMod.Liquid;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import DannysMod.ModInfo;
import DannysMod.coreFiles;
import DannysMod.Items.Names;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class LiquidplasmaStill extends BlockStationary{
    
    public LiquidplasmaStill(int par1) {
            super(par1, Material.water);

            this.blockHardness = 100.0F;
            this.setLightOpacity(3);
            this.disableStats();
            this.setRequiresSelfNotify();
            }
    
private void setRequiresSelfNotify() {

		
	}

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconRegister) {
    this.theIcon = new Icon[] {
            iconRegister.registerIcon(ModInfo.ID + ":" + "plasma_still"),
            iconRegister.registerIcon(ModInfo.ID + ":" + "plasma_flow") };
}
public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
{
  if (par5Entity instanceof EntityLivingBase)
  {
   ((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.poison.getId(), 125, 0));
  }
}
}