package com.jgarciarivera.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralConverterTest {

    RomanNumeralConverter converter;

    @BeforeEach
    public void setup() {
        converter = new RomanNumeralConverter();
    }

    @Test
    public void canary() {
        assertTrue(true);
    }

    @Test
    public void emptyString_returns0() {
        assertEquals(0, converter.toDecimal(""));
    }

    @Test
    public void romanNumeralI_returns1() {
        assertEquals(1, converter.toDecimal("I"));
    }

    @Test
    public void romanNumeralV_returns5() {
        assertEquals(5, converter.toDecimal("V"));
    }

    @Test
    public void romanNumeralX_returns10() {
        assertEquals(10, converter.toDecimal("X"));
    }

    @Test
    public void romanNumeralL_returns50() {
        assertEquals(50, converter.toDecimal("L"));
    }

    @Test
    public void romanNumeralC_returns100() {
        assertEquals(100, converter.toDecimal("C"));
    }

    @Test
    public void romanNumeralD_returns500() {
        assertEquals(500, converter.toDecimal("D"));
    }

    @Test
    public void romanNumeralM_returns1000() {
        assertEquals(1000, converter.toDecimal("M"));
    }

    @Test
    public void romanNumeral_VI_returns6() {
        assertEquals(6, converter.toDecimal("VI"));
    }

    @Test
    public void romanNumeral_IV_returns4() {
        assertEquals(4, converter.toDecimal("IV"));
    }

    @Test
    public void romanNumeral_MMVI_returns2006() {
        assertEquals(2006, converter.toDecimal("MMVI"));
    }

    @Test
    public void romanNumeral_MCMXLIV_returns1944() {
        assertEquals(1944, converter.toDecimal("MCMXLIV"));
    }

    @Test
    public void invalidSymbol_throwsIllegalArgumentException() {
        try {
            converter.toDecimal("K");
            fail("Expected illegal argument exception with invalid input");
        } catch (IllegalArgumentException e) {
            assertEquals("Roman numeral must consist of I, V, X, L, C, D, M", e.getMessage());
        }
    }

    @Test
    public void invalidAndValidSymbols_throwsIllegalArgumentException() {
        try {
            converter.toDecimal("MIV9");
            fail("Expected illegal argument exception with invalid input");
        } catch (IllegalArgumentException e) {
            assertEquals("Roman numeral must consist of I, V, X, L, C, D, M", e.getMessage());
        }
    }
}
