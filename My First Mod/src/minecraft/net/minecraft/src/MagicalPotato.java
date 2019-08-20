package net.minecraft.src;

public class MagicalPotato extends ItemFood{


	
	public MagicalPotato(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
		// TODO Auto-generated constructor stub
	}

	public int getDamageVsEntity(Entity par1Entity){
		par1Entity.setFire(8);
		return 1;
	}

}
