package edu.mondragon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    Fibonacci fibonacci;

    @BeforeEach
    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void testZero() {
        assertEquals(0, fibonacci.compute(0));
    }

    @Test
    public void testLarge() {
        assertEquals(55, fibonacci.compute(10));
    }
}
