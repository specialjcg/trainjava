package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class whoLikesItTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", whoLikesIt.whoLikesIt());
        assertEquals("Peter likes this", whoLikesIt.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", whoLikesIt.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", whoLikesIt.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", whoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
    
}