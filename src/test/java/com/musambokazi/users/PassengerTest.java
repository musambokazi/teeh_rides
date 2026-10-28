package com.musambokazi.users;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerTest {
    private Passenger passenger;
    
    @BeforeAll
    void setUp(){
        passenger = new Passenger("Tee H Mbokazi");
    }
    
    @Test
    void shouldReturnUserName(){
        String result = passenger.name();
        assertEquals("Tee Kazim", passenger.name());
    }
}
