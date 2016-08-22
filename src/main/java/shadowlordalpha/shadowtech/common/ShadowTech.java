package shadowlordalpha.shadowtech.common;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import shadowlordalpha.shadowtech.common.item.STItem;
import shadowlordalpha.shadowtech.proxy.IProxy;

@Mod(modid = STConfig.MODID, version = STConfig.VERSION)
public class ShadowTech {

	@Instance(STConfig.MODID)
	public static ShadowTech instance;
	
	@SidedProxy(modId = STConfig.MODID, clientSide = "shadowlordalpha.shadowtech.proxy.ClientProxy", serverSide = "shadowlordalpha.shadowtech.proxy.ServerProxy")
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		STItem.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
