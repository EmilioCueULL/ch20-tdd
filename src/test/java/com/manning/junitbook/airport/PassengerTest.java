package com.manning.junitbook.airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    @Test
    public void testPassengerNameAndVip() {
        Passenger p1 = new Passenger("Ana", true);
        assertEquals("Ana", p1.getName());
        assertTrue(p1.isVip());

        Passenger p2 = new Passenger("Bob", false);
        assertEquals("Bob", p2.getName());
        assertFalse(p2.isVip());
    }

}
