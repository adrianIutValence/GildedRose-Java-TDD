package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

import org.junit.Before;
import org.junit.Test;

public class GildedRoseTest {
	private Item itemUnderTest;
	private ArrayList<Item> items;

	public static final int INITIAL_QUALITY = 10;
	public static final int INITIAL_SELLIN = 10;
	private static final int NUMBER_DAY_TO_TEST = 3;

	@Before
	public void itemUnderTestCreation() {
		this.items = new ArrayList<Item>();
		this.items.add(new Item("+5 Dexterity Vest", 10, 20));
		this.items.add(new Item("Aged Brie", 2, 0));
		this.items.add(new Item("Elixir of the Mongoose", 5, 7));
		this.items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		this.items.add(new Item("Backstage passes to a TAFKAL80ETC concert",
				15, 20));
		this.items.add(new Item("Conjured Mana Cake", 3, 6));

	}

	@Test
	public void testingUpdateItemsMethodOnManyDays() {
		for (int dayNumber = 1; dayNumber < NUMBER_DAY_TO_TEST; dayNumber++) {
			GildedRose.updateItems(this.items);
			for (Item item : items) {
				assertEquals(item.getQuality(), INITIAL_QUALITY - dayNumber);
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
	
	@Test
	public void testingUpdateItemsMethodWithNullReference(){
		ArrayList<Item> nullItemList = null;
		GildedRose.updateItems(nullItemList);
		assertEquals(nullItemList, null);
	}

}