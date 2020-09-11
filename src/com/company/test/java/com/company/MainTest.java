package com.company;

class MainTest {
    public void test() {
        if (Main.isEqual(Main.calcTaylorForm(0.5), Main.calcTaylorSeries(0.5, Main.calcENum(5)))) {
            System.out.println("Ok");
        } else {
            System.out.println("Oh oh(");
        }
        if (!Main.isEqual(Main.calcTaylorForm(0.5), Main.calcTaylorSeries(0.5, Main.calcENum(1)))) {
            System.out.println("Ok");
        } else {
            System.out.println("Oh oh(");
        }
    }
}