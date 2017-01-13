package egestats;

/**
 * Loads html from website.
 */
public class Loader {
    private String name;

    public Loader(String name) {
        this.name = name;
    }

    public String load() {
        //todo Требуется реализация загрузки с сайта университета
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
