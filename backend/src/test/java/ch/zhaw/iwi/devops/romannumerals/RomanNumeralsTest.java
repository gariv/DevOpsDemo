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
    
    @Test
    void testThree() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        Assertions.assertEquals("III", romanNumerals.convert(3));
    }
    
    @Test
    void testFour() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        Assertions.assertEquals("IV", romanNumerals.convert(4));
    }
    
    @Test
    void testFive() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        Assertions.assertEquals("V", romanNumerals.convert(5));
    }
    
    @Test
    void testEight() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        Assertions.assertEquals("VIII", romanNumerals.convert(8));
    }
}
