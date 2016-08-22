package shadowlordalpha.shadowtech.proxy;

import net.minecraft.item.Item;

public interface IProxy {
	
	void registerItemRenderer(Item item, int metadata, String id);
}
