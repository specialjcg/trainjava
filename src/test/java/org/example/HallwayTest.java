package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HallwayTest {
    @Test
    public void testContact() {
        assertEquals(1, Hallway.contact("---><----"));
        assertEquals(1, Hallway.contact("--->-<------->----<-"));
        assertEquals(-1, Hallway.contact("----<----->----"));
        assertEquals(2, Hallway.contact(">-----<-->--<-----"));
        assertEquals(3, Hallway.contact(">>-----<<"));
        assertEquals(5, Hallway.contact(">---------------<--------------------------<-------->---------<------->----------<----<---->>----------<------->>>---------------<<------>"));
    }
}