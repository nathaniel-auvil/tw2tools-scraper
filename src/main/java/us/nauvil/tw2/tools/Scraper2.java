package us.nauvil.tw2.tools;

import com.ui4j.api.browser.Page;
import com.ui4j.api.dom.Element;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

import static com.ui4j.api.browser.BrowserFactory.getWebKit;

public class Scraper2 {

    private static final Logger logger = LogManager.getLogger(Scraper2.class);

    public static void main(String[] args) throws IOException {

        try (Page page = getWebKit().navigate("http://www.tw2-tools.com/us18/tribes/")) {

            for (Element e : page.getDocument().getBody().getChildren()) {

                System.out.println("e.getId(): " + e.getId());

                if( e.getId().toString().equalsIgnoreCase("Optional[body]")) {
                    System.out.println(e.getId());


                    e.getChildren().forEach(child->System.out.println("child: " + child.getId()));
                }
            }


        }

        System.out.println("completed");
    }


}
