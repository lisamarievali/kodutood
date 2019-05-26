package Analytics;

import java.util.LinkedList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.io.IOException;
import java.net.URI;

class DelfiLinkScraper {
    private String url;
    private String html;

    private LinkedList hrefCollection;

    public String getHtml() {
        return this.html;
    }

    public DelfiLinkScraper(String url) {
        this.url = url;
    }

    public void makeWebRequest() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(this.url)).build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            this.html = response.body();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void extractLinks(){
        Document doc = Jsoup.parse(this.html);
        Elements links = doc.select("a[href]"); // a with href

        for (Element anchor : links) {
            System.out.println(anchor.attr("abs:href"));

        }
    }


}
