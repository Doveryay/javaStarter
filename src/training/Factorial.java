package training;

/**
 * 3! = 1 * 2 * 3
 */
public class Factorial {
    public static double divide (int a, int b) {
        return a / b;
    }

    public static int getValue(int a) {
        if (a < 0)
            return -1;
        if (a>100000)
            return -2;
        return a == 0 ? 1 : a * getValue(a - 1);
    }
}
