package com.example.addition;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdditionTest {

    @Test
    public void testAddNumbers() {
        Addition addition = new Addition();
        assertEquals(21, addition.add(16, 5));
    }

}
