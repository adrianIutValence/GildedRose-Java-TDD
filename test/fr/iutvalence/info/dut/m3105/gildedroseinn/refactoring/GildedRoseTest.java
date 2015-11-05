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
		itemsUnderTest.add(new Item("+5 Dexterity Vest", INITIAL_SELLIN, INITIAL_QUALITY));
		itemsUnderTest.add(new Item("Aged Brie", INITIAL_SELLIN, INITIAL_QUALITY));
		itemsUnderTest.add(new Item("Elixir of the Mongoose", INITIAL_SELLIN, INITIAL_QUALITY));
		itemsUnderTest.add(new Item("Sulfuras, Hand of Ragnaros", INITIAL_SELLIN, INITIAL_QUALITY));
		itemsUnderTest.add(new Item("Backstage passes to a TAFKAL80ETC concert",
				INITIAL_SELLIN, INITIAL_QUALITY));
		itemsUnderTest.add(new Item("Conjured Mana Cake", INITIAL_SELLIN, INITIAL_QUALITY));
		
		
		for (int dayNumber = 1; dayNumber < NUMBER_DAY_TO_TEST; dayNumber++) {
			GildedRose.updateItems(itemsUnderTest);
			for (Item item : itemsUnderTest) {
				assertEquals(String.valueOf(dayNumber), INITIAL_QUALITY - dayNumber - (INITIAL_SELLIN<dayNumber ? (dayNumber-INITIAL_SELLIN):0), item.getQuality());
				assertEquals(INITIAL_SELLIN - dayNumber, item.getSellIn());
			}
		}
	}
	
	
	@Test
	public void testingUpdateItemsMethodWithEmptyList(){
		ArrayList<Item> emptyItemList = new ArrayList<Item>();
		GildedRose.updateItems(emptyItemList);
		assertEquals(new ArrayList<Item>(), emptyItemList);
	}

}