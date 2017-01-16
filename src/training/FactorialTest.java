package training;

import junit.framework.TestCase;
import training.Factorial;

public class FactorialTest extends TestCase {
    public void testGetValue(){
        assertEquals(1, Factorial.getValue(0));
        assertEquals(1, Factorial.getValue(1));
        assertEquals(2, Factorial.getValue(2));
        assertEquals(6, Factorial.getValue(3));
        assertEquals(24, Factorial.getValue(4));
        assertEquals(120, Factorial.getValue(5));
        assertEquals(720, Factorial.getValue(6));
    }
}
