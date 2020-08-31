package br.com.adapter;

import org.junit.Test;

public class CarAdapterTest {

    @Test
    public void test_mph_to_kph(){
        Car mphCar = new Ferrari();
        System.out.println("Car speed in MPH: " + mphCar.getSpeed());

        CarAdapter kphCar = new CarAdapterImpl(mphCar);
        System.out.println("Car speed in KPH: " + kphCar.getSpeed());

        assert (mphCar.getSpeed() * CarAdapter.FACTOR) == kphCar.getSpeed();
    }
}
