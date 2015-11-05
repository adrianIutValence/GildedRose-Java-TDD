package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest {

	public static final int INITIAL_QUALITY = 10;
	public static final int INITIAL_SELLIN = 3;
	private static final int NUMBER_DAY_TO_TEST = 6;



	@Test
	public void testingUpdateItemsMethodOnManyDays() {
		
		ArrayList<Item> itemsUnderTest = new ArrayList<Item>();
		itemsUnderTest.add(new Item("+5 Dexterity Vest", INITIAL_QUALITY, INITIAL_SELLIN));
		itemsUnderTest.add(new Item("Aged Brie", INITIAL_QUALITY, INITIAL_SELLIN));
		itemsUnderTest.add(new Item("Elixir of the Mongoose", INITIAL_QUALITY, INITIAL_SELLIN));
		itemsUnderTest.add(new Item("Sulfuras, Hand of Ragnaros", INITIAL_QUALITY, INITIAL_SELLIN));
		itemsUnderTest.add(new Item("Backstage passes to a TAFKAL80ETC concert",
				INITIAL_QUALITY, INITIAL_SELLIN));
		itemsUnderTest.add(new Item("Conjured Mana Cake", INITIAL_QUALITY, INITIAL_SELLIN));
		
		
		for (int dayNumber = 1; dayNumber < NUMBER_DAY_TO_TEST; dayNumber++) {
			GildedRose.updateItems(itemsUnderTest);
			for (Item item : itemsUnderTest) {
				assertEquals(item.getQuality(), INITIAL_QUALITY - dayNumber - (INITIAL_SELLIN<dayNumber ? (INITIAL_SELLIN-dayNumber):0));
				assertEquals(item.getSellIn(), INITIAL_SELLIN - dayNumber);
			}
		}
	}
	
	
	@Test
	public void testingUpdateItemsMethodWithEmptyList(){
		ArrayList<Item> emptyItemList = new ArrayList<Item>();
		GildedRose.updateItems(emptyItemList);
		assertEquals(emptyItemList, new ArrayList<Item>());
	}

}