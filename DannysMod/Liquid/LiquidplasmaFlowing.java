package DannysMod.Liquid;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import DannysMod.ModInfo;
import DannysMod.coreFiles;
import DannysMod.Items.Names;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class LiquidplasmaFlowing extends BlockFlowing {
    
    public LiquidplasmaFlowing(int par1) {
            super(par1, Material.water);

            this.blockHardness = 100.0F;
            this.setLightOpacity(3);
            this.setCreativeTab(coreFiles.tab);
            }
    
@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconRegister) {
    this.theIcon = new Icon[] {
            iconRegister.registerIcon(ModInfo.ID + ":" + "plasma_still"),
            iconRegister.registerIcon(ModInfo.ID + ":" + "plasma_flow") };
}

}