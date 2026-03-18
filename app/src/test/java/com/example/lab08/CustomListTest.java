package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Calgary", "AB");
        list.addCity(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Calgary", "AB"));
        assertEquals(2, list.countCities());
    }
}


