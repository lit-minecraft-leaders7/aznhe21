package com.example.examplemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

	public MyBlock myBlock;
	public MyItem myItem;
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
		myBlock = new MyBlock();
		GameRegistry.registerBlock(myBlock, "myblock");

		myItem = new MyItem();
		GameRegistry.registerItem(myItem, "myitem");
    }

	/*@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 50),
				" A ",
				"CBC",
				"CBC",
				'A', new ItemStack(Items.skull, 1, 4),
				'B', Blocks.tnt,
				'C', Items.gunpowder);

		GameRegistry.addRecipe(new ItemStack(myItem, 1, 50),
				" B ",
				"BAB",
				" B ",
				'A', new ItemStack(Items.diamond_sword),
				'B', Items.gunpowder);
	}*/
}
