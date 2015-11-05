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
			assertEquals(this.itemUnderTest.getName(), ITEM_NAME);

		}
		
		@Test
		public void testingNameSetter(){
			this.itemUnderTest.setName(OTHER_ITEM_NAME);
			assertEquals(this.itemUnderTest.getName(), OTHER_ITEM_NAME);

		}
		
		@Test
		public void testingSellInGetter(){
			assertEquals(this.itemUnderTest.getSellIn(), ITEM_SELLIN);
		}
		
		@Test
		public void testingSellInSetter(){
			this.itemUnderTest.setSellIn(OTHER_ITEM_SELLIN);
			assertEquals(this.itemUnderTest.getSellIn(), OTHER_ITEM_SELLIN);
		}
		
		@Test
		public void testingQualityGetter(){
			assertEquals(this.itemUnderTest.getQuality(), ITEM_QUALITY);
		}
		
		@Test
		public void testingQualitySetter(){
			this.itemUnderTest.setQuality(OTHER_ITEM_QUALITY);
			assertEquals(this.itemUnderTest.getQuality(), OTHER_ITEM_QUALITY);
		}

	
}
