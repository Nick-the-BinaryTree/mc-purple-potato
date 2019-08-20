package net.minecraft.src;

import java.util.Map;

public class mod_Footprints extends BaseMod {
	
	public void addRenderer(Map map){
		map.put(PotatoDog.class,new RenderWolf(new ModelWolf(),new ModelWolf(),0.7f));
	}

	public static Block myFirstBlock = new Block(174, Material.wood)
	.setUnlocalizedName("TurtleMatter")
	.setCreativeTab(CreativeTabs.tabMisc)
	.setHardness(1.0f)
	.setLightValue(.1f);
	
	public static Block Panda = new Block(179, Material.rock)
	.setUnlocalizedName("Panda")
	.setCreativeTab(CreativeTabs.tabMisc)
	.setHardness(20.0f)
	.setLightValue(.1f);
	
	public static Item MegaPotato = new MagicalPotato(180,31,false)
	.setUnlocalizedName("MegaPotato")
	.setCreativeTab(CreativeTabs.tabMisc);
	
	public static Item PotatoArrow = new Item(177)
	.setUnlocalizedName("PotatoArrow");
	
	public static Item PotatoBoots = new ItemArmor (178, EnumArmorMaterial.POTATO, 0, 3)
	.setUnlocalizedName("PotatoBoots")
	.setCreativeTab(CreativeTabs.tabMisc);
	
	public static Item DarkPotato = new DarkPotato(181)
	.setUnlocalizedName("DarkPotato")
	.setCreativeTab(CreativeTabs.tabMisc);
	
	public String getVersion()
{
		return "Version 1.0";
		}
	
	public void load(){
	ModLoader.registerEntityID(PotatoDog.class,"PotatoDog", 63, 134, 1234);
	ModLoader.addSpawn(PotatoDog.class,1,1,1,EnumCreatureType.creature);
	
	ModLoader.registerBlock(myFirstBlock);
	ModLoader.addName(DarkPotato, "Dark Potato");
	ModLoader.registerBlock(Panda);
	ModLoader.addName(Panda, "Panda Essence");
	ModLoader.addName(myFirstBlock, "Turtle Matter");
	ModLoader.addName(MegaPotato, "Mega Potato");
	ModLoader.addLocalization("entity.PotatoDog.name", "en_US", "Potato Dog");
	//ModLoader.addName(PotatoArrow, "MPP (Mega Potato Projectile)");
	ModLoader.addName(PotatoBoots, "Potato Clogs");
	ModLoader.addRecipe(new ItemStack(MegaPotato, 1), new Object[]{"WWW", "WWW", "WWW", 'W', Item.potato});
	//ModLoader.addShapelessRecipe(new ItemStack(PotatoArrow, 1), new Object[]{Item.arrow, MegaPotato});
	ModLoader.addShapelessRecipe(new ItemStack(DarkPotato, 1), new Object[]{new ItemStack(Item.dyePowder,1,0), MegaPotato});
	ModLoader.addShapelessRecipe(new ItemStack(PotatoBoots, 1), new Object[]{Item.bootsLeather, MegaPotato});
}
}