/**
 * 
 */
package edu.olivet.se530;


import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.junit.Test;

/**
 * @author <a href = "mailto:wangliarchi@gmail.com">Liya WangJan 19, 20154:49:05 PM
 *
 */
public class sellerHunterTest {
	
	public void testGetText() throws MalformedURLException, IOException
	{
		Document document = sellerHunter.getDocument();
		String selector = "#olpTabContent > div > div.a-section.a-spacing-double-large > div:nth-child(3) > div.a-column.a-span2.olpSellerColumn > p > img";
		Assert.assertEquals(sellerHunter.getText(document, selector), "-Daily Deals-");
	}
	

}


