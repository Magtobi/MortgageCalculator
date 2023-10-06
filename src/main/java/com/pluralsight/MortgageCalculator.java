package com.pluralsight;

import java.util.Scanner;
public class MortgageCalculator {
    // Mortgage Calculator
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = myScanner.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = myScanner.nextDouble() / 100.0;

        System.out.print("Enter loan term (in years): ");
        int years = myScanner.nextInt();
        double monthlyInterestRate = annualInterestRate / 12.0;
        int numberOfPayments = years * 12;
        double monthlyPayments = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        System.out.println("Monthly mortgage payment: $" + monthlyPayments);
        myScanner.close();
    }
}
