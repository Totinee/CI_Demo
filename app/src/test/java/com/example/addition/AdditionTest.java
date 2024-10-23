package com.example.addition;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdditionTest {

    @Test
    public void testAddNumbers() {
        Addition addition = new Addition();
        assertEquals(5, addition.add(2, 3));
    }

}
