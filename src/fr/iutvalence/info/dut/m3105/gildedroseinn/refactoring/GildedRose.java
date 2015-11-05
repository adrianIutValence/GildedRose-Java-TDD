package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import java.util.List;

public class GildedRose
{

	private static final int HOW_MUCH_TIME_QUALITY_DECREASE_WHEN_NOT_OUTDATED = 1;
	private static final int HOW_MUCH_TIME_QUALITY_DECREASE_WHEN_OUTDATED = 2;
	private static final int DECREASING_QUALITY_EACH_DAY = 1;
	private static final int DECREASING_SELLIN_EACH_DAY = 1;

	/*
	 * The code below is intended to help writing test fixtures
	 * 
	 * items = new ArrayList<Item>(); 
	 * items.add(new Item("+5 Dexterity Vest", 10, 20)); 
	 * items.add(new Item("Aged Brie", 2, 0)); 
	 * items.add(new Item("Elixir of the Mongoose", 5, 7)); 
	 * items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80)); 
	 * items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)); 
	 * items.add(new Item("Conjured Mana Cake", 3, 6));
	 */
	
	/**
	 * 
	 * @param items shouldn't be null
	 */
	public static void updateItems(List<Item> items)
	{
		assert items != null : "items shouldn't be null";
		
		for (int indexInItemList = 0; indexInItemList < items.size(); indexInItemList++)
			updateItem(items.get(indexInItemList));
	}

	public static void updateItem(Item item)
	{
		item.decreaseSellInBy(DECREASING_SELLIN_EACH_DAY);
		item.decreaseQualityBy(DECREASING_QUALITY_EACH_DAY
				* (item.getSellIn() < 0 ? HOW_MUCH_TIME_QUALITY_DECREASE_WHEN_OUTDATED
						: HOW_MUCH_TIME_QUALITY_DECREASE_WHEN_NOT_OUTDATED));
	}

}
