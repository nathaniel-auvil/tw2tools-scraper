package us.nauvil.tw2.tools;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Scraper {

    private static final Logger logger = LogManager.getLogger(Scraper.class);

    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("http://www.tw2-tools.com/us18/tribes").get();
        String title = doc.title();
        Element tribesTable= doc.getElementById("info-tribes-base");

        for( Element e : tribesTable.getAllElements() ) {
            if(logger.isDebugEnabled()) logger.debug("table element: {}",e.toString());

            if(e.getElementsByTag("tbody").size() > 0) {

                System.out.println("found it");
                for( Element e1 : tribesTable.getAllElements() ) {

                    if(logger.isDebugEnabled()) logger.debug("table element: {}",e1.toString());
                }
            }
        }

      //  if(logger.isDebugEnabled()) logger.debug("title: {}",title);
      //  if(logger.isDebugEnabled()) logger.debug("tribesTable: {}",tribesTable.toString());

    }

}
