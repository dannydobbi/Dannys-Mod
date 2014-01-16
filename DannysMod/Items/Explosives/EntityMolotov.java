package DannysMod.Items.Explosives;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityMolotov extends EntityThrowable
{
	private float explosionRadius;
	public EntityMolotov (World par1World)
{
		super(par1World);
}
	public EntityMolotov (World par1World, double par2, double par4, double par6)
	{
		super (par1World, par2, par4, par6);
	}
	@Override
	protected void onImpact (MovingObjectPosition movingobjectposition)
	{
		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true);
		this.setDead();
	}
}