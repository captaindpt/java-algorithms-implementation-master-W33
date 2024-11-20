package com.jwetherell.algorithms.mathematics;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void testBasicDivision() {
        assertEquals(2, Division.division(4, 2));
        assertEquals(-2, Division.division(-4, 2));
        assertEquals(-2, Division.division(4, -2));
        assertEquals(2, Division.division(-4, -2));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Division.division(4, 0);
    }

    @Test
    public void testDivisionUsingLoop() {
        assertEquals(2, Division.divisionUsingLoop(4, 2));
        assertEquals(-2, Division.divisionUsingLoop(-4, 2));
        assertEquals(-2, Division.divisionUsingLoop(4, -2));
        assertEquals(2, Division.divisionUsingLoop(-4, -2));
        assertEquals(0, Division.divisionUsingLoop(0, 5));
    }

    @Test
    public void testDivisionUsingRecursion() {
        assertEquals(2, Division.divisionUsingRecursion(4, 2));
        assertEquals(-2, Division.divisionUsingRecursion(-4, 2));
        assertEquals(-2, Division.divisionUsingRecursion(4, -2));
        assertEquals(2, Division.divisionUsingRecursion(-4, -2));
        assertEquals(0, Division.divisionUsingRecursion(0, 5));
    }

    @Test
    public void testDivisionUsingMultiplication() {
        assertEquals(2, Division.divisionUsingMultiplication(4, 2));
        assertEquals(-2, Division.divisionUsingMultiplication(-4, 2));
        assertEquals(-2, Division.divisionUsingMultiplication(4, -2));
        assertEquals(2, Division.divisionUsingMultiplication(-4, -2));
        assertEquals(0, Division.divisionUsingMultiplication(0, 5));
    }

    @Test
    public void testDivisionUsingShift() {
        assertEquals(2, Division.divisionUsingShift(4, 2));
        assertEquals(-2, Division.divisionUsingShift(-4, 2));
        assertEquals(-2, Division.divisionUsingShift(4, -2));
        assertEquals(2, Division.divisionUsingShift(-4, -2));
        assertEquals(0, Division.divisionUsingShift(0, 5));
    }

    @Test
    public void testDivisionUsingLogs() {
        assertEquals(2, Division.divisionUsingLogs(4, 2));
        assertEquals(-2, Division.divisionUsingLogs(-4, 2));
        assertEquals(-2, Division.divisionUsingLogs(4, -2));
        assertEquals(2, Division.divisionUsingLogs(-4, -2));
        assertEquals(0, Division.divisionUsingLogs(0, 5));
    }

    @Test
    public void testLargeNumbers() {
        assertEquals(Integer.MAX_VALUE / 2, Division.division(Integer.MAX_VALUE, 2));
        assertEquals(Integer.MAX_VALUE / 2, Division.divisionUsingLoop(Integer.MAX_VALUE, 2));
        assertEquals(Integer.MAX_VALUE / 2, Division.divisionUsingShift(Integer.MAX_VALUE, 2));
        assertEquals(Integer.MAX_VALUE / 2, Division.divisionUsingLogs(Integer.MAX_VALUE, 2));
    }
}
