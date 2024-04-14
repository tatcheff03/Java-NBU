package org.example.statements;

import org.junit.jupiter.api.Test;
import org.tatcheff.statements.Statements;

import static org.junit.jupiter.api.Assertions.*;

class StatementsTest {

    @Test
    public void isLeap_whenIsLeapYear_returnsTrue() {
        final int year = 2024;
        assertTrue(Statements.isLeapYear(year));
    }

    @Test
    public void isLeap_whenIsNotLeapYear_returnsFalse() {
        final int year = 2023;
        assertFalse(Statements.isLeapYear(year));

    }

    @Test
    public void isLeap_whenIsDivisibleBy100AndNot400_returnsFalse() {
        final int year = 1900;
        assertFalse(Statements.isLeapYear(year));
    }

    @Test
    public void isLeap_whenIsDivisibleBy400_returnsTrue() {
        final int year = 2000;
        assertTrue(Statements.isLeapYear(year));
    }

    @Test
    public void isLeap_whenYear0_returnsTrue() {
        final int year = -4;
        assertTrue(Statements.isLeapYear(year));
    }

    @Test
    public void daysInMonth_whenMonthWith31Days_returns31() {
        //arrange
        final int year = 2024;
        String month = "January";
        final int expected = 31;

        //Act & Assert
        assertEquals(expected, Statements.daysInMonth(year, month));
    }

    @Test
    public void daysInMonth_whenMonthWith30Days_returns30() {
        //arrange
        final int year = 2023;
        String month = "April";
        final int expected = 30;

        //Act & Assert
        assertEquals(expected, Statements.daysInMonth(year, month));
    }

    @Test
    public void daysInMonth_whenMonthWith29Days_returns29() {
        //arrange
        final int year = 2023;
        String month = "March";
        final int expected = 29;

        //Act & Assert
        assertEquals(expected, Statements.daysInMonth(year, month));
    }

    public void daysInMonth_whenMonthWith28Days_returns28() {
        //arrange
        final int year = 2023;
        String month = "February";
        final int expected = 28;

        //Act & Assert
        assertEquals(expected, Statements.daysInMonth(year, month));
    }

    @Test
    public void daysInMonth_whenInvalidMonth_returnsMinus1() {
        //arrange
        final int year = 2023;
        String month = "NotAMonth";
        final int expected = -1;

        //act & assert
        assertEquals(expected, Statements.daysInMonth(year, month));
    }
}