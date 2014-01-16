
package DannysMod.Mobs;

import DannysMod.Mobs.*;
import DannysMod.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

public class RenderGhoul extends RenderBiped
	{
		public RenderGhoul(ModelBiped var1, float shadow)
		{
		super(var1, shadow);
		}
		
		public void RenderGhoul1(EntityGhoul var1, double var2, double var4, double var6, float var8, float var9)
		{
			super.doRender(var1, var2, var4, var6, var8, var9);
		}
		
		public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
		{
			this.RenderGhoul1((EntityGhoul)var1, var2, var4, var6, var8, var9);
		}
			
		public void doGhoul(Entity var1, double var2, double var4, double var6, float var8, float var9)
		{	
			this.RenderGhoul1((EntityGhoul)var1, var2, var4, var6, var8, var9);
		}
		@Override
		protected ResourceLocation getEntityTexture(Entity entity) {
			ResourceLocation texture = new ResourceLocation(ModInfo.ID + ":" + "Ghoul");
			return texture;
		}
	}
	