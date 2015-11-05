package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ItemTest {

		private static final String OTHER_ITEM_NAME = "Plastic duck";
		private static final String ITEM_NAME = "Sweet";
		private static final int ITEM_SELLIN = 6;
		private static final int OTHER_ITEM_SELLIN = 10;
		private static final int ITEM_QUALITY = 10;
		private static final int OTHER_ITEM_QUALITY = 10;
		
		Item itemUnderTest;
		
		@Before
		public void itemUnderTestCreation(){
			this.itemUnderTest = new Item(ITEM_NAME, ITEM_SELLIN, ITEM_QUALITY);
		}
		
		@Test
		public void testingNameGetter(){
			assertEquals(ITEM_NAME, this.itemUnderTest.getName());

		}
		
		@Test
		public void testingNameSetter(){
			this.itemUnderTest.setName(OTHER_ITEM_NAME);
			assertEquals(OTHER_ITEM_NAME, this.itemUnderTest.getName());

		}
		
		@Test
		public void testingSellInGetter(){
			assertEquals(ITEM_SELLIN, this.itemUnderTest.getSellIn());
		}
		
		@Test
		public void testingSellInSetter(){
			this.itemUnderTest.setSellIn(OTHER_ITEM_SELLIN);
			assertEquals(OTHER_ITEM_SELLIN, this.itemUnderTest.getSellIn());
		}
		
		@Test
		public void testingQualityGetter(){
			assertEquals(ITEM_QUALITY, this.itemUnderTest.getQuality());
		}
		
		@Test
		public void testingQualitySetter(){
			this.itemUnderTest.setQuality(OTHER_ITEM_QUALITY);
			assertEquals(OTHER_ITEM_QUALITY, this.itemUnderTest.getQuality());
		}

	
}
