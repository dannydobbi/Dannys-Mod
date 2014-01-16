
package DannysMod.Mobs;

import DannysMod.ModInfo;
import DannysMod.Items.Items;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityGhoul extends EntityMob
	{
	public EntityGhoul(World par1World) {
		
		super(par1World);
		
		this.setSize(1.5F, 2.0F);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, 1.0D, false));
		this.tasks.addTask(5, new EntityAIWander(this, 0.8D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this,EntityPlayer.class, 8.0F));
		this.tasks.addTask(6, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
	}
	@Override
	protected String getLivingSound()
	{
		return "mob.zombie.say";
	}
	@Override
	protected String getHurtSound()
	{
		return "mob.zombie.hurt";
	}
	@Override
	protected String getDeathSound()
	{
		return "mob.zombie.death";
	}
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(12D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.53000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(3D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(5D);
		
	}
	@Override
	protected int getDropItemId()
	{
		return Items.demoniteitem.itemID;
	}
	@Override
	protected boolean isValidLightLevel()
	{
		return true;
	}
}
