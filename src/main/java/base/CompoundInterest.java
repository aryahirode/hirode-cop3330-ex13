/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.util.Scanner;

public class CompoundInterest {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        CompoundInterest myApp = new CompoundInterest();
        myApp.output();
    }

    private int principalPrompt() {
        System.out.print("What is the principal amount? ");
        return Integer.parseInt(in.nextLine());
    }

    private double ratePrompt() {
        System.out.print("What is the rate? ");
        return Double.parseDouble(in.nextLine());
    }

    private int yearPrompt() {
        System.out.print("What is the number of years? ");
        return Integer.parseInt(in.nextLine());
    }

    private int compoundPrompt() {
        System.out.print("What is the number of times the interest is compounded per year? ");
        return Integer.parseInt(in.nextLine());
    }

    private double calculations(int p, double r, int t, int n) {
        r /= 100;
        return p * Math.pow(1 + (r / n), n * t);
    }

    private void output() {
        int p = principalPrompt();
        double r = ratePrompt();
        int t = yearPrompt();
        int n = compoundPrompt();
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.", p, r, t, n, calculations(p, r, t, n));
    }
}
