package ch.zhaw.iwi.devops.romannumerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {
    
    @Test
    void testOne() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        Assertions.assertEquals("I", romanNumerals.convert(1));
    }
    
    @Test
    void testTwo() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        Assertions.assertEquals("II", romanNumerals.convert(2));
    }
}
