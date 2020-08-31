package br.com.adapter;

public class CarAdapterImpl implements CarAdapter {

    private Car car;

    public CarAdapterImpl(Car car){
        this.car = car;
    }

    @Override
    public Double getSpeed() {
        return car.getSpeed() * FACTOR;
    }
}