package br.com.abstractfactory.core;

import br.com.abstractfactory.machine.Machine;
import br.com.abstractfactory.machine.Printer;
import br.com.abstractfactory.machine.Scanner;

public class MachineFactory implements AbstractFactory<Machine> {

    public Machine create(String type){
        if (Printer.class.getSimpleName().equals(type))
            return new Printer();

        if (Scanner.class.getSimpleName().equals(type))
            return new Scanner();

        throw new IllegalArgumentException("Type unknown: " + type);
    }
}
