package br.com.builder;

import org.junit.Test;

public class CustomerTest {

    @Test
    public void test_builder(){
        Customer customer = Customer.build("John", 30)
                .setPhone("+9911990899089")
                .setAddress("Street 10");

        assert customer.getName().equals("John");
        assert customer.getAge().equals(30);
        assert customer.getPhone().equals("+9911990899089");
        assert customer.getAddress().equals("Street 10");
    }
}
