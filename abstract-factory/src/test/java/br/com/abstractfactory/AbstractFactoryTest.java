package br.com.abstractfactory;


import br.com.abstractfactory.core.AbstractFactory;
import br.com.abstractfactory.core.FactoryProvider;
import br.com.abstractfactory.employee.Employee;
import br.com.abstractfactory.employee.Manager;
import br.com.abstractfactory.employee.Secretary;
import br.com.abstractfactory.machine.Machine;
import br.com.abstractfactory.machine.Printer;
import br.com.abstractfactory.machine.Scanner;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void test_secretary(){
        AbstractFactory<?> employeeFactory = FactoryProvider.getFactory(Employee.class.getSimpleName());
        Employee secretary = (Employee) employeeFactory.create(Secretary.class.getSimpleName());
        assert secretary instanceof Secretary;
        secretary.executeTask();
    }

    @Test
    public void test_manager(){
        AbstractFactory<?> employeeFactory = FactoryProvider.getFactory(Employee.class.getSimpleName());
        Employee manager = (Employee) employeeFactory.create(Manager.class.getSimpleName());
        assert manager instanceof Manager;
        manager.executeTask();
    }

    @Test
    public void test_printer(){
        AbstractFactory<?> machineFactory = FactoryProvider.getFactory(Machine.class.getSimpleName());
        Machine printer = (Machine) machineFactory.create(Printer.class.getSimpleName());
        assert printer instanceof Printer;
        printer.executeTask();
    }

    @Test
    public void test_scanner(){
        AbstractFactory<?> scannerFactory = FactoryProvider.getFactory(Machine.class.getSimpleName());
        Machine scanner = (Machine) scannerFactory.create(Scanner.class.getSimpleName());
        assert scanner instanceof Scanner;
        scanner.executeTask();
    }
}
