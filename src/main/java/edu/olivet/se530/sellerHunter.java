package edu.olivet.se530;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * 亚马逊商家猎手，根据给定的isbn和condition返回最佳商家。
 * @author <a href = "mailto:wangliarchi@gmail.com">Liya WangJan 9, 201512:18:44 PM
 */
public class sellerHunter {

	public static void main(String[] args) throws IOException
	{
		Document document = getDocument();
		
		System.out.println(document.title());		
		
		String priceSelector = "#olpTabContent > div > div.a-section.a-spacing-double-large > div:nth-child(3) > div:nth-child(1) > span.a-size-large.a-color-price.olpOfferPrice.a-text-bold";
		String text = getText(document, priceSelector);
		System.out.println(text);
		
		String shippingPriceSelector = "#olpTabContent > div > div.a-section.a-spacing-double-large > div:nth-child(3) > div:nth-child(2) > h3";
		System.out.println(getText(document, shippingPriceSelector));
				
		String conditionSelector = "#olpTabContent > div > div.a-section.a-spacing-double-large > div:nth-child(3) > div:nth-child(1) > p > span > b";
		System.out.println(getText(document, conditionSelector));
		
		String nameSelector = "#olpTabContent > div > div.a-section.a-spacing-double-large > div:nth-child(3) > div.a-column.a-span2.olpSellerColumn > p > img";
		System.out.println(getText(document, nameSelector));
			
		String ratingSelector = "#olpTabContent > div > div.a-section.a-       spacing-double-large > div:nth-child(5) > div.a-column.a-span2.olpSellerColumn > p:nth-child(2) > a > b";
		System.out.println(getText(document, ratingSelector));
		
	}

	/**
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public static Document getDocument() throws MalformedURLException,
			IOException {
		URL url = new URL("http://www.amazon.com/gp/offer-listing/031043601X/sr=8-1/qid=1420823725/ref=olp_tab_new?ie=UTF8&condition=new&qid=1420823725&sr=8-1");
		Connection conn = getConnection(url);
		
		Document document = conn.get();
		return document;
	}

	/**
	 * @param document
	 * @param selector
	 * @return
	 */
	public static String getText(Document document, String selector) {
		Elements elements = document.select(selector);
		if(elements.size() <= 0 )
		{
			return "";
		}
		return elements.get(0).text();
	}
	/**
	 * @param url
	 * @return
	 */
	private static Connection getConnection(URL url) {
		Connection conn = Jsoup.connect(url.toExternalForm());
		conn.timeout(8000);
		conn.header("Connection", "keep-alive");
		conn.header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
		conn.header("User-Agent", "Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36");
		conn.header("Accept-Encoding", "gzip, deflate, sdch");
		conn.header("Accept-Language", "en-US,en;q=0.8");
		conn.header("Cache-Control", "max-age=0");
		conn.header("Host", url.getHost());
		return conn;
	}
}
