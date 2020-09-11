package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void calcTaylorSeries() {
        double taylorSeriesResult = Main.calcTaylorSeries(0.5, Math.pow(10, -5));
        double taylorSeriesExpected = -0.693;
        assertEquals(taylorSeriesResult, taylorSeriesExpected, 0.001);
    }

    @Test
    public void calcTaylorForm() {
        double taylorFormResult = Main.calcTaylorForm(5);
        double taylorFormExpected = -0.693;
        assertEquals(taylorFormExpected, taylorFormResult, 0.001);
    }
}