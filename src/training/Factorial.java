package training;

/**
 * 3! = 1 * 2 * 3
 */
public class Factorial {
    public static int getValue(int a) {
        return a == 0 ? 1 : a * getValue(a - 1);
    }
}
