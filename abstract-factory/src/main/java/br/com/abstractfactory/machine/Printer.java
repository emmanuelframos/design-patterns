package br.com.abstractfactory.machine;

public class Printer implements Machine {

    public void executeTask() {
        System.out.println("Printing...");
    }
}
