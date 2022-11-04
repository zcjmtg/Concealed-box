
package com.concealed_box.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.concealed_box.block.Box5Block;
import com.concealed_box.ConcealedBoxModElements;

@ConcealedBoxModElements.ModElement.Tag
public class ConcealedboxItemGroup extends ConcealedBoxModElements.ModElement {
	public ConcealedboxItemGroup(ConcealedBoxModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabconcealedbox") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Box5Block.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
