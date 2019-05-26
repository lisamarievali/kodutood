package main.java.kodutoo2;

public interface ScraperInterface {
    public DelfiLinkScraper(String url);
    public void makeWebRequest();
    public void extractLinks();
    public String getHtml();
}
