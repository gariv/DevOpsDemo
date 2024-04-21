package ch.zhaw.iwi.devops.romannumerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ch.zhaw.iwi.devops.romannumerals.RomanNumeralsConverter;

public class RomanNumeralsTest {
    
    @Test
    void testOne() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        Assertions.assertEquals("I", romanNumerals.convert(1));
    }
}
