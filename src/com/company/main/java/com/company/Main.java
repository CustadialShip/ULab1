package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("k (k > 0): ");
            int kDegree = sc.nextInt();
            if (kDegree < 0) {
                throw new Exception("k must be bigger then 0");
            }

            System.out.println("x [ -1 , 1 ): ");
            double xNumber = sc.nextDouble();
            if (xNumber < -1 || xNumber >= 1) {
                throw new Exception("x must be [ -1 , 1 )");
            }
            double e = Math.pow(10, -kDegree);
            double taylorSeries = calcTaylorSeries(xNumber, e);
            double taylorForm = calcTaylorForm(xNumber);
            printComp(taylorSeries, taylorForm);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static double calcTaylorSeries(double xNum, double eNumComp) {
        double result = xNum;
        double memberRow = xNum;
        int counter = 2;
        while (memberRow > eNumComp) {
            memberRow = Math.pow(xNum, counter) / counter;
            result += memberRow;
            counter++;
        }
        return -result;
    }

    public static void printComp(double a, double b) {
        NumberFormat formatter = new DecimalFormat("#0.000");

        int aNewFormat = (int) (a * 1000);
        int bNewFormat = (int) (b * 1000);

        if (aNewFormat == bNewFormat) {
            System.out.println(formatter.format(a) + " == " + formatter.format(b));
        } else {
            System.out.println(formatter.format(a) + " != " + formatter.format(b));
        }

    }

    public static double calcTaylorForm(double xNum) {
        return Math.log(1 - xNum);
    }

}


