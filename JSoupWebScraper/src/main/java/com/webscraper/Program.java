package com.webscraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Program {

	public static void main(String[] args) {
		try {
            // Connect to the website
            		Document doc = Jsoup.connect("http://localhost:10400/webjob/index.html").get();

            // Select the elements containing the article titles
            		Elements titles = doc.select("h2");

            // Print the titles
           		 for (Element title : titles) {
               		 System.out.println(title.text());
           			 }
        	} catch (Exception e) {
            			e.printStackTrace();
      		 }

	}

}


