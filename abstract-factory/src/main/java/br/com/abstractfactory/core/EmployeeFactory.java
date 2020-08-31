package br.com.abstractfactory.core;

import br.com.abstractfactory.employee.Employee;
import br.com.abstractfactory.employee.Manager;
import br.com.abstractfactory.employee.Secretary;

public class EmployeeFactory implements AbstractFactory<Employee> {

    public Employee create(String type){

        if (Manager.class.getSimpleName().equals(type))
            return new Manager();

        if (Secretary.class.getSimpleName().equals(type))
            return new Secretary();

        throw new IllegalArgumentException("Type unknown: " + type);
    }
}
