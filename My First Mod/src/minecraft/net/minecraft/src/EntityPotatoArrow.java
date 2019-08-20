package net.minecraft.src;

public class EntityPotatoArrow extends EntityArrow{
	 public EntityPotatoArrow(World par1World)
	    {
	        super(par1World);
	        this.renderDistanceWeight = 10.0D;
	        this.setSize(0.5F, 0.5F);
	    }

	    public EntityPotatoArrow(World par1World, double par2, double par4, double par6)
	    {
	        super(par1World);
	        this.renderDistanceWeight = 10.0D;
	        this.setSize(0.5F, 0.5F);
	        this.setPosition(par2, par4, par6);
	        this.yOffset = 0.0F;
	    }

	    public EntityPotatoArrow(World par1World, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving, float par4, float par5)
	    {
	        super(par1World);
	        this.renderDistanceWeight = 10.0D;
	        this.shootingEntity = par2EntityLiving;

	        if (par2EntityLiving instanceof EntityPlayer)
	        {
	            this.canBePickedUp = 1;
	        }

	        this.posY = par2EntityLiving.posY + (double)par2EntityLiving.getEyeHeight() - 0.10000000149011612D;
	        double var6 = par3EntityLiving.posX - par2EntityLiving.posX;
	        double var8 = par3EntityLiving.boundingBox.minY + (double)(par3EntityLiving.height / 3.0F) - this.posY;
	        double var10 = par3EntityLiving.posZ - par2EntityLiving.posZ;
	        double var12 = (double)MathHelper.sqrt_double(var6 * var6 + var10 * var10);

	        if (var12 >= 1.0E-7D)
	        {
	            float var14 = (float)(Math.atan2(var10, var6) * 180.0D / Math.PI) - 90.0F;
	            float var15 = (float)(-(Math.atan2(var8, var12) * 180.0D / Math.PI));
	            double var16 = var6 / var12;
	            double var18 = var10 / var12;
	            this.setLocationAndAngles(par2EntityLiving.posX + var16, this.posY, par2EntityLiving.posZ + var18, var14, var15);
	            this.yOffset = 0.0F;
	            float var20 = (float)var12 * 0.2F;
	            this.setThrowableHeading(var6, var8 + (double)var20, var10, par4, par5);
	        }
	    }

	    public EntityPotatoArrow(World par1World, EntityLiving par2EntityLiving, float par3)
	    {
	        super(par1World);
	        this.renderDistanceWeight = 10.0D;
	        this.shootingEntity = par2EntityLiving;

	        if (par2EntityLiving instanceof EntityPlayer)
	        {
	            this.canBePickedUp = 1;
	        }

	        this.setSize(0.5F, 0.5F);
	        this.setLocationAndAngles(par2EntityLiving.posX, par2EntityLiving.posY + (double)par2EntityLiving.getEyeHeight(), par2EntityLiving.posZ, par2EntityLiving.rotationYaw, par2EntityLiving.rotationPitch);
	        this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
	        this.posY -= 0.10000000149011612D;
	        this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
	        this.setPosition(this.posX, this.posY, this.posZ);
	        this.yOffset = 0.0F;
	        this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI));
	        this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI));
	        this.motionY = (double)(-MathHelper.sin(this.rotationPitch / 180.0F * (float)Math.PI));
	        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, par3 * 1.5F, 1.0F);
	    }
}
