package com.kodilla.bank.homework;

public class Application {
    public static void main(String[] args) {
        CashMachine cashMachines[] = new CashMachine[3];
        cashMachines[0] = new CashMachine(new double[]{10,10,5});
        cashMachines[1] = new CashMachine(new double[]{10,10,-5});
        cashMachines[2] = new CashMachine(new double[]{10.0});
    }
}
