package egestats;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Loads html from website.
 */
public class Loader {
    private static final String SITE_URL = "https://cabinet.spbu.ru/Lists/1k_EntryLists/list_a9c0349c-00f4-4801-9bb3-80cecc0a53e8.html";
    private String name;

    public Loader(String name) {
        this.name = name;
    }
//Все понятно?
    public String load() throws IOException {
        java.io.InputStream response = new URL(SITE_URL).openStream();
        Scanner s = new Scanner(response).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
