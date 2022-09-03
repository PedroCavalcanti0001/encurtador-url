package me.pedroeugenio.encurtadorurl;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.Optional;

public class UrlShortner {

    public static String get(String longUrl) throws IOException {
        Connection connection = Jsoup.connect("https://www.encurtador.com.br/url-encurtada.php");
        String requestBody = "u=".concat(longUrl);
        connection.requestBody(requestBody);
        Document document = connection.post();
        Optional<Element> element = document.body().select("#shortenurl").stream().findFirst();
        return element.map(value -> value.attr("value")).orElse(longUrl);

    }
}
