package com.musambokazi.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RiderTest {
    @Test
    public void testRiderInitialState(){
        Rider rider = new Rider("Alice", "Downtown", "Uptown");

        assertEquals("Alice", rider.getName);

        assertEquals("Downtown", getLocation);

        assertEquals("Uptown", getDestination);
    }
}
