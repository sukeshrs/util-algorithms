package com.util.algo.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringAcronym {

    StringAcronym stringAcronym = new StringAcronym();

    @Test
    public void testIfTheStringIsAcronym(){
        String s = "Future Ready Five";
        boolean result = stringAcronym.isAcronym(s, "FRF");
        Assertions.assertTrue(result);
    }

    @Test
    public void testIfTheStringIsAcronym_false(){
        String s = "Future Ready Six";
        boolean result = stringAcronym.isAcronym(s, "FRF");
        Assertions.assertFalse(result);
    }
}
