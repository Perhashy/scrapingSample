package scrapingSample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Scraping {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://techacademy.jp/").get();
        Elements courses = document.select("h3");
        for (Element course : courses) {
            System.out.println(course.text());
        }
    }
}