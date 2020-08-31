package br.com.abstractfactory.core;

public interface AbstractFactory<T> {

    T create(String type);

}