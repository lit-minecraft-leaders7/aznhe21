package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MyItem extends Item {
	public MyItem() {
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName("myitem");
		setTextureName("examplemod:myitem");
	}
}
