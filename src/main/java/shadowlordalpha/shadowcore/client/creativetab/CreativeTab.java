/**
 * The MIT License (MIT)
 * 
 * Copyright (c) 2016 "ShadowLordAlpha"
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 */
package shadowlordalpha.shadowcore.client.creativetab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * 
 * 
 * @author Josh "ShadowLordAlpha"
 *
 */
public class CreativeTab extends CreativeTabs {

	// Why did I make the default icon dirt?
	private Item iconItem = Item.getItemFromBlock(Blocks.DIRT);
	private int itemDamage = 0;
	private boolean drawTitle = true;
	private boolean hidePlayerInventory = true;
	private boolean hasScrollbar = true;
	private ItemStack iconItemStack;

	/**
	 * Creates a new CreativeTab for use in Minecraft by the Creative Menu GUI.
	 * 
	 * @param label The name used for the tab similar to the name used in the {@code setUnlocalizedName} method in the
	 * {@link net.minecraft.item.Item Item} class.
	 */
	public CreativeTab(String label) {
		super(label);
	}

	/**
	 * Creates a new CreativeTab for use in Minecraft by the Creative Menu GUI.
	 * <p>
	 * <b>WARNING:</b> <br>
	 * Setting the index using this method will increase the size of the
	 * {@link net.minecraft.creativetab.CreativeTabs.CREATIVE_TAB_ARRAY CREATIVE_TAB_ARRAY} will overwrite whatever is
	 * currently in that tab spot <b>NOT</b> shift the array and then insert the new tab into the correct spot as well
	 * as create a new array with an extra blank spot. As such it is not recommended to use this constructor unless you
	 * know what you are doing.
	 * 
	 * @param index The index used to insert the new tab into the
	 * {@link net.minecraft.creativetab.CreativeTabs.CREATIVE_TAB_ARRAY CREATIVE_TAB_ARRAY}
	 * @param label The name used for the tab similar to the name used in the {@code setUnlocalizedName} method in the
	 * {@link net.minecraft.item.Item Item} class.
	 */
	public CreativeTab(int index, String label) {
		super(index, label);
	}

	/**
	 * Set a custom texture to be used as the background of the Creative Inventory.
	 * 
	 * @param texture The texture to set as the new background.
	 */
	public CreativeTab setBackgroundImageName(String texture) {
		super.setBackgroundImageName(texture);
		return this;
	}

	// This could be useful for something though I'm not sure what so for now I won't include it

	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		if(this.iconItemStack == null) {
			this.iconItemStack = new ItemStack(this.getTabIconItem(), 665, this.getIconItemDamage());
		}

		return this.iconItemStack;
	}

	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return this.iconItem;
	}

	public CreativeTab setTabIconItem(Item item) {
		this.iconItem = item;
		return this;
	}

	public CreativeTab setTabIconItem(Block block) {
		return this.setTabIconItem(Item.getItemFromBlock(block));
	}

	@SideOnly(Side.CLIENT)
	public int getIconItemDamage() {
		return this.itemDamage;
	}

	public CreativeTab setIconItemDamage(int itemDamage) {
		this.itemDamage = itemDamage;
		return this;
	}

	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() {
		return false;
		// return this.drawTitle;
	}

	public CreativeTab setDrawTitle(boolean drawTitle) {
		this.drawTitle = drawTitle;
		return this;
	}

	public CreativeTab setNoTitle() {
		this.drawTitle = false;
		super.setNoTitle();
		return this;
	}

	@SideOnly(Side.CLIENT)
	public boolean shouldHidePlayerInventory() {
		return hasScrollbar;
	}

	public CreativeTab setHidePlayerinventory(boolean hidePlayerInventory) {
		this.hidePlayerInventory = hidePlayerInventory;
		return this;
	}

	public CreativeTab setNoScrollbar() {
		this.hasScrollbar = false;
		super.setNoScrollbar();
		return this;
	}

	/**
	 * Sets the enchantment types for populating this tab with enchanting books
	 */
	public CreativeTab setRelevantEnchantmentTypes(EnumEnchantmentType... types) {
		super.setRelevantEnchantmentTypes(types);
		return this;
	}

	/**
	 * Determines if the search bar should be shown for this tab.
	 *
	 * @return True to show the bar
	 */
	public boolean hasSearchBar() {
		return true;
	}

	/**
	 * Gets the width of the search bar of the creative tab, use this if your creative tab name overflows together with
	 * a custom texture.
	 *
	 * @return The width of the search bar, 89 by default
	 */
	public int getSearchbarWidth() {
		return 89;
	}
}
