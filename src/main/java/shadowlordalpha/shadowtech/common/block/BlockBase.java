package shadowlordalpha.shadowtech.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import shadowlordalpha.shadowtech.common.ShadowTech;

public class BlockBase extends Block {
	
	private String name;

	public BlockBase(Material materialIn) {
		super(materialIn);
	}

	public void registerItemModel(ItemBlock itemBlock) {
		ShadowTech.proxy.registerItemRenderer(itemBlock, 0, name);
	}

	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
