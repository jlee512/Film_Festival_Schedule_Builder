/**
 * Created by Julian on 13/07/2017.
 */

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JSoup_Practice {

    public static void main(String[] args) {

        String url = "https://www.nziff.co.nz/2017/auckland/films/title";

        Document document = null;

        try {
            document = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements films = document.select("div.detail.film-info");

        for (Element film : films) {

            System.out.println("Film name: " + film.select("a span").text());
            System.out.println("Film link: " + film.select("a").attr("href"));
            System.out.println();

        }

    }

}
