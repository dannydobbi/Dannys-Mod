
package DannysMod.Mobs;

import DannysMod.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderchocolateBunny extends RenderLiving
{
    public RenderchocolateBunny(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    public void renderCow(EntityCow par1EntityCow, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityCow, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderCow((EntityCow)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderCow((EntityCow)par1Entity, par2, par4, par6, par8, par9);
    }
	protected ResourceLocation getEntityTexuture(Entity entity) {
		ResourceLocation texture = new ResourceLocation(ModInfo.ID + ":" + "chocolateBunny");
		return texture;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return null;
	}
}
