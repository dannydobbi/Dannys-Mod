
package DannysMod.Mobs;

import DannysMod.Items.Items;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntitychocolateBunny extends EntityAnimal
	{
	public EntitychocolateBunny(World par1World) 
		{
		super(par1World);
        this.getNavigator().setAvoidsWater(true);
		this.setSize(1.5F, 2.0F);
		float var2 = 0.25F;
		this.isImmuneToFire = false;
		
		this.tasks.addTask(0, new EntityAISwimming(this));

        //This makes the mob run away when you punch it
        this.tasks.addTask(1, new EntityAIPanic(this, 0.38F));

        //If you have mating code, this allows it to mate.
        this.tasks.addTask(2, new EntityAIMate(this, var2));

        //This code is used to get the mob to follow you (like cows with wheat). Here it's set to a custom fruit
        this.tasks.addTask(3, new EntityAITempt(this, 0.3F, Items.Chocolate.itemID, false));

        //If the mob is a child, it will follow it's parent.
        this.tasks.addTask(4, new EntityAIFollowParent(this, 0.28F));

        //This makes the mob walk around. Without it, it'd just stand still.
        this.tasks.addTask(5, new EntityAIWander(this, var2));

        //This makes the mob watch the nearest player, within a range set by the float.
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));

        //Finally, this makes it look around when it's not looking at a player or wandering.
        this.tasks.addTask(7, new EntityAILookIdle(this));
	}
	
	@Override
	protected String getLivingSound()
	{
		return "mob.chicken.say";
	}
	
	@Override
	protected String getHurtSound()
	{
		return "mob.chicken.hurt";
	}
	@Override
	protected String getDeathSound()
	{
		return "mob.chicken.death";
	}
	@Override
	protected void applyEntityAttributes()
	
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(10.0D);
		
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.53000000417232513D);
	}
	@Override
	protected int getDropItemId()
	{
		return Items.Chocolate.itemID;
	}
	@Override
	public EntityAgeable createChild(EntityAgeable entityageable) {
		// TODO Auto-generated method stub
		return null;
	}
}
