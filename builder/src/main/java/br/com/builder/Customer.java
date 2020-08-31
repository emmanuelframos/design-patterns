package br.com.builder;

/** Builder with mandatory fields. **/
public final class Customer {

    private String name;
    private Integer age;
    private String phone;
    private String address;

    private Customer(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public static Customer build(String name, Integer age){
        return new Customer(name, age);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public Customer setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Customer setAddress(String address) {
        this.address = address;
        return this;
    }
}
