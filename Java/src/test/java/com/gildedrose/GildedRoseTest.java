package com.glidedrose;

import org.junit.jupiter.api.Test;


import org.approvaltests.combinations.CombinationApprovals;

class GildedRoseTest {

    @Test
    void updateQuality() throws Exception{
    	
    	CombinationApprovals.verifyAllCombinations(this::doUpdateQuality, new String[] {"Aged Brie","Backstage passes to a TAFKAL80ETC concert",
    			"Sulfuras, Hand of Ragnaros","Conjured"},
    	         new Integer[] {-1,0,2,6,11},
    	         new Integer[] {0,1,49,50}
    	);
       
    }
    
    private  String doUpdateQuality(String name,int sellIn,int quality)
    {
    	 Item[] items = new Item[] { new Item(name, sellIn, quality) };
         GildedRose app = new GildedRose(items);
         app.updateQuality();
		return app.items[0].toString();
    	
    }

}
