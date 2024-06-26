package ch.zhaw.iwi.devops.romannumerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanNumeralsTest {
    
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
    
    @Test
    void testNine() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        Assertions.assertEquals("IX", romanNumerals.convert(9));
    }

    @Test
    void testTen() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        Assertions.assertEquals("X", romanNumerals.convert(10));
    }
    
    @Test
    void testTwentyOne() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        Assertions.assertEquals("XXI", romanNumerals.convert(21));
    }
    
    @Test
    void testFifty() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        Assertions.assertEquals("L", romanNumerals.convert(50));
    }
    @Test
    void testEightyTwo() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        Assertions.assertEquals("LXXXII", romanNumerals.convert(82));
    }

    @Test
    void testHundred() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        Assertions.assertEquals("The conversion is not (yet) defined", romanNumerals.convert(100));
    }
}
