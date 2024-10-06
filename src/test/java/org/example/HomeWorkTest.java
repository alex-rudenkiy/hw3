package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HomeWorkTest {
    @Test
    void testFindMaxSubstring() {
        HomeWork hw = new HomeWork();
        assertEquals("dcbaX", hw.findMaxSubstring("abcddcbaX"));
    }
}
