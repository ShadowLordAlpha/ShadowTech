package shadowlordalpha.shadowtech.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import shadowlordalpha.shadowtech.common.STConfig;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerItemRenderer(Item item, int metadata, String id) {
		ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(STConfig.MODID + ":" + id, "inventory"));
	}
}
