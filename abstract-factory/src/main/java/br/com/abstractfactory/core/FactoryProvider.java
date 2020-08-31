package br.com.abstractfactory.core;

import br.com.abstractfactory.employee.Employee;
import br.com.abstractfactory.machine.Machine;

public final class FactoryProvider {

    private FactoryProvider(){}

    public static AbstractFactory<?> getFactory(String type){

        if (Machine.class.getSimpleName().equals(type))
            return new MachineFactory();

        if (Employee.class.getSimpleName().equals(type))
            return new EmployeeFactory();

        throw new IllegalArgumentException("Type unknown: " + type);
    }
}