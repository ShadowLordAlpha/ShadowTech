package shadowlordalpha.shadowtech.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import shadowlordalpha.shadowtech.common.STConfig;
import shadowlordalpha.shadowtech.common.ShadowTech;

public class ItemBase extends Item {

	protected String name;
	
	public ItemBase(String name) {
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(STConfig.MODID, name);
	}
	
	public void registerItemModel() {
		ShadowTech.proxy.registerItemRenderer(this, 0, name);
	}
	
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
