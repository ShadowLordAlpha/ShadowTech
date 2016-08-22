package shadowlordalpha.shadowtech.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import shadowlordalpha.shadowcore.client.creativetab.CreativeTab;

public class STItem {
	
	public static final CreativeTab SHADOW_TECH = new CreativeTab("somethingorother");

	// Dust
	
	// Nuggets
	
	// Ingots
	public static ItemBase ingotCopper;
	public static ItemBase ingotTin;
	public static ItemBase ingotAluminium;
	public static ItemBase ingotNickel;
	public static ItemBase ingotSilver;
	public static ItemBase ingotLead;
	public static ItemBase ingotPlatium;
	public static ItemBase ingotUranium;
	public static ItemBase ingotThroium;
	
	// Shards - the nuggets of gems
	public static ItemBase shardAmethyst;
	public static ItemBase shardAquamarine;
	public static ItemBase shardDiamond;
	public static ItemBase shardEmerald;
	public static ItemBase shardGarnet;
	public static ItemBase shardJade;
	public static ItemBase shardMoonstone;
	public static ItemBase shardOpal;
	public static ItemBase shardPearl;
	public static ItemBase shardRuby;
	public static ItemBase shardSapphire;
	public static ItemBase shardTanzanite;
	public static ItemBase shardTourmaline;
	public static ItemBase shardTurquoise;
	public static ItemBase shardZircon;
	
	// Gems - could possibly make this into one meta item but lazyness
	public static ItemBase gemAmethyst;
	public static ItemBase gemAquamarine;
	// These two are already included in minecraft
	// public static ItemBase gemDiamond;
	// public static ItemBase gemEmerald;
	public static ItemBase gemGarnet;
	public static ItemBase gemJade;
	public static ItemBase gemMoonstone;
	public static ItemBase gemOpal;
	public static ItemBase gemPearl;
	public static ItemBase gemRuby;
	public static ItemBase gemSapphire;
	public static ItemBase gemTanzanite;
	public static ItemBase gemTourmaline;
	public static ItemBase gemTurquoise;
	public static ItemBase gemZircon;
	

	public static void init() {
		ingotCopper = register(new ItemBase("ingotCopper").setCreativeTab(SHADOW_TECH));
		
		// Shard items
		shardAmethyst = register(new ItemBase("shardAmethyst").setCreativeTab(SHADOW_TECH));
		shardAquamarine = register(new ItemBase("shardAquamarine").setCreativeTab(SHADOW_TECH));
		shardDiamond = register(new ItemBase("shardDiamond").setCreativeTab(SHADOW_TECH));
		shardEmerald = register(new ItemBase("shardEmerald").setCreativeTab(SHADOW_TECH));
		shardGarnet = register(new ItemBase("shardGarnet").setCreativeTab(SHADOW_TECH));
		shardJade = register(new ItemBase("shardJade").setCreativeTab(SHADOW_TECH));
		shardMoonstone = register(new ItemBase("shardMoonstone").setCreativeTab(SHADOW_TECH));
		shardOpal = register(new ItemBase("shardOpal").setCreativeTab(SHADOW_TECH));
		shardPearl = register(new ItemBase("shardPearl").setCreativeTab(SHADOW_TECH));
		shardRuby = register(new ItemBase("shardRuby").setCreativeTab(SHADOW_TECH));
		shardSapphire = register(new ItemBase("shardSapphire").setCreativeTab(SHADOW_TECH));
		shardTanzanite = register(new ItemBase("shardTanzanite").setCreativeTab(SHADOW_TECH));
		shardTourmaline = register(new ItemBase("shardTourmaline").setCreativeTab(SHADOW_TECH));
		shardTurquoise = register(new ItemBase("shardTurquoise").setCreativeTab(SHADOW_TECH));
		shardZircon = register(new ItemBase("shardZircon").setCreativeTab(SHADOW_TECH));
		
		// Gem items
		gemAmethyst = register(new ItemBase("gemAmethyst").setCreativeTab(SHADOW_TECH));
		gemAquamarine = register(new ItemBase("gemAquamarine").setCreativeTab(SHADOW_TECH));
		gemGarnet = register(new ItemBase("gemGarnet").setCreativeTab(SHADOW_TECH));
		gemJade = register(new ItemBase("gemJade").setCreativeTab(SHADOW_TECH));
		gemMoonstone = register(new ItemBase("gemMoonstone").setCreativeTab(SHADOW_TECH));
		gemOpal = register(new ItemBase("gemOpal").setCreativeTab(SHADOW_TECH));
		gemPearl = register(new ItemBase("gemPearl").setCreativeTab(SHADOW_TECH));
		gemRuby = register(new ItemBase("gemRuby").setCreativeTab(SHADOW_TECH));
		gemSapphire = register(new ItemBase("gemSapphire").setCreativeTab(SHADOW_TECH));
		gemTanzanite = register(new ItemBase("gemTanzanite").setCreativeTab(SHADOW_TECH));
		gemTourmaline = register(new ItemBase("gemTourmaline").setCreativeTab(SHADOW_TECH));
		gemTurquoise = register(new ItemBase("gemTurquoise").setCreativeTab(SHADOW_TECH));
		gemZircon = register(new ItemBase("gemZircon").setCreativeTab(SHADOW_TECH));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if(item instanceof ItemBase) {
			((ItemBase) item).registerItemModel();
		}

		return item;
	}
}
