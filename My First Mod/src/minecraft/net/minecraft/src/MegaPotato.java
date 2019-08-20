package net.minecraft.src;

public class MegaPotato extends ItemFood {

	public MegaPotato(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getDamageVsEntity(Entity e){
		return 1;
	}

}
