package egestats;

/**
 * Main class for egestats.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Loader loader = new Loader ("Peter");
        System.out.println(loader.load());
    }
}
