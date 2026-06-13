package tests;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.BrokenLinksPage;

public class BrokenLinksTest extends BaseTest {

    @Test
    public void verifyBrokenLinks() {

        BrokenLinksPage page =
                new BrokenLinksPage(driver);

        List<String> urls =
                page.getAllLinkUrls();

        System.out.println(
                "Total URLs : "
                + urls.size());

        for (String url : urls) {

            try {

                HttpURLConnection connection =
                        (HttpURLConnection)
                        new URL(url)
                        .openConnection();

                connection.setConnectTimeout(5000);

                connection.connect();

                int responseCode =
                        connection.getResponseCode();

                if (responseCode >= 400) {

                    System.out.println(
                            "Broken Link : "
                            + url
                            + " --> "
                            + responseCode);

                } else {

                    System.out.println(
                            "Valid Link : "
                            + url
                            + " --> "
                            + responseCode);
                }

            } catch (Exception e) {

                System.out.println(
                        "Error : "
                        + url);
            }
        }
    }
}