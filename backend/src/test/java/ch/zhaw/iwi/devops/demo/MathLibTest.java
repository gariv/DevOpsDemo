package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MathLibTest {
    @Test
    void testIsEven() {
        assertTrue(MathLib.isEven(2));
        assertFalse(MathLib.isEven(3));
    }
}
