package com.quantity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    @Test
    void testEquality_FeetToFeet_SameValue() {
        assertTrue(new Quantity(1.0, LengthUnit.FEET)
                .equals(new Quantity(1.0, LengthUnit.FEET)));
    }

    @Test
    void testEquality_InchToInch_SameValue() {
        assertTrue(new Quantity(1.0, LengthUnit.INCH)
                .equals(new Quantity(1.0, LengthUnit.INCH)));
    }

    @Test
    void testEquality_FeetToInch_Equivalent() {
        assertTrue(new Quantity(1.0, LengthUnit.FEET)
                .equals(new Quantity(12.0, LengthUnit.INCH)));
    }

    @Test
    void testEquality_InchToFeet_Equivalent() {
        assertTrue(new Quantity(12.0, LengthUnit.INCH)
                .equals(new Quantity(1.0, LengthUnit.FEET)));
    }

    @Test
    void testEquality_FeetToFeet_Different() {
        assertFalse(new Quantity(1.0, LengthUnit.FEET)
                .equals(new Quantity(2.0, LengthUnit.FEET)));
    }

    @Test
    void testEquality_InchToInch_Different() {
        assertFalse(new Quantity(1.0, LengthUnit.INCH)
                .equals(new Quantity(2.0, LengthUnit.INCH)));
    }

    @Test
    void testEquality_NullComparison() {
        assertFalse(new Quantity(1.0, LengthUnit.FEET).equals(null));
    }

    @Test
    void testEquality_SameReference() {
        Quantity q = new Quantity(1.0, LengthUnit.FEET);
        assertTrue(q.equals(q));
    }

    @Test
    void testEquality_InvalidUnit() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Quantity(1.0, null);
        });
    }
}