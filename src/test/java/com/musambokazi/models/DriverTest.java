package com.musambokazi.models;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Driver;

import static org.junit.jupiter.api.Assertions.*;

public class DriverTest {
    @Test
    public void testDriverInitialState() {
        Driver driver = new Driver("Alice", "Downtown", true);

        assertEquals("Alice", driver.getName());

        assertEquals("Downtown", driver.getLocation());

        assertTrue(driver.isAvailable());
    }


}
