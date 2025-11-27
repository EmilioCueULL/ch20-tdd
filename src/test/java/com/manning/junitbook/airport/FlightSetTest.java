package com.manning.junitbook.airport;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class FlightSetTest {

    @Test
    public void testGetPassengersSetIsUnmodifiable() {
        Flight flight = new EconomyFlight("10");
        Passenger p = new Passenger("Mike", false);
        assertTrue(flight.addPassenger(p));

        Set<Passenger> passengers = flight.getPassengersSet();
        assertEquals(1, passengers.size());

        assertThrows(UnsupportedOperationException.class, () -> passengers.add(new Passenger("X", false)));
    }

    @Test
    public void testGetPassengersSetReflectsChanges() {
        Flight flight = new EconomyFlight("11");
        assertEquals(0, flight.getPassengersSet().size());

        Passenger p = new Passenger("Anna", false);
        assertTrue(flight.addPassenger(p));
        assertEquals(1, flight.getPassengersSet().size());

        Passenger q = new Passenger("John", false);
        assertTrue(flight.addPassenger(q));
        assertEquals(2, flight.getPassengersSet().size());
    }

}
