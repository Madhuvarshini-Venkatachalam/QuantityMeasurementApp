package com.quantity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    // ✅ FEET TESTS (UC1)

    @Test
    void testFeet_SameValue() {
        assertTrue(new QuantityMeasurementApp.Feet(1.0)
                .equals(new QuantityMeasurementApp.Feet(1.0)));
    }

    @Test
    void testFeet_DifferentValue() {
        assertFalse(new QuantityMeasurementApp.Feet(1.0)
                .equals(new QuantityMeasurementApp.Feet(2.0)));
    }

    @Test
    void testFeet_NullComparison() {
        assertFalse(new QuantityMeasurementApp.Feet(1.0).equals(null));
    }

    @Test
    void testFeet_SameReference() {
        QuantityMeasurementApp.Feet f = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(f.equals(f));
    }

    @Test
    void testFeet_NonNumericInput() {
        assertFalse(new QuantityMeasurementApp.Feet(1.0).equals("test"));
    }

    // ✅ INCHES TESTS (UC2)

    @Test
    void testInches_SameValue() {
        assertTrue(new QuantityMeasurementApp.Inches(1.0)
                .equals(new QuantityMeasurementApp.Inches(1.0)));
    }

    @Test
    void testInches_DifferentValue() {
        assertFalse(new QuantityMeasurementApp.Inches(1.0)
                .equals(new QuantityMeasurementApp.Inches(2.0)));
    }

    @Test
    void testInches_NullComparison() {
        assertFalse(new QuantityMeasurementApp.Inches(1.0).equals(null));
    }

    @Test
    void testInches_SameReference() {
        QuantityMeasurementApp.Inches i = new QuantityMeasurementApp.Inches(1.0);
        assertTrue(i.equals(i));
    }

    @Test
    void testInches_NonNumericInput() {
        assertFalse(new QuantityMeasurementApp.Inches(1.0).equals("test"));
    }
}